package com.example.deeplinking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ConstraintLayout hello = findViewById(R.id.hello);
        TextView textt = findViewById(R.id.textt);

        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                textt.setText("HOW R UUU?????");
               shareIntent();

        }
        });
    }

    private void shareIntent(){

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "https://www.maps.google.com");
        startActivity(Intent.createChooser(intent, "Send to"));
    }
}