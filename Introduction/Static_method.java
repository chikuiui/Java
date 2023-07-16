package Introduction;




public class Static_method {
    public static void main(String[] args) {
         show();
    }

    /* ->Why we use static keyword in show method because if i don't use static keyword
       ->then to use this show() method in main() method i have to create the object of the class -> Static_method

         Static_method p = new Static_method();
         p.show();

                    TO AVOID THIS ABOVE THING

       ->simply use static keyword in below method so that we can directly use this.

         show();

    *  */

    public static void show(){
        System.out.println("Hello");
    }
}
