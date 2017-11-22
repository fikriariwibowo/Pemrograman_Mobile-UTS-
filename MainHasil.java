package com.example.windows.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainHasil extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        tv = (TextView)findViewById(R.id.tv);
        Intent i = getIntent();
        String nilai = i.getStringExtra("nilai");
        tv.setText(nilai);
    }
}
