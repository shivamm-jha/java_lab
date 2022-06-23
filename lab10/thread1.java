package lab10;
import java.util.*;
import java.util.Random;

class thread1 extends Thread{
   
    thread1(){
        
        System.out.println("thread 1 : " + this);
        start();
    }

    public void run(){
        Random random = new Random();   
        try{
            for(int i =0 ; i< 5; ++i){
                int a = random.nextInt(10);   
                System.out.println("random number (thread1) : " + a + "\n");
                new thread2(a);
                
                new thread3(a);
                

                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e){
            System.out.println("Exception caught in thread 1");
        }
        
        
    }
}
