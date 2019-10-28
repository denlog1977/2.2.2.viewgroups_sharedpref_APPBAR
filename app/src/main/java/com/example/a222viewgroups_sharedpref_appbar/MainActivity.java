package com.example.a222viewgroups_sharedpref_appbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
//import android.support.v7.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {

            Toast.makeText(MainActivity.this, "2.2.1 Открыть записную книжку", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);

            return true;

        } else if (id == R.id.action_settings) {

            Toast.makeText(MainActivity.this, "Открыть НАСТРОЙКИ ПРОГРАММЫ", Toast.LENGTH_LONG).show();

        } else if (id == R.id.action_hello_word) {

            Toast.makeText(MainActivity.this, "1.1.1 Открыть самую первую программу Привет Мир!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, FirstActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_splash_screen) {

            Toast.makeText(MainActivity.this, "1.1.2. Открыть ПИНГВИНА!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, SplashScreenActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_subscribe) {

            Toast.makeText(MainActivity.this, "1.2.1. Открыть Подписку!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, SubscribeActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_endlessactivities) {

            Toast.makeText(MainActivity.this, "1.2.2. Открыть бесконечный переход!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, EndlessActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_healthMonitoringSystem) {

            Toast.makeText(MainActivity.this, "1.3. Открыть Система мониторинга здоровья!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, HealthMonitoringSystemActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_view_components_CheckBox) {

            Toast.makeText(MainActivity.this, "2.1.1. Открыть view_components_CheckBox!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, CheckBoxActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_spinner) {

            Toast.makeText(MainActivity.this, "2.1.2. Открыть Spinner!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, SpinnerActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_calendarView) {

            Toast.makeText(MainActivity.this, "2.1.3. Открыть CalendarView!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentNotes);

        } else if (id == R.id.action_open_notes) {

            Toast.makeText(MainActivity.this, "2.2.1. Открыть Записная книжка!", Toast.LENGTH_LONG).show();
            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);

        }


        return super.onOptionsItemSelected(item);
    }


}
