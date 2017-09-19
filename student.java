package com.company;
//This program is to illustrate the purpose of this

import java.lang.ref.Reference;

public class student {
    String name;

    student(String name){
        name = name;    //See here, there is ambiguity between the local variable and parameter as they both are called name
    }

    public void display(){
        System.out.println(name);
    }
}


class improved_student{
    String name;
    static String college = "Carnegie";     //By making college static, all instances of this class will have the attribute college

    /*This method is static, which means 2 things.
        It belongs to the class rather than to an object of the class.
        A static method can be invoked without the need for creating an instance of a class.
        E.g. I can invoke this method by saying: improve_student.output_college()
    * */
    //static methods also can't be overridden because they belong to the class
    static void output_college(){
        System.out.println(college);
    }
    public improved_student(String name){
        this.name = name;   //The this keyword is used to refer to the current class instance variable

    }

    //void is used here because no return value is needed
    public void display(){
        System.out.println(name);
    }

}

class uses_of_final{
    final int speedlimit=90;    //I can no longer change the value of speedlimit
    //If I make a method final, I cannot ovveride it
    //If I make any class final, I cannot extend it
}

class Animal{
    Animal(){
        System.out.println("animal is created");}
}
class Dog extends Animal{

    Dog(){
        //super();
        //uncomment the above line and run the code, the result will be the same. This is because the compiler implements super(); even if you don't
        System.out.println("dog is created");
    }
}

//An abstract class needs to be extended and its method implemented. It cannot be instantiated.
abstract class Bike{
    abstract void run();
}
class Honda4 extends Bike{
    void run(){System.out.println("running safely..");}
    public static void main(String args[]){
        Bike obj = new Honda4();
        obj.run();
    }
}
