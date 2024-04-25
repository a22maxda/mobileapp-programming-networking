package com.example.networking;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewController extends RecyclerView.Adapter<RecyclerViewController.ViewHolder>{

    public ArrayList<Mountain> listOfMountains;

    public String file;
    private LayoutInflater layoutInflater;

    public RecyclerViewController(Context context, ArrayList<Mountain> listOfMountains) {
        this.layoutInflater = LayoutInflater.from(context);
        this.listOfMountains = listOfMountains;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerviewitem, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
            holder.getTextView().setText(listOfMountains.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return listOfMountains.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        private final TextView textView;


        public ViewHolder(View itemView) {
            super(itemView);

            textView = (TextView) itemView.findViewById(R.id.RecyclerViewItemName);
        }

        public TextView getTextView() {
            return textView;
        }
    }
}
