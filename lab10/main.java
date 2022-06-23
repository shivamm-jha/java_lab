package lab10;
import java.util.*;

import lab1.*;
public class main{
    public static void main(String[] args){
        new thread1(); // thread1 call
        Thread t = new Thread();
        System.out.println("main thread :" + t.currentThread() );
        thread1 t1 = new thread1(); 
    }
}