package list.car.com.carlistandroid.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import list.car.com.carlistandroid.Fragments.CarDetailFragment;
import list.car.com.carlistandroid.Models.VehVendorAvails;
import list.car.com.carlistandroid.R;

/**
 * An activity representing a single Car detail screen. This
 * activity is only used on narrow width devices. On tablet-size devices,
 * item details are presented side-by-side with a list of items
 * in a {@link CarListActivity}.
 */
public class CarDetailActivity extends AppCompatActivity {

     TextView VehMakeModelName;
     TextView AirConditionInd;
     TextView TransmissionType;
     TextView FuelType;
     TextView DriveType;
     TextView PassengerQuantity;
     TextView BaggageQuantity;
     TextView Code;
     TextView CodeContext;
     TextView DoorCount;
     ImageView imageCar;

     TextView RateTotalAmount;
     TextView EstimatedTotalAmount;
     TextView CurrencyCode;
     TextView VendorCode;
     TextView VendorName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car_detail);
        Toolbar toolbar = (Toolbar) findViewById(R.id.detail_toolbar);
        setSupportActionBar(toolbar);

        VehMakeModelName = findViewById(R.id.VehMakeModelName);
        AirConditionInd = findViewById(R.id.AirConditionInd);
        TransmissionType = findViewById(R.id.TransmissionType);
        FuelType = findViewById(R.id.FuelType);
        DriveType = findViewById(R.id.DriveType);
        PassengerQuantity = findViewById(R.id.PassengerQuantity);
        BaggageQuantity = findViewById(R.id.BaggageQuantity);
        Code = findViewById(R.id.Code);
        CodeContext = findViewById(R.id.CodeContext);
        DoorCount = findViewById(R.id.DoorCount);
        RateTotalAmount = findViewById(R.id.RateTotalAmount);
        EstimatedTotalAmount = findViewById(R.id.EstimatedTotalAmount);
        CurrencyCode = findViewById(R.id.CurrencyCode);
        VendorCode = findViewById(R.id.VendorCode);
        VendorName = findViewById(R.id.VendorName);
        imageCar = findViewById(R.id.imageCar);


        try {
            VehMakeModelName.setText(CarListActivity.itemClicked.getVehMakeModel().getName());
            AirConditionInd.setText(CarListActivity.itemClicked.getAirConditionInd() ? "Air Condition: Yes" : "Air Condition: No");
            TransmissionType.setText("Transmission: " + CarListActivity.itemClicked.getTransmissionType());
            FuelType.setText("Fuel Type: " + CarListActivity.itemClicked.getFuelType());
            DriveType.setText("Drive Type: " + CarListActivity.itemClicked.getDriveType());
            PassengerQuantity.setText("Passenger: " + CarListActivity.itemClicked.getPassengerQuantity());
            BaggageQuantity.setText("Baggage: " + CarListActivity.itemClicked.getBaggageQuantity());
            Code.setText("Code: " +CarListActivity.itemClicked.getCode());
            CodeContext.setText("CodeContext: " + CarListActivity.itemClicked.getCodeContext());
            DoorCount.setText("DoorCount: " + CarListActivity.itemClicked.getDoorCount());

            RateTotalAmount.setText("Rate Total Amount Name: " + ((VehVendorAvails) CarListActivity.itemClicked.getObjectParent()).getVehAvails().get(0).getTotalCharge().getRateTotalAmount());
            EstimatedTotalAmount.setText("Estimated Total Amount: " + ((VehVendorAvails) CarListActivity.itemClicked.getObjectParent()).getVehAvails().get(0).getTotalCharge().getEstimatedTotalAmount());
            CurrencyCode.setText("Currency Code: " + ((VehVendorAvails) CarListActivity.itemClicked.getObjectParent()).getVehAvails().get(0).getTotalCharge().getCurrencyCode());
            VendorCode.setText("Vendor Code: " + ((VehVendorAvails) CarListActivity.itemClicked.getObjectParent()).getVendor().getCode());
            VendorName.setText("Vendor Name: " + ((VehVendorAvails) CarListActivity.itemClicked.getObjectParent()).getVendor().getName());
        }catch (Exception e){
            e.printStackTrace();
        }


        imageCar.setImageBitmap(null);
        Picasso.with(imageCar.getContext()).load(CarListActivity.itemClicked.getPictureURL()).fit().centerCrop().into(imageCar);


        // Show the Up button in the action bar.
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        // savedInstanceState is non-null when there is fragment state
        // saved from previous configurations of this activity
        // (e.g. when rotating the screen from portrait to landscape).
        // In this case, the fragment will automatically be re-added
        // to its container so we don't need to manually add it.
        // For more information, see the Fragments API guide at:
        //
        // http://developer.android.com/guide/components/fragments.html
        //
        if (savedInstanceState == null) {
            // Create the detail fragment and add it to the activity
            // using a fragment transaction.
            Bundle arguments = new Bundle();
            arguments.putString(CarDetailFragment.ARG_ITEM_ID,
                    getIntent().getStringExtra(CarDetailFragment.ARG_ITEM_ID));
            CarDetailFragment fragment = new CarDetailFragment();
            fragment.setArguments(arguments);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.car_detail_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            // This ID represents the Home or Up button. In the case of this
            // activity, the Up button is shown. For
            // more details, see the Navigation pattern on Android Design:
            //
            // http://developer.android.com/design/patterns/navigation.html#up-vs-back
            //
            navigateUpTo(new Intent(this, CarListActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
