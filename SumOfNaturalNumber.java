import java.util.Scanner;

public class SumOfNaturalNumber{

   public static void main(String[] args){

    Scanner sc =new Scanner(System.in);
       
    System.out.print("enter a no. : " );
    int n = sc.nextInt();
    int sum = 0;
    for(int i=1 ; i<=n ; i++)
      {

         sum = sum + i;

      }
        System.out.println("Sumof first " + n + " natural numbes = " + sum );

         sc.close();
         

   }


}