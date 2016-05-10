package com.example.calendarquickstart2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class StorageOfVariablesLocationEct extends AppCompatActivity {
    String location;
    String eventStartTime;
    /*
    private final String travelLocation;
    private final String arrivalTime;

    public StorageOfVariablesLocationEct(String travelLocation, String arrivalTime) {
        this.travelLocation = travelLocation;
        this.arrivalTime = arrivalTime;

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_storage_of_variables_location_ect);

        Intent intent = getIntent();
        Log.i("TAG", "onCreate: StorageOfVariablesLocationEct");



        // get the data from main class:
        Bundle extras = getIntent().getExtras();
        // hvis der noget..
        if (extras != null) {
            location = extras.getString("Location String");
            Log.i("location",location);
            eventStartTime = extras.getString("Time String");
            //Log.i("arrivalTime",arrivalTime);


            TextView view = (TextView) findViewById(R.id.location);
            view.setText(location);


        }
        // Now clean the data:
        extractTheTime();

        try {
            Thread.sleep(3000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        try {
            Thread.sleep(10000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        Log.i("Tag", "onCreate: Call Directions");
        // call the gson class
        Intent intentGson = new Intent(getApplicationContext(), Directions.class);

        // send data to the gson class
        String origin= "enghave";
        // lad være med at ændre på "Extra String",

        intentGson.putExtra("origin",origin);
        String destination="emdrup";
        intentGson.putExtra("destination",destination);

        startActivity(intentGson);


    }




    // here we split the DateTime type to something usefull.
    private void extractTheTime() {

        String string = eventStartTime;//"2016-05-04T14:00:00.000+02:00";


        String[] parts = string.split(".000");
        String part1 = parts[0];
        String part2 = parts[1];

        //System.out.println("part1  "+part1);
        //System.out.println("part2  "+ part2);

        String[] splitpart1 = part1.split("T");

        String date = splitpart1[0];
        String theTime = splitpart1[1];


        Log.i("extractTheTime: ", theTime);
        Log.i("extractTheTime: ", date);
        eventStartTime =theTime;

        TextView view1 = (TextView) findViewById(R.id.time);
        view1.setText(eventStartTime);
    }
}
