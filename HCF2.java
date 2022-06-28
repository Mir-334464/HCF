import java.util.*;

class HCF2

{

  public static void main(String[]args)

      {
       
       Scanner sc=new Scanner(System.in);
        
       System.out.println("Enter 3 numbers to Find HCF");

       System.out.print("\nEnter number 1: ");
       int N=sc.nextInt();

       System.out.print("\nEnter number 2: ");
       int N1=sc.nextInt();

       System.out.print("\nEnter number 3: ");
       int N2=sc.nextInt();


        int i=1, HCF=0;

while(i<=N || i<=N1 || i<=N2)
{

  if(N%i==0 && N1%i==0 && N2%i==0)
   HCF=i;

i++;
}

System.out.println("\nHCF of Three Number is: "+HCF);
       }
}
