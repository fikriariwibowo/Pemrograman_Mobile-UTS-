package com.example.windows.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_lingkaran);

        tv = (TextView)findViewById(R.id.tv);
        Intent i = getIntent();
        String nilai = i.getStringExtra("nilai");
        tv.setText(nilai);
    }
}
