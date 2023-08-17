package com.example.lesson_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BitcoinAdapter extends RecyclerView.Adapter<BitcoinViewHolder> {
    private ArrayList<String> listName;

    public BitcoinAdapter(ArrayList<String> listName) {
        this.listName = listName;

    }


    @NonNull
    @Override
    public BitcoinViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new BitcoinViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_market, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull BitcoinViewHolder holder, int position) {
        holder.bind(listName.get(position));
    }

    @Override
    public int getItemCount() {
        return listName.size();
    }
}