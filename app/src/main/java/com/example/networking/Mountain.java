package com.example.networking;

import android.view.View;

import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.annotations.SerializedName;

public class Mountain {

    private String ID;
    private String name;
    private String type;
    private String company;
    private String location;
    private String category;
    @SerializedName("size")
    private int height;
    @SerializedName("cost")
    private int HeightF;

    public Mountain(String name, String location, int height){
        this.name = name;
        this.location = location;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString(){
       return name + ", " + location + ", " + height;
    }
}
