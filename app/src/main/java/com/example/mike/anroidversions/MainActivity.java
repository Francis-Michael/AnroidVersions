package com.example.mike.anroidversions;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    ListView Listviews;

    ArrayAdapter<String> array_adaptor;

    String[] android_versions = {"Cupcake",
            "Donut",
            "Eclair",
            "Ariyo is fucking boi",
            "Gingerbread",
            "Honeycomb",
            "Ice_cream_sandwich",
            "Jelly_bean",
            "Kitkat",
            "Lollipop"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Listviews = (ListView)findViewById(R.id.list_view);
        array_adaptor= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,android_versions);
        Listviews.setAdapter(array_adaptor);
        Listviews.setOnItemClickListener(new AdapterView.OnItemClickListener(){


            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),parent.getItemAtPosition(position)+ "is selected", Toast.LENGTH_LONG).show();
            }

        });

    }


}
