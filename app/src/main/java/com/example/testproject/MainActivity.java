package com.example.testproject;

import android.os.Bundle;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1= (Button) findViewById(R.id.button1);
        Button btn2= (Button) findViewById(R.id.button2);
        btn1.setOnClickListener( new OnClickListener() {
            public void onClick (View v){
                Toast.makeText(getApplicationContext(), "You pressed button 1", Toast.LENGTH_LONG).show();
            }
        });
        btn2.setOnClickListener(new OnClickListener () {
            public void onClick (View v) {
                Toast.makeText(getApplicationContext() , "You pressed button 2", Toast.LENGTH_LONG).show();
            }
        });
            }
        }


