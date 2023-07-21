public class Prime_fifty
{
public static void main(String args[])
{
for(int num=1;num<=50;num=num+1)
{
int counter=0;
for(int i=1;i<=num;i=i+1)
{
if(num%i==0)
{
counter=counter+1;
}
}

if(counter==2)
{
System.out.println("Prime Number"+num);
}
else
{
System.out.println("Not Prime Number"+num);
}
}
}
}
