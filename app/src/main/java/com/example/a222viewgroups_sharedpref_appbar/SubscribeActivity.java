package com.example.a222viewgroups_sharedpref_appbar;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SubscribeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscribe);

        final TextView textViewEmailMessage = (TextView) findViewById(R.id.textViewMessage);
        final EditText editTextName = (EditText) findViewById(R.id.editTextName);
        final EditText editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        final EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);

        Button buttonOK = (Button) findViewById(R.id.buttonOK);
        buttonOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEmailMessage.setText("Подписка на рассылку успешно оформлена для пользователя " + editTextName.getText().toString() + " на электронный адрес " + editTextEmail.getText().toString());
            }
        });

        Button buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewEmailMessage.setText("");
                editTextName.setText("");
                editTextEmail.setText("");
                editTextPassword.setText("");
            }
        });

    }
}