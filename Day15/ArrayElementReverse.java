import java.util.Scanner;

public class ArrayElementReverse {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter a size of array :");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.print("enter a element in array :");
        for(int i=0 ; i<=(size - 1) ; i++)
          {
            a[i] = sc.nextInt();
          }        
    
        System.out.print("printed array element :");
        for(int i=0 ; i<=(size - 1) ; i++)
          {
            System.out.print(a[i] + " ");
          }

          System.out.print("\n Reverse order is : ");
          for(int i=(a.length - 1) ; i>=0 ; i--)
          {
            System.out.print(a[i]  + " ");
          }
        }

}
