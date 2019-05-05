package com.example.quent.happyrolls;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class ChooseBaseActivity extends AppCompatActivity {

    IceCream iceCream = new IceCream();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_base);
        Toolbar toolbar = (Toolbar) findViewById(R.id.chooseBaseToolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.chooseBaseFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(ChooseBaseActivity.this, ChooseToppingActivity.class);
//                Toast.makeText(getApplicationContext(), "BASE VANILLE: ALLER AU CHOIX DES TOPPINGS", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        setContentView(R.layout.activity_choose_base);

        //final IceCream iceCream = new IceCream();

        ImageButton natureBaseChoice = (ImageButton) findViewById(R.id.natureButton);
        ImageButton milkBaseChoice = (ImageButton) findViewById(R.id.milkButton);
        ImageButton vanillaBaseChoice = (ImageButton) findViewById(R.id.vanillaButton);

        natureBaseChoice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String base;
                base = "Nature";
                iceCream.setBase(base);
                //System.out.println(iceCream.getBase());
//                Intent intent = new Intent(ChooseBaseActivity.this, ChooseToppingActivity.class);
//                Toast.makeText(getApplicationContext(), "BASE NATURE: ALLER AU CHOIX DES TOPPINGS", Toast.LENGTH_SHORT).show();
//                startActivity(intent);
//                finish();

            }

        });

        milkBaseChoice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String base;
                base = "Yahourt";
                iceCream.setBase(base);
                //System.out.println(iceCream.getBase());
//                Intent intent = new Intent(ChooseBaseActivity.this, ChooseToppingActivity.class);
//                Toast.makeText(getApplicationContext(), "BASE YAHOURT: ALLER AU CHOIX DES TOPPINGS", Toast.LENGTH_SHORT).show();
//                startActivity(intent);
//                finish();

            }

        });

        vanillaBaseChoice.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String base;
                base = "Vanille";
                iceCream.setBase(base);
                //System.out.println(iceCream.getBase());
//                Intent intent = new Intent(ChooseBaseActivity.this, ChooseToppingActivity.class);
//                Toast.makeText(getApplicationContext(), "BASE VANILLE: ALLER AU CHOIX DES TOPPINGS", Toast.LENGTH_SHORT).show();
//                startActivity(intent);
//                finish();

            }

        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.chooseBaseFab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(ChooseBaseActivity.this, ChooseToppingActivity.class);
//                Toast.makeText(getApplicationContext(), "BASE VANILLE: ALLER AU CHOIX DES TOPPINGS", Toast.LENGTH_SHORT).show();
                startActivity(intent);
                finish();
            }
        });

    }
}