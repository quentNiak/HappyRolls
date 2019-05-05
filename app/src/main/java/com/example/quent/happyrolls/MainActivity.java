package com.example.quent.happyrolls;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_main);

        Button createIceButton = (Button) findViewById(R.id.createIceButton);

        createIceButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ChooseBaseActivity.class);
                Toast.makeText(getApplicationContext(),"ECRAN ACCUEIL: ALLER AU CHOIX DE LA BASE",Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();

            }

        });

    }

}
