public class Perfect_number
{
public static void main(String args[])
{
for(int num=1;num<=100000;num=num+1)
{
//int num=6;
int sum=0;
for(int i=1;i<=num/2;i=i+1)
{
if(num%i==0)
{
sum=sum+i;
}
}

if(num==sum)
{
System.out.println("Perfect Number   "+num);
}
/*else
{
System.out.println("Not Perfect Number   "+num);
}*/
}
}
}
