package com.example.admin.tts_finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity  {
  @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);

      Intent intent = new Intent();
      intent.setAction("com.android.settings.TTS_SETTINGS");
      intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      this.startActivity(intent);

    }


}

