package com.example.jnidemo;

import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    String text = NDKTools.getStringFromNDK();
    Log.i("ndk log", "text=" + text);
    ((TextView) findViewById(R.id.tv)).setText(text);
  }
}
