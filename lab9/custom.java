package lab9;
class myException extends Exception{
    public myException(String s){
        super(s);
    }
}
public class custom {
    public static void main(String [] args){
        try{
            throw new myException("hello");

        }
        catch(myException e){
            System.out.println("caught");
            System.out.println(e.getMessage());
        }

        try{
            sum(1,2);
        }
        catch(Exception e){
            System.out.println("exception again bhai");
        }
    }

    static void sum(int a, int b) throws myException{
        int y = 5/0;
        System.out.println(y);
    }
}
