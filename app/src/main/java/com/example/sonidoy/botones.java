package com.example.sonidoy;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class botones extends AppCompatActivity {

    ImageButton btnChumimi, btnProxima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botones);

        btnChumimi = findViewById(R.id.chumimi);
        btnProxima = findViewById(R.id.HastaLaProxima);

        btnChumimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.chumimi);
                mp.start();
            }
        });

        btnProxima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mp = MediaPlayer.create(botones.this, R.raw.hasta);
                mp.start();
            }
        });

    }
}