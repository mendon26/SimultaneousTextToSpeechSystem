package com.example.admin.tts_finalproj;

import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class Button3 extends AppCompatActivity {

    TextToSpeech t1;

    ImageButton b1, b2, b3, b4, b5;
    Button b6, b7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);
        b1 = (ImageButton) findViewById(R.id.right);
        b2 = (ImageButton) findViewById(R.id.left);
        b3 = (ImageButton) findViewById(R.id.straight);
        b4 = (ImageButton) findViewById(R.id.uturn);
        b5 = (ImageButton) findViewById(R.id.stop);
        b6 = (Button) findViewById(R.id.slow);
        b7 = (Button) findViewById(R.id.fast);


        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    setVolumeControlStream(AudioManager.STREAM_MUSIC);
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "right";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "left";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "straight";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "u Turn";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "Stop";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "Slow";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String toSpeak = "Fast";
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);

            }
        });

    }
}
