import java.util.Scanner;
class FatorialNumber{
    public static void main(String[] args){
   
  Scanner sc = new Scanner(System.in);
     
   System.out.print("enter a no.");

   int n = sc.nextInt();
   long fact = 1;
   for(int i=1 ; i<=n ; i++)
   {
    fact = fact*i;
   }

   System.out.println("Factorial = " + fact);
    }

}