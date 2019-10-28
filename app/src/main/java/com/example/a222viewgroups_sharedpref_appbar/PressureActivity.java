package com.example.a222viewgroups_sharedpref_appbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;


public class PressureActivity extends AppCompatActivity {

    private static final String TAG = "---DEN--- Health monitoring system --- 2019";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pressure);

        final EditText editTextUpPressure = (EditText) findViewById(R.id.editTextUpPressure);
        final EditText editTextDownPressure = (EditText) findViewById(R.id.editTextDownPressure);
        final EditText editTextPulse = (EditText) findViewById(R.id.editTextPulse);
        final CheckBox checkBoxTachycardia = (CheckBox) findViewById(R.id.checkBoxTachycardia);
        final EditText editTextDate = (EditText) findViewById(R.id.editTextDate);

        Button buttonPressureSave = (Button) findViewById(R.id.buttonPressureSave);
        buttonPressureSave.setOnClickListener(new View.OnClickListener(){
                                          @Override
                                          public void onClick(View v) {
                                              int age = 0;
                                              int maxAge = 150;
                                              boolean success = false;

                                              if (
                                                      isCorrect(editTextUpPressure.getText().toString(), 1, 300, "Некорректное значение верхнего давления")
                                                      &&
                                                      isCorrect(editTextDownPressure.getText().toString(), 1, 300, "Некорректное значение нижнего давления")
                                                      &&
                                                      isCorrect(editTextPulse.getText().toString(), 1, 200, "Некорректное значение пульса")
                                                      ){
                                                  int upPressure = Integer.parseInt(editTextUpPressure.getText().toString());
                                                  int downPressure = Integer.parseInt(editTextDownPressure.getText().toString());
                                                  int pulse = Integer.parseInt(editTextPulse.getText().toString());
                                                  boolean tachycardia = checkBoxTachycardia.isChecked();
                                                  String date = editTextDate.getText().toString();
                                                  Pressure pressure = new Pressure(upPressure, downPressure, pulse, tachycardia, date);
                                                  Toast.makeText(PressureActivity.this, pressure.toString(), Toast.LENGTH_LONG).show();
                                              } else {
                                                  Log.e(TAG, "Введено некорректное занчение на экране  PressureActivity !!! ");
                                              }
                                          }
                                      }
        );


    }

    public boolean isCorrect(String inputText, int min, int max, String messageText) {
        boolean result = false;
        try {
            int inputInt = Integer.parseInt(inputText);
            if (inputInt <= max && inputInt >= min){
                result = true;
            } else {
                Log.e(TAG, "Введено " + messageText);
                Toast.makeText(PressureActivity.this, messageText + " Введите число от " + min + " до " + max, Toast.LENGTH_LONG).show();
            }
        } catch (Exception e) {
            Toast.makeText(PressureActivity.this, "Введите число от " + min + " до " + max, Toast.LENGTH_LONG).show();
        }
        return result;
    }
}
