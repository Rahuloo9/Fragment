package com.rahul009.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.rahul009.fragmentdemo.fragments.FragmentFirst;
import com.rahul009.fragmentdemo.fragments.FragmentSecond;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button bt=findViewById(R.id.button);
        Button bt1=findViewById(R.id.button1);
        LinearLayout linear=findViewById(R.id.linearlayoutt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentFirst first=new FragmentFirst();
                FragmentTransaction transaction= getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayoutt,first);
                transaction.commit();
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentSecond second=new FragmentSecond();
                FragmentTransaction transaction=getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayoutt,second);
                transaction.commit();
            }
        });
    }
}