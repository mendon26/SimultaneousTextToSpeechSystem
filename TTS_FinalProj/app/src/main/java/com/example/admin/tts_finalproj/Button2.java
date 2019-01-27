package com.example.admin.tts_finalproj;

import android.media.AudioManager;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;


public class Button2 extends MainActivity {
    TextToSpeech t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        t1 = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    setVolumeControlStream(AudioManager.STREAM_MUSIC);

                }
            }
        });
        String list1[]={"Good Morning","Good Afternoon","Good Evening","Thank you","Welcome","Sorry","Excuse Me","Can I have some water?","where is the toilet?","what is your name?"};
        ListAdapter name= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1);
        ListView listView=(ListView) findViewById(R.id.listView);
        listView.setAdapter(name);
        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String templ= String.valueOf(parent.getItemAtPosition(position));
                        t1.speak(templ, TextToSpeech.QUEUE_FLUSH, null);
                    }
                }
        );
    }
}
