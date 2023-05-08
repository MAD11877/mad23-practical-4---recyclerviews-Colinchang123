package com.example.week2practical;

import android.media.Image;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class VH extends RecyclerView.ViewHolder {
    TextView textView;
    TextView descView;
    ImageView imageView;

    public VH (View itemView){
        super (itemView);
        textView = itemView.findViewById(R.id.itemname);
        descView = itemView.findViewById(R.id.itemdesc);
        imageView= itemView.findViewById(R.id.itemimage);
    }
}
