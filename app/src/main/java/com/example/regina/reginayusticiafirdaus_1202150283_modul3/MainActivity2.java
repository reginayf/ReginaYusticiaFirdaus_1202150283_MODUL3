package com.example.regina.reginayusticiafirdaus_1202150283_modul3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    RecyclerView rv;
    Main2Adapter adapter;
    List<pilihanproduk> listproduk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2_main);
        setTitle("Produk");

        listproduk = new ArrayList<>();
        rv = findViewById(R.id.list_produk);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    private void initdata(){
        listproduk.add(new pilihanproduk(R.drawable.aqua, "Aqua", 3000, "Air mineral Sejuta Umat"));
        listproduk.add(new pilihanproduk(R.drawable.pristine, "Pristine", 4500, "mirip cocacola kali ya. hehe"));
        listproduk.add(new pilihanproduk(R.drawable.leminerale, "Le-Minerale", 4000, "kayak ada manis-manisnya"));
        listproduk.add(new pilihanproduk(R.drawable.cleo, "Cleo", 2700, "yang tutupnya oren-oren itu"));
        listproduk.add(new pilihanproduk(R.drawable.club, "Club", 2000, "Nah ini lawannya SIERRA"));
        listproduk.add(new pilihanproduk(R.drawable.equil, "EQUIL", 1500, "Ayam, Kecap, Garam"));
        listproduk.add(new pilihanproduk(R.drawable.evian, "Evian", 2300, "Belumpernah nyoba"));
        listproduk.add(new pilihanproduk(R.drawable.amidis, "Amidis", 2500, "Asam banget sumpah gaboong"));
        adapter = new Main2Adapter(this, listproduk);
        rv.setAdapter(adapter);
    }
}