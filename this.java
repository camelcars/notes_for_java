/*The many usages of 'this'
*   Used for constructor chaining
*   used to distinguish between local variable and instance variable
*   The this keyword can also be passed as an argument in the method. It is mainly used in the event handling.
* */
class Student{
    int rollno;
    String name,course;
    float fee;
    Student(int rollno,String name,String course){
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    Student(int rollno,String name,String course,float fee){
        this(rollno,name,course);//reusing constructor, so more code does not need to be typed
        this.fee=fee;

    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
    public static void main(String args[]){
        Student s1=new Student(111,"ankit","java");
        Student s2=new Student(112,"sumit","java",6000f);//This uses the second constructor
        s1.display();
        s2.display();
    }
}

//The code below shows that the this keyword refers to the current class instance variable
class A5{
    void m(){
        System.out.println(this);//prints same reference ID
    }
    public static void main(String args[]){
        A5 obj=new A5();
        System.out.println(obj);//prints the reference ID
        obj.m();
    }
}

class S2{
    void m(S2 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);
    }
    public static void main(String args[]){
        S2 s1 = new S2();
        s1.p();
    }
}
