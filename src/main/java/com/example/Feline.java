package com.example;

import java.util.List;

public class Feline extends Animal implements IFeline  { //, Lion

    @Override
    public List<String> eatMeat() throws Exception { //
        return getFood("Хищник");
    }

    @Override
    public String getFamily() { // есть в Lion
        return "Кошачьи";
    }

    public int getKittens() { // есть в Lion
        return getKittens(1);
    }

    public int getKittens(int kittensCount) { // есть в Lion
        return kittensCount;
    }

}
