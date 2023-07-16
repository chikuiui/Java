package OOP;

/*  FINAL METHOD

   class Base{
       final void fun(){                        // if i remove final it will works fine.
          System.out.println("Base");
       }
   }

   class Derived extends Base{
       void fun(){
          System.out.println("Derived");
       }
   }

   -->> gives compiler error.

 */

/*   FINAL CLASS

    final class Base{

    }

    class Derived extends Base{

    }

    --> gives error

 */



public class final_keyword {


/*           THIS IS INSTANCE FINAL VARIABLE
 1. simple initialization

    final int b = 100;

   NOTE -->  it will throw compiler error if i simply write -> final int b;

2.Initializing final variable using initializer block {} it will work.
    final int c;
    {c = 100;}

    NOTE -> initializer block is for instance level.

3.Initializing final variable using constructor
     final int x;
     final_keyword(){
      x = 100;
     }
 */

 /*   THIS IS CLASS OR STATIC FINAL

1. simple initialization
    static final int MAX = 100;   this works at const global variable. can use it without creating an object.

2. Initializing final variable using static block {} it will work.
    static final int MAX;
    static{MAX = 100;}

    NOTE -> static block is for class level

  */


    public static void main(String[] args) {

      // local final variable
        final int x; // this is blank final variable
        x = 100;

      // we can also do this final int x = 100;

        // system.out.println(MAX);   we can access it.

    }
}
