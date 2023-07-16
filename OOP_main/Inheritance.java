package OOP_main;

// base class/super class

class Bicycle{
    public  int gear;
    public int speed;

    public Bicycle(int gear,int speed){
       this.gear = gear;
       this.speed = speed;
    }

    public void applyBrake(int decrement){
        speed-=decrement;
    }

    public void speedUp(int increment){
        speed+=increment;
    }

    public String printInfo(){
        return("No of gears are "+gear+"\n"+"speed of bicycle is "+speed);
    }
}

// child class/sub-class

class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int gear, int speed,int startHeight) {
        /*
          Keyword "super" refers to the superclass
          which could be the immediate parent or its ancestor.

          It is used to access superclass methods and variables
          within the subclass defination

          --> always needs to be the first statement.
          --> NOTE - > this statement calls the constructor of parent class
          --> invoking base-class(Bicycle) constructor using super() or super(argumentList)
         */
        super(gear, speed);
        this.seatHeight = startHeight;
    }

    public void setHeight(int newHeight){
        this.seatHeight = newHeight;
    }

    /*  This below function have same name and same return type and same access specifier.
        we are overriding the function so we use @Override so that compiler knows that we are overriding this method
        of super class to child class.
        -> it avoid error .
     */
    @Override
    public String printInfo(){
        return(super.printInfo() +"\n seat height is "+seatHeight);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3,100,25);
        System.out.println(mb.printInfo());
        mb.speedUp(20);
        mb.setHeight(22);
        mb.printInfo();
        System.out.println(mb.printInfo());
    }
}
