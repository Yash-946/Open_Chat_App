package com.example.unsavedwhatsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText phonenumber,message;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        phonenumber=findViewById(R.id.editTextTextPersonName);
        message=findViewById(R.id.editTextTextPersonName2);
        button=findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg = message.getText().toString();
                String no=phonenumber.getText().toString();


                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse(("http://api.whatsapp.com/send?phone="+"+91"+no+ "&text="+msg)));
//                intent.setData(Uri.parse(("http://api.whatsapp.com/send?phone="+"+91"+no+ "&text="+msg)));
                startActivity(intent);
            }
        });


    }


}