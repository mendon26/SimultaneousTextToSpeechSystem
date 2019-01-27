package com.example.admin.tts_finalproj;

import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.Locale;

public class numbers extends AppCompatActivity {

    TextToSpeech t1;

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        b1 = (Button) findViewById(R.id.One);
        b2 = (Button) findViewById(R.id.Two);
        b3 = (Button) findViewById(R.id.Three);
        b4 = (Button) findViewById(R.id.Four);
        b5 = (Button) findViewById(R.id.Five);
        b6 = (Button) findViewById(R.id.Six);
        b7 = (Button) findViewById(R.id.Seven);
        b8 = (Button) findViewById(R.id.Eight);
        b9 = (Button) findViewById(R.id.Nine);
        b0 = (Button) findViewById(R.id.Zero);
        bp = (Button) findViewById(R.id.Point);


        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR)
                    setVolumeControlStream(AudioManager.STREAM_MUSIC);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "1";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "2";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "3";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "4";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "5";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "6";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "7";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "8";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "9";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "0";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
        bp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "point";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
                
            }
        });
    }}

