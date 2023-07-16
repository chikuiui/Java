package OOP;

// creating user defined exception
class InvalidBalanceException extends Exception{
    public InvalidBalanceException(String message){
        super(message);
    }
}


public class User_defined_exception {
    public static void main(String[] args) {
         int b;

         try{
             //b = 0;
             b = Integer.parseInt(args[0]); // may generate NumberFormatException
             updateBalance(b);              // may generateInvalidBalanceException
         }catch (InvalidBalanceException ex){
             System.out.println("Caught in catch of InvalidBalanceException");
             ex.printStackTrace();
         }catch (NumberFormatException ex){
             System.out.println("Caught in catch of NumberFormatException");
         }catch (ArrayIndexOutOfBoundsException ex){
             System.out.println("Caught in catch of ArrayIndexOutOfBoundException");
         }catch (Exception ex){
             System.out.println("Caught in catch of Parent Exception");
         }
    }


    public static void updateBalance(int number) throws InvalidBalanceException{
        if(number < 0) throw (new InvalidBalanceException("Account Balance cannot be less than Zero!"));
        System.out.println("No exception occurred in updateBalance() method !");
    }

}
