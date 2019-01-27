package com.example.admin.tts_finalproj;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageButton;
import android.widget.EditText;



public class MainActivity extends Activity {
    TextToSpeech t1;
    EditText ed1;
    ImageButton b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.editText);
        b1 = (ImageButton) findViewById(R.id.button);
        b2=(ImageButton) findViewById(R.id.clear);
        b3=(ImageButton) findViewById(R.id.stopsaying);
        b4=(ImageButton) findViewById(R.id.addt);

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
                String toSpeak = ed1.getText().toString().trim();
                t1.speak(toSpeak, TextToSpeech.QUEUE_FLUSH, null);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.stop();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String newtemp = ed1.getText().toString().trim();

            }
        });
    }

    public void SettingsActivity(View view) {

        Intent intent = new Intent();
        intent.setAction("com.android.settings.TTS_SETTINGS");
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        this.startActivity(intent);

    }

    public void numeric(View view){
        Intent intent4 = new Intent(MainActivity.this,numbers
                .class);
        startActivity(intent4);
    }

    public void Button2(View view) {
        Intent intent2 = new Intent(MainActivity.this, Button2.class);
        startActivity(intent2);

    }

    public void Button3(View view){
        Intent intent3= new Intent(MainActivity.this, Button3.class);
        startActivity(intent3);
    }

    public void onPause(){
        if(t1 !=null){
            t1.stop();
        }
        super.onPause();
    }


}




