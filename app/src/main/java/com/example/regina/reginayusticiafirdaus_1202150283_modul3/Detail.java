package com.example.regina.reginayusticiafirdaus_1202150283_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class Detail extends AppCompatActivity {
    ImageView gambar;
    TextView nama, harga, keterangan;
    Button min, plus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        setTitle("Detail Produk");

        gambar = findViewById(R.id.detail_gambar);
        nama = findViewById(R.id.detail_nama);
        harga = findViewById(R.id.detail_harga);
        keterangan = findViewById(R.id.detail_keterangan);

        gambar.setImageDrawable(this.getResources().getDrawable(Integer.valueOf(getIntent().getStringExtra("gambar"))));
        nama.setText(getIntent().getStringExtra("nama"));
        harga.setText(getIntent().getStringExtra("harga"));
        keterangan.setText(getIntent().getStringExtra("keterangan"));
    }

    public void min(View view) {
        min = findViewById(R.id.btn_min);
            Toast.makeText(Detail.this, "Air Sedikit", Toast.LENGTH_SHORT).show();
    }

    public void plus(View view) {
        min = findViewById(R.id.btn_plus);
        Toast.makeText(Detail.this, "Air Sudah Full", Toast.LENGTH_SHORT).show();
    }
}

