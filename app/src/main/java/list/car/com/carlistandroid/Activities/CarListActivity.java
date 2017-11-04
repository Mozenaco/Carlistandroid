package list.car.com.carlistandroid.Activities;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Ordering;
import com.google.common.collect.TreeMultimap;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import list.car.com.carlistandroid.Fragments.CarDetailFragment;
import list.car.com.carlistandroid.Models.VehAvailRSCore;
import list.car.com.carlistandroid.Models.Vehicle;
import list.car.com.carlistandroid.R;
import list.car.com.carlistandroid.dummy.DummyContent;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/**
 * An activity representing a list of Cars. This activity
 * has different presentations for handset and tablet-size devices. On
 * handsets, the activity presents a list of items, which when touched,
 * lead to a {@link CarDetailActivity} representing
 * item details. On tablets, the activity presents the list of items and
 * item details side-by-side using two vertical panes.
 */

public class CarListActivity extends AppCompatActivity {

    /**
     * Whether or not the activity is in two-pane mode, i.e. running on a tablet
     * device.
     */
    private boolean mTwoPane;
    String sURL = "http://www.cartrawler.com/ctabe/cars.json"; // url
    private JsonDownloader jsonDownloader = null;
    VehAvailRSCore vehAvailRSCore;
    TextView tvPickUpDateTime, tvReturnDateTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_list);

        tvPickUpDateTime = (TextView)findViewById(R.id.tvPickUpDateTime);
        tvReturnDateTime = (TextView)findViewById(R.id.tvReturnDateTime);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getTitle());

        if (findViewById(R.id.car_detail_container) != null) {
            // The detail container view will be present only in the
            // large-screen layouts (res/values-w900dp).
            // If this view is present, then the
            // activity should be in two-pane mode.
            mTwoPane = true;
        }

        jsonDownloader = new CarListActivity.JsonDownloader();
        jsonDownloader.execute((Void) null);

    }

    private void setupRecyclerView(@NonNull RecyclerView recyclerView) {

        Multimap<Float, Vehicle> map = TreeMultimap.create(Ordering.natural(), Ordering.arbitrary());//Way to get duplicate keys
        for(int i = 0; i < vehAvailRSCore.getVehVendorAvails().size(); i++) {
            for (int j = 0; j < vehAvailRSCore.getVehVendorAvails().get(i).getVehAvails().size(); j++) {

                map.put(Float.valueOf(vehAvailRSCore.getVehVendorAvails().get(i).getVehAvails().get(j).getTotalCharge().getRateTotalAmount()),
                        vehAvailRSCore.getVehVendorAvails().get(i).getVehAvails().get(j).getVehicle());
            }
        }

        List<Vehicle> vehicles = new ArrayList<>();

        for (Vehicle value : map.values()) {
            vehicles.add(value);//Vehicles ordered by price
        }

        recyclerView.setAdapter(new SimpleItemRecyclerViewAdapter(this, vehicles, mTwoPane));
    }

    public static class SimpleItemRecyclerViewAdapter
            extends RecyclerView.Adapter<SimpleItemRecyclerViewAdapter.ViewHolder> {

        private final CarListActivity mParentActivity;
        private final List<Vehicle> mValues;
        private final boolean mTwoPane;
        private final View.OnClickListener mOnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DummyContent.DummyItem item = (DummyContent.DummyItem) view.getTag();
                if (mTwoPane) {
                    Bundle arguments = new Bundle();
                    arguments.putString(CarDetailFragment.ARG_ITEM_ID, item.id);
                    CarDetailFragment fragment = new CarDetailFragment();
                    fragment.setArguments(arguments);

                    mParentActivity.getSupportFragmentManager().beginTransaction()
                            .replace(R.id.car_detail_container, fragment)
                            .commit();
                } else {
                    Context context = view.getContext();
                    Intent intent = new Intent(context, CarDetailActivity.class);
                    intent.putExtra(CarDetailFragment.ARG_ITEM_ID, item.id);

                    context.startActivity(intent);
                }
            }
        };

        SimpleItemRecyclerViewAdapter(CarListActivity parent,
                                      List<Vehicle> items,
                                      boolean twoPane) {
            mValues = items;
            mParentActivity = parent;
            mTwoPane = twoPane;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.car_list_content, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            //holder.mIdView.setText(mValues.get(position).id);
            holder.mContentView.setText(mValues.get(position).getVehMakeModel().getName());
            //holder.itemView.setTag(mValues.get(position));
            //holder.itemView.setOnClickListener(mOnClickListener);
        }

        @Override
        public int getItemCount() {
            return mValues.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            final TextView mIdView;
            final TextView mContentView;

            ViewHolder(View view) {
                super(view);
                mIdView = view.findViewById(R.id.id_text);
                mContentView = view.findViewById(R.id.content);
            }
        }
    }

    public class JsonDownloader extends AsyncTask<Void, Void, JsonArray> {


        @Override
        protected JsonArray doInBackground(Void... params) {
            JsonArray json = null;
            // Connect to the URL using java's native library
            try {
                URL url = new URL(sURL);
                HttpURLConnection request = null;
                request = (HttpURLConnection) url.openConnection();
                request.connect();
                // Convert to a JSON object to print data
                JsonParser jp = new JsonParser(); //from gson
                JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
                JsonArray rootArray = root.getAsJsonArray(); //May be an array, may be an object.
                json = rootArray;

            } catch (IOException e) {
                e.printStackTrace();
            }

            return json;
        }

        @Override
        protected void onPostExecute(final JsonArray json) {
            //Toast.makeText(getApplicationContext(), json.toString(), Toast.LENGTH_LONG).show();

            JsonObject object = json.get(0).getAsJsonObject().get("VehAvailRSCore").getAsJsonObject();
            Gson gson = new Gson();
            vehAvailRSCore = gson.fromJson(object, VehAvailRSCore.class);

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
            sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

            try {
                Format formatter = new SimpleDateFormat("dd/MM/yyyy - HH:mm:ss");

                tvPickUpDateTime.setText(formatter.format(sdf.parse(vehAvailRSCore.getVehRentalCore().getPickUpDateTime())));
                tvReturnDateTime.setText(formatter.format(sdf.parse(vehAvailRSCore.getVehRentalCore().getReturnDateTime())));

            } catch (ParseException e) {
                e.printStackTrace();
            }

            View recyclerView = findViewById(R.id.car_list);
            assert recyclerView != null;
            setupRecyclerView((RecyclerView) recyclerView);
        }
    }
}
