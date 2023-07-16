package OOP;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Checked_Exception {

    public static void main(String[] args) {
        // the below statement throw exception to avoid this error
        // Scanner sc = new Scanner(new File("test.in"));

        // USE TRY CATCH ->
        try{
            Scanner sc = new Scanner(new File("test.in"));
            // when sc gets an exception the below code will not run in try block
            System.out.println("hello world"); // this will not print

        }catch (FileNotFoundException ex){
            System.out.println("File not found Caught !");
        }finally {
            // OPTIONAL BLOCK (always execute)
            // ALWAYS RUN REGARDLESS OF EXCEPTION STATUS
            System.out.println("finally-block runs regardless of the state of exception !");
        }

        // this will only execute if exception is handled
        System.out.println("ends!");


    }

}
