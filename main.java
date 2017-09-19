//Name of the program file should exactly match the class name.

/*There can only be 1 public class in each java file. This forces all Java code to
be organized in a certain way, which in the long run helps improve code readability. */

//If the class is defined inside a package, then the package statement should be the first statement in the source file.
package com.company;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map;
//All class names the first letter should be in Upper Case.
class Kitten{
    int kitten_age;
    public Kitten(String name){     //The kitten here is the constructor. The main rule is that the constructor should have the same name as the class
        System.out.println("This kitten's name is " + name);
    }
    public void set_age(int age){
        kitten_age = age;
    }
    public int get_age(){
        System.out.println("The cat's age is " + kitten_age);
        return kitten_age;
    }

}

class swap{
    int c;  //This is an instance variable. Inside a class, but outside any method
    static int d;   //Class variables are variables declared within a class, outside any method, with the static keyword.
    public swap(int a, int b){
        int temp = a;
        a = b;  //a is a local variable.
        b = temp;
        /*Variables defined inside methods, constructors or blocks are called local variables.
        The variable will be declared and initialized within the method and the variable
         will be destroyed when the method has completed.*/
    }
}
public class Main {


    //Java program processing starts from the main() method which is a mandatory part of every Java program.
    /*This is a constructor, every class has one. The main rule of constructors
     is that they should have the same name as the class.*/
    /*The main method is static so that an object is not required to call it. If it were a non-static method, jvm has to create an object
    first then call the main() method which will lead to the problem of extra memory allocation.*/

    public static void main(String[] args) {

        // write your code here


        Kitten mykitten = new Kitten("cate");
    /* There are 3 steps when creating an object from a class
    *   Declaration - A variable declaration with a variable name with an object type.
    *   Instantiation − The 'new' keyword is used to create the object.
    *   Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
    * */

        int[] test_array = {1,2,3,4,5,6};
        for (int i = 0; i < test_array.length ; i++) {
            System.out.println(test_array[i]);

        }
        int grade = 50;
        String result = (grade > 60) ? "pass" : "fail";

        student student_1 = new student("Emily");
        improved_student student_2 = new improved_student("Jason");
        Vector vector_1 = new Vector(10);
        for (int i = 0; i < vector_1.capacity(); i++) {
            vector_1.add(i);
        }

        Map mapper_1 = new HashMap();
        Dog pupper = new Dog();




    }
    public static void main(String args){System.out.println("main with String");}
    public static void main(){System.out.println("main without args");}
    //You can call as many main() methods as you want, But JVM calls main() method which receives string array as arguments only.
}
