package com.example.a222viewgroups_sharedpref_appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class HealthMonitoringSystemActivity extends AppCompatActivity {

    private static final String TAG = "---DEN--- Health monitoring system";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_monitoring_system);

        final EditText editTextFIO = (EditText) findViewById(R.id.editTextFIO);
        final EditText editTextAge = (EditText) findViewById(R.id.editTextAge);


        Log.i(TAG, "Информационное сообщение при старте программы Health monitoring system");

        final TextView varTextView = (TextView) findViewById(R.id.textView);

        Button buttonSave = (Button) findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener(){
                                          @Override
                                          public void onClick(View v) {
                                              int age = 0;
                                              boolean success = false;
                                              String errorMessage = "некорректное занчение в поле ВОЗРАСТ !!!";

                                              if (isCorrectInt(editTextAge.getText().toString(), 0, 150, errorMessage)) {
                                                  age = Integer.parseInt(editTextAge.getText().toString());
                                                  success = true;
                                              } else {
                                                  Log.e(TAG, errorMessage);
                                                  Toast.makeText(HealthMonitoringSystemActivity.this, errorMessage, Toast.LENGTH_LONG).show();
                                                  editTextAge.setText("");
                                              }

                                              if (success) {
                                                  Patient patient = new Patient(editTextFIO.getText().toString(), age);
                                                  Toast.makeText(HealthMonitoringSystemActivity.this, patient.toString(), Toast.LENGTH_LONG).show();
                                                  varTextView.setText(patient.toString());
                                              } else {
                                                  Log.e(TAG, errorMessage + " на экране HealthMonitoringSystemActivity ");
                                                  editTextAge.setText("");
                                              }

                                          }
                                      }
        );

        Button buttonPressure = (Button) findViewById(R.id.buttonPressure);
        buttonPressure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthMonitoringSystemActivity.this, PressureActivity.class);
                startActivity(intent);
            }
        });

        Button buttonHealthIndicator = (Button) findViewById(R.id.buttonHealthIndicator);
        buttonHealthIndicator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HealthMonitoringSystemActivity.this, HealthIndicatorActivity.class);
                startActivity(intent);

                //MainActivity.this.finish();
            }
        });

    }

    public boolean isCorrectInt(String inputText, int min, int max, String messageText) {
        boolean result = false;
        try {
            int inputInt = Integer.parseInt(inputText);
            if (inputInt <= max && inputInt >= min){
                result = true;
            } else {
                Log.e(TAG, "Введено " + messageText);
                Toast.makeText(HealthMonitoringSystemActivity.this, messageText + " Введите число от " + min + " до " + max, Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Log.e(TAG, "Введено " + messageText);
            Toast.makeText(HealthMonitoringSystemActivity.this, "Введите число от " + min + " до " + max, Toast.LENGTH_LONG).show();
        }
        return result;
    }
}
