package com.example.week2_test;

import android.widget.Switch;

import java.util.ArrayList;
import java.util.Random;

public class Jungle {
    ArrayList<Animal> Jungle = new ArrayList<>();
    ArrayList<String> Food = new ArrayList<>();

    public void Jungle(){

    }

    public void Food(){
        Food.add("meat");
        Food.add("bugs");
        Food.add("fish");
        Food.add("grain");
    }

    public void soundOff(){
        for (int i=0; i < Jungle.size();i++){
            Jungle.get(i).Speak();
        }
    }

    public void action(){
        for(int j=0; j<Jungle.size(); j++){
            Random rand = new Random();
            int n = rand.nextInt(4);
            switch(n){
                case 0:
                    Jungle.get(j).Speak();
                case 1:
                    Jungle.get(j).Eat("food");
                case 2:
                    Jungle.get(j).Sleep();
                case 3:
                    if(Jungle.get(j).getClass() == Monkey.class){
                        Jungle.get(j).Play();
                    }else{
                        Jungle.get(j).Sleep();
                    }
                    break;
            }
        }
    }


}
