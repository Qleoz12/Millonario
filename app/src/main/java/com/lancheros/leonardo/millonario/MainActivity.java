package com.lancheros.leonardo.millonario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start_game(View view)
    {
        Intent i= new Intent(this,first_q.class);
        startActivity(i);
    }

    public void about_game(View view)
    {
        Intent i= new Intent(this,About.class);
        startActivity(i);
    }
}
