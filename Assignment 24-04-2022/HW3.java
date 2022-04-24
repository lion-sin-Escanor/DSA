 // WAP to input n, loop for n times and input 2 numbers in each iteration
        // If iteration is even(0th,2nd,4th..) print sum else print multplication. (Homework)

public class HW3{    
 public static void main(String args[]){    
        
  int n;//it is the number to be checked   
 Scanner scn = new Scanner(System.in);
n = scn.nextInt();
int sum=0,product=1;
int a,b;
for(int i=0;i<n;i++)
{
a=scn.nextInt();
b=scn.nextInt();
sum=sum+a+b;
product=product*a*b;
if(a%2==0)
{
System.out.println("Sum is"+sum);

}
else
{
System.out.println("Product is"+product);
}
}
}}