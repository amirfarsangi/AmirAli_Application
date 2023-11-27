package com.example.amirali_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Array_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array);
        EditText inputuser = (EditText) findViewById(R.id.inputuser);
        Button btnadd = (Button) findViewById(R.id.btnadd);
        TextView showuser=(TextView) findViewById(R.id.showuser);

        ArrayList<String> list = new ArrayList<>();

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list.add(inputuser.getText().toString());
                String temp = "";
                for (int i = 0; i < list.size(); i++) {

                    temp += list.get(i) + "\n";

                }
                showuser.setText(temp + "");
            }
        });


    }
}