package com.example;

import java.util.List;

public interface IFeline extends Predator {
    String getFamily();
    //List<String> eatMeat() ; // это есть в Predator
    int getKittens();
    int getKittens(int kittensCount);
//    void getFood(); // это из Animal
}

