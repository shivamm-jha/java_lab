package lab10;

public class thread3 extends Thread{
   
    int number;
    thread3(int num){
       number = num;
       start();
    }

    public void run(){
        try{
            System.out.println("cube of the number(thread3) : " + Math.pow(number,3) + "\n");
            Thread.sleep(0);
        }
        catch(InterruptedException e){
            System.out.println("Exception caught in thread3");
        }
        
    }
}
