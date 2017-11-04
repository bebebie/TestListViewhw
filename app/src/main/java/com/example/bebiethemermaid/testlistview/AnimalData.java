package com.example.bebiethemermaid.testlistview;

import com.example.bebiethemermaid.testlistview.model.Animal;

import java.util.ArrayList;

/**
 * Created by user on 4/11/2560.
 */

public class AnimalData {

    private static AnimalData sInstance;

    public ArrayList<Animal> animalList;


    public static AnimalData getInstance(){
        if(sInstance == null){
            sInstance = new AnimalData();
        }
        return sInstance;
    }
}
