public class Optimized_prime
{
public static void main(String args[])
{
int num=16;
boolean flag=false;
for(int i=2;i<=num/2;i=i+1)
{
if(num%i==0)
{
flag=true;
break;
}
}
if(flag)
{
System.out.println("Not Prime Number");//True condition
}
else
{
System.out.println("Prime Number");
}
}
}
