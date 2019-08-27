package com.example.week2_test;

public class Snake extends Animal{
    static int count = 0;
    int energy = 10;

    public Snake(){
        count++;
    }
    @Override
    public void Eat(String food) {
        setEnergy(getEnergy() + 5);
    }
}

