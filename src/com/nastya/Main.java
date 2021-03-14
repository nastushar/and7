package com.nastya;

public class Main {

    public static void main(String[] args) {
    Cat [] cats = new Cat [4];
	cats[0] = new Cat ( "Барсик1", 20 );
	cats[1] = new Cat ( "Барсик2", 40 );
	cats[2] = new Cat ( "Барсик3", 10 );
	cats[3] = new Cat ( "Барсик4", 51 );
	Plate plate = new Plate ( 100, 100 );
   	plate.info ();
        for (Cat cat: cats) {
            cat.eat ( plate );
            cat.info ();
            if (cat.satiaty==0) {
                plate.fullPlate ( );
                plate.info ( );
                cat.eat ( plate );
                cat.info ( );
            }
        }
    plate.info ();
    }
}
