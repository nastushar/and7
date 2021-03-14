package com.nastya;

public class Plate {
    protected static int food;
    private int maxfood;
    public Plate ( int food , int maxfood) {
        this.food = food;
        this.maxfood =maxfood;
    }



    public void decreaseFood( int n){
            food-=n;

    }
    public void info (){
        System.out.println ("Тарелка: "+food );
    }
    public void fullPlate(){
        food=maxfood;
    }
}


