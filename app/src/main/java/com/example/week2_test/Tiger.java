package com.example.week2_test;

import java.lang.reflect.Constructor;

public class Tiger extends Animal {
    static int count = 0;
    public Tiger(){
        count++;
    }

    @Override
    public void Sleep(){
        setEnergy(getEnergy() + 5);
    }

    @Override
    public void Eat(String food){
        if(food.equals("grain")){
        }
        else{ setEnergy(getEnergy() + 5);
        }
    }

}
