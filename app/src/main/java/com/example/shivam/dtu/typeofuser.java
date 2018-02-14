package com.example.shivam.dtu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class typeofuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typeofuser);

        Button members,guest;


        members=findViewById(R.id.members);
        members.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(typeofuser.this,FirstActivity.class);
                startActivity(i);
            }
        });

        guest=findViewById(R.id.guest);
        guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(typeofuser.this,guestpage.class);
                startActivity(i);
            }
        });
    }
}
