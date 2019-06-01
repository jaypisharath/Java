package com.jayp;

class Cars {
    String name;
    int engine;
    int cylinders;
    int wheels;

    public Cars(String name, int cylinders) {
        this.name = name;
        this.engine = 1;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void accelerate(){
        System.out.println("Car is accelerating");
    }

    public void startEngine(){
        System.out.println("Engine has started, firing all "+ this.cylinders +" cylinders");
    }

    public void brake(){
        System.out.println("Car is about to stop");
    }

}

class AudiQ5 extends Cars {
    public AudiQ5() {
        super("Audi Q5", 6);
    }

    public void accelerate(){
        System.out.println("Audi Q5 is about to accelerate");
    }
}

class BMWx5 extends Cars {
    public  BMWx5() {
        super("BMW X5", 6);
    }

    public void accelerate(){
        System.out.println("BMW X5 is about to accelerate");
    }
}

class Audia3 extends Cars {
    public Audia3() {
        super("Audi A3", 4);
    }

    public void accelerate(){
        System.out.println("Audi A3 is about to accelerate");
        super.accelerate();
    }
}

class Kia extends Cars {
    public Kia() {
        super("Kia K3", 4);
    }
}

public class Main {

    public static void main(String[] args) {

        for (int i=0; i<5; i++ )
        {
            Cars myCar = randomCar();
            if(myCar != null)
            {
                myCar.getName();
                myCar.startEngine();
                myCar.accelerate();
                myCar.brake();
                System.out.println("\n.........\n\n\n ");
            }
        }

        final Cars Hyundai = new Cars("Hyundai Sonata", 4){
            @Override
            public void accelerate(){
                System.out.println("Hyundai Sonata is accelerating");
            }
        };

        Hyundai.accelerate();

    }

    public static Cars randomCar(){
        int randomNo = (int)((Math.random())*5) + 1;
        System.out.println("randomNo = " + randomNo);
        switch (randomNo) {
            case 1:
                return new AudiQ5();
            case 2:
                return new BMWx5();
            case 3:
                return new Audia3();
            case 4:
                return new Kia();
            default:
                return null;
        }
    }
}
