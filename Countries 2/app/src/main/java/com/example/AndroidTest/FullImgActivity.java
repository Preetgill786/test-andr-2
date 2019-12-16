package com.example.AndroidTest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.Dharamtest.R;

public class FullImgActivity extends AppCompatActivity {

    ImageView iv_full;
    TextView tv_title;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);
        iv_full = findViewById(R.id.iv_full);tv_title=findViewById(R.id.tv_title);
        if(MainActivity.title.equalsIgnoreCase("Niagara falls")){
        iv_full.setImageResource(R.drawable.nigra);
    }

        if(MainActivity.title.equalsIgnoreCase("CN Tower")){
            iv_full.setImageResource( R.drawable.cn);}
        if(MainActivity.title.equalsIgnoreCase("The Butchart Gardens")){
            iv_full.setImageResource(R.drawable.but);}
        if(MainActivity.title.equalsIgnoreCase("Notre-Dame Basilica")){
            iv_full.setImageResource( R.drawable.notr);}
        if(MainActivity.title.equalsIgnoreCase("The Statue of Liberty")){
            iv_full.setImageResource(R.drawable.statue);}
        if(MainActivity.title.equalsIgnoreCase("The White House")){
            iv_full.setImageResource(R.drawable.white);}
        if(MainActivity.title.equalsIgnoreCase("Tims Square")){
            iv_full.setImageResource(R.drawable.tims);}
        if(MainActivity.title.equalsIgnoreCase("Big Ben")){
            iv_full.setImageResource( R.drawable.big);}
        if(MainActivity.title.equalsIgnoreCase("Westminster Abbeyr")){
            iv_full.setImageResource( R.drawable.westmins);}
        if(MainActivity.title.equalsIgnoreCase("Hyde Park")){
            iv_full.setImageResource( R.drawable.hyde);}

        tv_title.setText(MainActivity.title);
    }
}
