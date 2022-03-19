/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprogram.newpackage;
/**
 *
 * @author TECHNIFI
 */
class Base{
    Base(){
        System.out.println("I am a Constructor of Base class");
    }
    Base(int x){
        System.out.println("I am an Overloaded Constructor of base class");
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("I am a Constructor of Derived class ");
    }
    Derived(int x,int y){
        super(x);
        System.out.println("I am an overloaded Constuctor of Derived class");
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am a Constuctor of ChildOfDerived class");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am an overloaded Constuctor of ChildOfDerived class");
    }
}

public class NewClass {
    public static void main(String [] args){
        System.out.println("I am going to call the Child of derived class constructor");
        ChildOfDerived c1=new ChildOfDerived(4,2,5);
    }
}
