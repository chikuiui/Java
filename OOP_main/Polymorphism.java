package OOP_main;

// Example of Runtime polymorphism

class Bicycle1{
    public int gear;
    public int speed;


    public Bicycle1(int gear,int speed){
        this.gear = gear;
        this.speed = speed;
    }


    // Category 1
    public void applyBrake(int d){
        speed-=d;
    }
    // Category 1
    public void speedUp(int i){
        speed+=i;
    }
    // Category 3
    public String printInfo(){
        return("No of gears are "+gear+"\n"+"speed of bicycle is "+speed);
    }
}

class MountainBik extends Bicycle1{
    public int seatHeight;

    public MountainBik(int gear, int speed,int startHeight) {
        super(gear, speed);
        this.seatHeight = startHeight;
    }
    // Category 2
    public void setHeight(int newHeight){
        this.seatHeight = newHeight;
    }

    // Category 3
    @Override
    public String printInfo(){
        return(super.printInfo() +"\n seat height is "+seatHeight);
    }
}


public class Polymorphism {
    public static void main(String[] args) {

    // which one is correct?

        // invalid statement
    //    MountainBik obj = new Bicycle1(3,100);

        // works fine and Category 1,2,3(overridden) can be accessible.
        MountainBik obj = new MountainBik(3,100,25);

        // works fine and Category 1 and 3(overridden) can be accessible
        Bicycle1 obj1 = new MountainBik(3,100,25);

        // works fine and Category 1 and (original)3 can be accessible
        Bicycle1 obj2 = new Bicycle1(3,100);

    }
}
