package OOP;

public class Method_Call_Stack {
    public static void main(String[] args) {
      // NOTE -> WE CAN USE TRY CATCH IN METHOD A OR METHOD B OR METHOD C ALSO.



      /* METHOD CALL STACK -> when an exception is caught in method it will go to its caller for handling the exception
         but if the caller don't have handler then it goes to caller's caller .. it will keep going till it find
         the handler to handle the exception.

         IF handler is not present in program then it will gives you error.
       */
        try {
            methodA();
            System.out.println("Exit Main()");
        }catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception caught ...");
            // to print the stack from where exception occurs till where the handler is present.(use for debugging)
            ex.printStackTrace();
        }finally {
            System.out.println("finally over!");
        }
    }

    public static void methodA(){
        methodB();
    }
    public static void methodB(){
        methodC();
    }

    public static void methodC(){
        System.out.println("Enter methodC()");
        int a = 5;
        int b = 0;
        int c = a/b;
        System.out.println(c);
    }
}
