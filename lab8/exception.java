package lab8;

import java.util.zip.CheckedInputStream;
import java.io.*;

public class exception {
    public static void main(String[] args){
        //  unchecked exeption
        try{
            int x = 1;
            int y =0;
            System.out.println(x/y);
            System.out.println("This line will not excecute bcoz control goes out of try block");
        }
        catch(ArithmeticException e){
            System.out.println("arithmetic exception : "+ e);
        }

        //  checked exception...
        try{
            checkedException();
            
        }catch(Exception e){
            System.out.println("exception caught : " + e);
        }
        System.out.println("This line will be excecuted although we have exception in previous line");

    }

   static void checkedException () throws IOException {
      FileReader file = new FileReader("C:\\test\\a.txt");
      file.close();
    }
}
