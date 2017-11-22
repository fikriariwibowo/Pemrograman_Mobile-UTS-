package com.example.windows.utsmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainSegitiga extends AppCompatActivity {

    TextView tampil;
    EditText masukan, masukan2;
    Button tekan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        tampil = (TextView) findViewById(R.id.text);
        masukan = (EditText) findViewById(R.id.edit1);
        masukan2 = (EditText) findViewById(R.id.edit2);
        tekan = (Button) findViewById(R.id.tekan);


        tekan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    int nilaiA = Integer.parseInt(masukan.getText().toString());
                    int nilaiB = Integer.parseInt(masukan2.getText().toString());
                    int hasil = 1/2 * nilaiA * nilaiB;
                    Intent i = new Intent(MainSegitiga.this, MainHasil.class);
                    i.putExtra("nilai", "" + hasil);
                    startActivity(i);
                } catch (Exception ex) {
                }
            }
        });
    }

    public void tekan2(View view) {
        try {
            int nilaiA = Integer.parseInt(masukan.getText().toString());
            int nilaiB = Integer.parseInt(masukan2.getText().toString());
            int hasil =  nilaiB + nilaiA + nilaiA;
            Intent i = new Intent(MainSegitiga.this, MainHasil.class);
            i.putExtra("nilai", "" + hasil);
            startActivity(i);
        } catch (Exception ex) {
        }
    }
}
