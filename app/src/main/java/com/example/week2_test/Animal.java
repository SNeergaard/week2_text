package com.example.week2_test;

public class Animal {
    private int speak;
    private int eat;
    private int sleep;
    private int energy;

    public Animal(){
        energy = 5;
    }

    public Animal(int speak, int eat, int sleep, int energy){
        this.speak = speak;
        this.eat = eat;
        this.sleep = sleep;
        this.energy = energy;
    }
    public void Speak(){
        energy = energy - 3;
    }

    public void Eat(String food){
        energy = energy+5;
    }

    public void Sleep(){
        energy = energy+10;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void Play(){
    }
}
