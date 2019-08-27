package com.example.week2_test;

public class Monkey extends Animal{
    static int count = 0;
        private int play;

        public Monkey(Integer play){
            this.play = play;

        }
        public Monkey(){
            count++;
    }
    @Override
    public void Eat(String food){
            setEnergy(getEnergy() +2);
    }
    @Override
    public void Speak(){
            setEnergy(getEnergy() -4);
    }
    public void Play(){
            if(getEnergy() >= 8){
                setEnergy(getEnergy() -8);
                System.out.println("Oooo Oooo Oooo");
            }
            else {
                System.out.println("Monkey it too tired");
            }
    }

//        public Dog(int speak, int eat, int sleep, int play){
//            super(speak, eat, sleep);
//            this.play = play;
        }

        //    class Monkey {
//    int energy = 10;
//    int play = -8;
//    int soundBonus = -1;
//    int eat = 2;
//    int sleep = 10;
//    }{
//}
