package com.example;
import java.util.List;

public class Lion extends Animal implements IFeline, Predator{
    private Feline feline;
    boolean hasMane;

    public Lion(String sex) throws Exception {
        feline = new Feline();
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public void getSex(boolean hasMane) {
        //String sex = "пол не задан";
        if (hasMane = true) {
            String sex = "Самец";
        }
        else if (hasMane = false) {
            String sex = "Самка";
        }
    }

    public boolean doesHaveMane() {
        return hasMane;
    }


    @Override
    public int getKittens() {
        return 1;
    }

    @Override
    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public String getFamily() {
        return "Кошачьи"; // feline.getFamily()
    }

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }
}
