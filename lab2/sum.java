package lab2;
import java.util.*; 
public class sum{
    public static void main(String [] args)
    {
        int n;  int sum = 0;
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the size of the array : ");
        n= sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter the array elements : ");
        for(int i=0;i<n;i++){
            int temp = sc.nextInt();
            arr[i]=temp;
            sum+=temp;
        }
        sc.close();

        System.out.println("the array elemenst are : ");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println("the sum of the all array elemenst : " + sum);
        
    }
}