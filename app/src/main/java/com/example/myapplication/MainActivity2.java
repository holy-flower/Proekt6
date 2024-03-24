package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home){
                    Toast.makeText(MainActivity2.this, "Домой", Toast.LENGTH_LONG).show();
                    return true;
                }
                else if (item.getItemId() == R.id.settings){
                    Toast.makeText(MainActivity2.this, "Настройки", Toast.LENGTH_LONG).show();
                    return true;
                }
                else if(item.getItemId() == R.id.notification){
                    Toast.makeText(MainActivity2.this, "Уведомления", Toast.LENGTH_LONG).show();
                    return true;
                }
                return false;
            }
        });
    }
}
