package lab2;
import java.util.*;
public class two_d_array {
    public static void main(String [] args){
        int n , m ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of rows & cols : ");
        n= sc.nextInt();
        m=sc.nextInt();
        int arr[][]= new int[n][m];
        System.out.println("enter the array elements : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int temp= sc.nextInt();
                arr[i][j]=temp;
            }
        }
        sc.close();

        System.out.println("array elements are : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }

    }
}
