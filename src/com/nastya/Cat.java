package com.nastya;


import static com.nastya.Plate.food;

public class Cat {
    protected String name;
    protected int appetit;
    protected int satiaty;

    public Cat ( String name , int appetit ) {
        this.name = name;
        this.appetit = appetit;
        satiaty=0;
    }
    public void eat(Plate p){
        if(appetit<= food) {
            p.decreaseFood ( appetit );
            satiaty = appetit + satiaty;
        }
    }
    public void info(){
        System.out.println ("Котик " +name+", аппетит: "+appetit+", сытость: "+satiaty );
    }
}
