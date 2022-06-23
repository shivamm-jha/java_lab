package lab5;
import java.util.*;
public class inheritance {
    public static void main(String args[]){
        // speed s1 = new speed();  // multilevel inheritance
        // s1.details();

        
        // hierarchical inheritance

        fulltime f1 = new fulltime();
        intern i1 = new intern();
        System.out.println("salary before incrementing ...\n");
        f1.displaySalary();
        i1.displaySalary();
        System.out.println("\nsalary after incrementing...\n");
        f1.incrementSalary();
        i1.incrementSalary();
        f1.displaySalary();
        i1.displaySalary();

    }
}


//  multi-level inheritance...
class maruti{
    String name;
    String BrandName;
    int speed;
    maruti(){
        this.name = "swift";
        this.BrandName="maruti";
        this.speed=80;
    }

    maruti(String name, String BrandName, int speed){
        this.name=name;
        this.BrandName=BrandName;
        this.speed=speed;
    }

    void details(){
        System.out.println("car name : "+ name);
        System.out.println("car brand : "+ BrandName);
        System.out.println("car speed : "+speed);
    }
    
    

}


class brand extends maruti{
    brand(){
        this.name="shivam";
        this.BrandName="shivam";
    }
}

class speed extends maruti{
    speed(){
        this.speed=100;

    }
}




//  hierarchical inheritance...

class employee{
    double salary = 100;
    void displaySalary(){
        System.out.println("employee salary is : "+salary);
    }
}



class fulltime extends employee{
    double hike = 1.5;
    void incrementSalary(){
        salary+= salary*hike;
    }
}

class intern extends employee{
    double hike = 0.5;
    void incrementSalary(){
        salary+=salary * hike;
    }
}
