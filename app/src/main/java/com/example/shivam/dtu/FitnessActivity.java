package com.example.shivam.dtu;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.gms.auth.api.signin.GoogleSignIn;

public class FitnessActivity extends AppCompatActivity {

    ImageView id;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_fitness,menu);
        id=findViewById(R.id.userid);
        id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, 1888);
            }
        });
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        EditText text = (EditText)findViewById(R.id.dateOB);
        String Name = GoogleSignIn.getLastSignedInAccount(this).getDisplayName();
        String DateOfBirth = text.getText().toString().trim();
        text = (EditText)findViewById(R.id.height);
        int Height = Integer.parseInt(text.getText().toString().trim());
        text = (EditText)findViewById(R.id.weight);
        int Weight = Integer.parseInt(text.getText().toString().trim());

        Log.v("yo",Name+" "+DateOfBirth+" "+Height);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);
    }
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1888 && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            id.setImageBitmap(photo);
        }

    }
}
