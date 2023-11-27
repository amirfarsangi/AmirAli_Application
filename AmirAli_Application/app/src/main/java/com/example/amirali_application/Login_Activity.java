package com.example.amirali_application;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.vdx.designertoast.DesignerToast;

public class Login_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EditText Username = (EditText) findViewById(R.id.edittextusernam);
        EditText Password = (EditText) findViewById(R.id.editTextPassword);
        Button Login_btn = (Button) findViewById(R.id.loginbtn);


        Login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("amirali")&& Password.getText().toString().equals("123")){
                    DesignerToast.Success(Login_Activity.this, "Success", "Helo amirali", Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);
                    Intent intentcal=new Intent(Login_Activity.this,Calculator_Activity.class);
                    intentcal.putExtra("amirali","123");
                    startActivity(intentcal);


                } else if (Username.getText().toString().equals("hojat")&& Password.getText().toString().equals("456")) {
                    DesignerToast.Success(Login_Activity.this, "Success", "Helo hojat",Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);

                    Intent intentArray=new Intent(Login_Activity.this,Array_Activity.class);
                    intentArray.putExtra("hojat","456");
                    startActivity(intentArray);


                } else if (Username.getText().toString().equals("farsangi")&& Password.getText().toString().equals("789")) {
                    DesignerToast.Success(Login_Activity.this, "Success", "Helo farsangi",Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);

                    Intent intentFarsangi=new Intent(Login_Activity.this,Farsangi_Activity.class);
                    intentFarsangi.putExtra("farsangi","789");
                    startActivity(intentFarsangi);

                }else DesignerToast.Error(Login_Activity.this, "error!","Username and password are wrong",Gravity.CENTER, Toast.LENGTH_SHORT,DesignerToast.STYLE_DARK);

            }
        });
    }
}