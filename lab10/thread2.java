
package lab10;

public class thread2 extends Thread {
   
    int number;
    thread2(int num){
        number = num;
        start();
    }

    public void run(){
        try{
            System.out.println("square of the number (thread2): " + Math.pow(number,2) + "\n");
            Thread.sleep(0);
        }
        catch(InterruptedException e){
            System.out.println("Exception caught in thread2");
        }
        
    }
}
