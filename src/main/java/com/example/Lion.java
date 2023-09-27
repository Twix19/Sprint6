package com.example;

import java.util.List;

public class Lion implements Lionfeline{
    boolean hasMane;
    private Lionfeline lionfeline;

    private Animal animal;


    public Lion(String sex) throws Exception {
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public Lion(Lionfeline lionfeline){
        this.lionfeline = lionfeline;
    }

    public int getKittens() {
        return lionfeline.getKittens();
    }

    @Override
    public List<String> eatMeat(String animalKind) throws Exception {
        return animal.getFood("Хищник");
    }


    public boolean doesHaveMane() {
        return hasMane;
    }


}
