package Introduction;

import java.util.Scanner;

public class Java_Output {
    public static void main(String[] args) {

// system.out.println() and system.out.print() example

        int x = 10;
        int y = 20;
        String str = "GFG";

        System.out.println(x);
        System.out.println(x+y); // this statement evaluate first then print
        System.out.println(x + " " + y); // this statement will convert it into string bcoz it contain string
        System.out.print(str + " ");
        System.out.print("Courser\n");

        // we can get new line without using println is using --> "\n"

// system.out.format() or system.out.printf() example

        x = 100;
        y = 200;
        System.out.format("Value of x is %d\n",x);
        float yy = (float) Math.PI;
        System.out.println(yy);
        System.out.format("Value of PI = %.2f\n",yy);
        System.out.format("Value of Pi = %5.2f\n",yy);
        System.out.format("Value of Pi = %05.2f\n",yy);
        System.out.printf("x = %d, y = %d\n",x,y);



    }
}
