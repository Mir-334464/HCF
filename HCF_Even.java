import java.util.*;

class HCF_Even

{

  public static void main(String[]args)

      {
       
       Scanner sc=new Scanner(System.in);
        
       System.out.println("Enter 2 numbers to Find Even HCF");

       System.out.print("\nEnter number 1: ");
       int N=sc.nextInt();

       System.out.print("\nEnter number 2: ");
       int N1=sc.nextInt();

        int i=1, HCF=0, Fact=0;

while(i<=N || i<=N1)
{

  if(N%i==0 && N1%i==0)
{
   HCF=i;
 
  if(HCF%2==0)

  Fact=HCF;
}  

i++;
}

System.out.println("\nHCF of Two Number is: "+HCF);
System.out.println("\nEven Factor of Two Number is: "+Fact);


       }
}
