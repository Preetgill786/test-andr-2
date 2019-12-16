package com.example.AndroidTest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.Dharamtest.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    Spinner sp_countries;
    ImageView iv_flag;
    TextView tv_cap;
    ListView lv_poi;
    public static String title = "";
    String arr[] = {"Canada", "USA", "England"};
    List<String > listdata = new ArrayList<>();
    LVAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        sp_countries = findViewById(R.id.sp_cuntaries);
        lv_poi= findViewById(R.id.lv_poi);
        iv_flag = findViewById(R.id.iv_flag);
        tv_cap = findViewById(R.id.tv_cap);




        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, arr);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        sp_countries.setAdapter(spinnerArrayAdapter);

        sp_countries.setOnItemSelectedListener(this);

        lv_poi.setOnItemClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

if(position==0){
       iv_flag.setImageResource(R.drawable.ca);
       tv_cap.setText("Ottawa");

       listdata.clear();
    listdata.add("Niagara falls");
    listdata.add("CN Tower");
    listdata.add("The Butchart Gardens");
    listdata.add("Notre-Dame Basilica");

     adapter = new LVAdapter(this, listdata);
     lv_poi.setAdapter(adapter);
}
            if(position==1){
                iv_flag.setImageResource(R.drawable.us);
                tv_cap.setText("Wahington");
                listdata.clear();

                listdata.add("The Statue of Liberty");
                listdata.add("The White House");
                listdata.add("Tims Square");
                adapter = new LVAdapter(this, listdata);
                lv_poi.setAdapter(adapter);


            }


            if(position==2){
                iv_flag.setImageResource(R.drawable.eng);
                tv_cap.setText("London");
                listdata.clear();
                listdata.add("Big Ben");
                listdata.add("Westminster Abbeyr");
                listdata.add("Hyde Park");
                adapter = new LVAdapter(this, listdata);
                lv_poi.setAdapter(adapter);

            }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent i = new Intent(MainActivity.this, FullImgActivity.class);

        title = listdata.get(position);

        startActivity(i);

    }
}
