package com.example.networking;

import android.view.View;

import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class Mountain {

    private String name;
    private String location;
    private int height;

    public Mountain(String name, String location, int height){
        name = name;
        location = location;
        height = height;
    }

    @Override
    public String toString(){
       return name + " " + location + " " + height;
    }
}
