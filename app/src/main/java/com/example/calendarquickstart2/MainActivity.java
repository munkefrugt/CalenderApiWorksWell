package com.example.calendarquickstart2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // we are getting the desired arival time in (type)DateTime and the destinationfrom the calendar api.
    // convert time to unix time
    //
    // send the 3 inputs to the Directions class, togther with the point of origin, that we get from the user.
    // to to return the departure.
    // We send the departure time to the alarm clock, that sets the time some time erlier than the departure,
    // default 60 minnuttes.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent= new Intent(getApplicationContext(),Calendar.class);
                startActivity(intent);
            }
        });

        // get the data:
        // example of to values.
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value = extras.getString("Extra String");
            Log.i("TAG",value);
            String value2 = extras.getString("Extra String2");
            Log.i("TAG",value2);

            String value3 = extras.getString("Extra String3");
            Log.i("TAG",value3);
            String value4 = extras.getString("Extra String4");
            Log.i("TAG",value4);
            String value5 = extras.getString("Extra String5");
            Log.i("TAG",value5);
            String value6 = extras.getString("Extra String6");
            Log.i("TAG",value6);

            //String value6 = extras.getString("Extra String4");
            //Log.i("TAG",value6);

            TextView view = (TextView) findViewById(R.id.edit_departure);
            view.setText(value);

            TextView view2 = (TextView) findViewById(R.id.headSign);
            view2.setText(value2);

            TextView view3 = (TextView) findViewById(R.id.duration);
            view3.setText(value3);

            TextView view4 = (TextView) findViewById(R.id.lineShortName);
            view4.setText(value4);

            TextView view5 = (TextView) findViewById(R.id.arrival_time_directions);
            view5.setText(value5);

            TextView view6 = (TextView) findViewById(R.id.start_Adress);
            view6.setText(value6);

        }


    }

    //**********************************************************************************************
    //**********************************************************************************************
    public void goToGsonActivity(View view)
    {
        //Den helt skrabede version.
        // husk at når der skabes en ny activity skal man vælge en empty activity da der skal laves en parent:
        // her er linket:
        // http://developer.android.com/training/basics/firstapp/starting-activity.html
        // Så skaber den selv alle de ander xml filer der er nødvendige.

        // this er context, som skal sendes med.
        //Intent intent = new Intent(this, Main2Activity.class);

        //send data med:

        String valueName= "Hi there";
        // lad være med at ændre på "Extra String",

        /*
        intent.putExtra("Extra String",valueName);
        String valueName2="Hello again!";
        intent.putExtra("Extra String2",valueName2);
        */

        // shtart the new activity

        Intent intentGson = new Intent(getApplicationContext(), Directions.class);
        startActivity(intentGson);


    }
    //**********************************************************************************************
    //**********************************************************************************************



}
