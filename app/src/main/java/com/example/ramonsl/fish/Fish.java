package com.example.ramonsl.fish;

import android.graphics.drawable.Drawable;

public class Fish {

    private String name;
    private String family;
    private Drawable photo;
    private Double ph;
    private String desc;


    public Fish(String name, String family, Drawable photo, Double ph, String desc) {
        this.name = name;
        this.family = family;
        this.photo = photo;
        this.ph = ph;
        this.desc = desc;
    }
}
