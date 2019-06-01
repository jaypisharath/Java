package com.jayp;

public class Rm1 {

    Rooms Room1 = new Rooms(10,20,30);

    public Rm1(Rooms room1) {
        Room1 = room1;
    }

    public Rm1() {
        Rooms Room1 = new Rooms(10,20,30);

    }

    public void uniqueRm(){
        System.out.println("currenlty in room1");
        crapFunction();
    }

    //private function used to demostrate that it's private and can be called within a class (not exposed to outside world).
    private void crapFunction() {

        System.out.println("in Crap fuction");
    }


}


