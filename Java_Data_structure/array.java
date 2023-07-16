package Java_Data_structure;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int items[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            items[i] = sc.nextInt();
        }
        // the below one is enhanced for loop
//        for(int item : items){
//            System.out.print(item + " ");
//        }
        System.out.print("The values are : [");
        for(int i = 0 ; i < n ; i++){
            if(i == 0){
                System.out.print(items[i]);
            }else{
                System.out.print(", " + items[i]);
            }

        }
        System.out.println("]");
        // we have to close the scanner class instance

        System.out.println(items.length);
        sc.close();
    }
}
