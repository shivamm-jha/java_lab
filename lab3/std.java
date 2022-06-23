package lab3;
import java.util.*;
public class std {
    public static void main(String [] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of student objects you want to create");  
        n= sc.nextInt();

        // declaring our student array to store n student objects
       student st [] = new student[n];

    //    taking inputs
        for(int i=0;i<n;i++){
            student temp = new student();
            System.out.println("enter name , usn , bracnh and phno(in order): ");
            temp.insert(sc.next(),sc.next(),sc.next(),sc.nextInt());
            st[i]=temp;
        }

        sc.close();

//  displaying the data...

        for(int i=0;i<n;i++){
            st[i].print();
        }


}
}




// student class


class student{
    String usn;
    String name;
    String branch;
    int phno;


//  methods ....

    void insert(String name, String usn , String branch , int phno){
        this.name =  name;
        this.usn = usn;
        this.branch = branch;
        this.phno = phno;
    }


    void print(){
        System.out.println("name is: "+this.name);
        System.out.println("usn is: "+this.usn);
        System.out.println("branch is: "+this.branch);
        System.out.println("phno is: "+this.phno);
        System.out.print("\n");
    }

    void walk(String newName){
        System.out.println(newName + " is walking");
    }
}
