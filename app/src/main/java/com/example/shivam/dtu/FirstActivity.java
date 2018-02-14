package com.example.shivam.dtu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

     View progressBar;

    @Override
    protected void onResume() {
        super.onResume();
        if(progressBar!=null)
        progressBar.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        progressBar=findViewById(R.id.progressBar);
        progressBar.setVisibility(View.INVISIBLE);

        Button button = (Button)findViewById(R.id.getStartedButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                progressBar.setVisibility(View.VISIBLE);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrøace();ø
//                }
                Intent intent = new Intent(FirstActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
