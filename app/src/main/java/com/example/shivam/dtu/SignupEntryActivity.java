package com.example.shivam.dtu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class SignupEntryActivity extends AppCompatActivity {

    static String Name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_entry);

        findViewById(R.id.signUPButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText name = (EditText) findViewById(R.id.name);
                Name = name.getText().toString().trim();

//                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(SignupEntryActivity.this);
//                Toast.makeText(SignupEntryActivity.this, account.getEmail(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
