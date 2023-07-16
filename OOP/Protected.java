package OOP;
import Introduction.prot;


// Protected class is inheriting from prot class

public class Protected extends prot {
    public static void main(String[] args){

        /*  This below code will not work but in theory it work so the reason is :-

            As class package.OOP.Protected and class package.Introduction.prot are in two different packages
            so prot class instance will not allow you invoke protected method of that class.
            Create the instance Protected which is subclass of prot then invoke the protected method,.

            Protected p = new Protected();
            p.fun();

        * */

//        prot t = new prot();
//        t.fun();

          Protected p = new Protected();
          p.fun();


    }
}
