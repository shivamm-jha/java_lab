package lab4;

public class prog4 {
    public static void main(String [] args){
        //  method overloading program..
        // sum of two numbers..


        // System.out.println(sum(5,4));


        // // sum of three numbers

        //   System.out.println(sum(2,3,4));

        // walk("shivam");
        // walk("shivam","delhi");

        //  class over loading....

        // overload obj1 = new overload();
        // obj1.name="shivam";

        // obj1.sayHi();
        // obj1.sayHi("akshay", "delhi");


        // class overriding...

        overriding obj2 = new overriding();
        obj2.age=18;
        obj2.name="akshay";
        obj2.place="warangal";
        // System.out.println(obj2.name + "is "+ obj2.age +" years old");
        
        obj2.sayHi();
        // obj2.sayHi("pajya","mumbai");

        
    }
    
    // static int sum(int a, int b){
    //     return a+b;
    // }

    // static int sum(int a , int b, int c){
    //     return a+b+c;
    // }

   

    // static void walk(String newName){
    //     System.out.println(newName + "is walking");
    // }

    // static void walk(String newName , String newPlace){
    //     System.out.println(newName+ "is walking in" + newPlace);
    // }

   
}


//  class overloading.... 
class overload{
    String name;
    int age;
    void sayHi(){
        System.out.println("hello "+this.name+" bhai");
    }

    void sayHi(String newName, String newPlace){
        System.out.println(newName +"is going to "+ newPlace);
    }
}

class overriding extends overload{
   String place;

}




