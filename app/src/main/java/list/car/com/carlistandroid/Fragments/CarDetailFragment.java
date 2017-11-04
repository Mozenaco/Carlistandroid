package list.car.com.carlistandroid.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import list.car.com.carlistandroid.Activities.CarDetailActivity;
import list.car.com.carlistandroid.Activities.CarListActivity;
import list.car.com.carlistandroid.Models.Vehicle;
import list.car.com.carlistandroid.R;

/**
 * A fragment representing a single Car detail screen.
 * This fragment is either contained in a {@link CarListActivity}
 * in two-pane mode (on tablets) or a {@link CarDetailActivity}
 * on handsets.
 */
public class CarDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    private Vehicle vehicle;

    private String VehMakeModelName;
    /**
     * The dummy content this fragment is presenting.
     */

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public CarDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.

            vehicle = (Vehicle) getArguments().getSerializable("Vehicle");

            //vehicle = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
            VehMakeModelName = (String) getArguments().getString("VehMakeModelName");


            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
            //    appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.car_detail, container, false);

        // Show the dummy content as text in a TextView.
        if (vehicle != null) {
            ((TextView) rootView.findViewById(R.id.car_detail)).setText(vehicle.getCodeContext());
        }
        ((TextView) rootView.findViewById(R.id.car_detail)).setText(VehMakeModelName);

        return rootView;
    }
}
