package Introduction;


/*
 * if i want to give command line input to strings
 * steps:
 *     1. open command terminal
 *     2. compile this file -> javac Command_line.java
 *     3. run with args    -> java Command_line hello world chiku rahul
 *             OR
 *        run without args -> java command_line_arguments
 *
 *
 */

public class Command_line {
    public static void main(String[] args) {

        if(args.length > 0) {
            System.out.println("The strings are present\n");

            for(String val : args) {
                System.out.println(val);
            }
        }else {
            System.out.println("No command line arguments is present");
        }

    }
}
