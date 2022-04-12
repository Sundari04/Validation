package com.example.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.btn1);
        TextView Uname=(TextView) findViewById(R.id.uname);
        TextView Uname1=(TextView) findViewById(R.id.uname1);
        TextView Pass=(TextView) findViewById(R.id.pass);
        TextView Pass1=(TextView) findViewById(R.id.pass1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Uname1.getText().toString().matches("[a-zA-Z]+") && (Pass1.getText().toString().matches("[0-9]+"))&&(Pass1.getText().toString().length()==4)){
                    Toast.makeText(getApplicationContext(),"Successful",Toast.LENGTH_SHORT).show();
            }
                else if(!(Uname1.getText().toString().matches("[a-zA-z]+"))){
                    Toast.makeText(getApplicationContext(),"Username should only contain alphabets",Toast.LENGTH_SHORT).show();

                }
                else if(!(Pass1.getText().toString().matches("[0-9]+"))){
                    Toast.makeText(getApplicationContext(),"Password should only contain numbers",Toast.LENGTH_SHORT).show();
                }
                else if(!(Pass1.getText().toString().length() ==4)){
                    Toast.makeText(getApplicationContext(),"Password should not be more than 4 numbers",Toast.LENGTH_SHORT).show();
                }
        } });


        }

    }
