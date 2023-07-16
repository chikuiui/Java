package Introduction;

import java.util.Scanner;

public class Java_Input2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println("The string is :"+s);

        int i = sc.nextInt();
        System.out.println("The integer is :"+i);

        float f = sc.nextFloat();
        System.out.println("The floating value is :"+f);
    }
}
