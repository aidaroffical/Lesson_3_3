package com.example.lesson_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> bitcoinList = new ArrayList<>();
    private RecyclerView rvMarketList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addValue();

        rvMarketList = findViewById(R.id.rv_markets);
        BitcoinAdapter bitcoinAdapter = new BitcoinAdapter(bitcoinList);
        rvMarketList.setAdapter(bitcoinAdapter);
    }

    private void addValue() {
        bitcoinList.add("Bitcoin");
        bitcoinList.add("Ethereum");
        bitcoinList.add("Ripple");
        bitcoinList.add("Luna");
        bitcoinList.add("1000PEPE");
    }
}
