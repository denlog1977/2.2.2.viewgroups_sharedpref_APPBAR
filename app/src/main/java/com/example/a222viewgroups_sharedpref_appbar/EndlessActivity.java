package com.example.a222viewgroups_sharedpref_appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;

public class EndlessActivity extends AppCompatActivity {

    String imageName = "http://myfile.org/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_endless);

        final TextView textViewImageName = (TextView) findViewById(R.id.textViewImageName);
        textViewImageName.setText(imageName + Integer.toString(new Random().nextInt(100) + 1));

        Button buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EndlessActivity.this.finish();
            }
        });

        Button buttonForward = (Button) findViewById(R.id.buttonForward);
        buttonForward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EndlessActivity.this, EndlessActivity.class);
                startActivity(intent);
            }
        });

    }

}
