public class Prime_number
{
public static void main(String args[])
{
int num=1;
int counter=0;
for(int i=1;i<=num;i=i+1)
{
if(num%i==0)
{
counter=counter+1;
System.out.println(i);
}
}

if(counter==2)
{
System.out.println("Prime Number");
}
else
{
System.out.println("Not Prime Number");
}
}
}
