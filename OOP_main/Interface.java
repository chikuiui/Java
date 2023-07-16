package OOP_main;

interface interface1{

}
interface interface2{

}
// NOTE -> we use "implements" keyword when a class uses the interface
class work implements interface1{

}



// NOTE -> we use "extends" keyword when there are only interfaces hierarchy.
//  This below one is the example of multiple inheritance.
public interface Interface extends interface1,interface2{
    // constant declaration i.e public, static, and final fields in nature.

    // method signatures, by default public
    // abstract methods,default methods,and static methods
}
