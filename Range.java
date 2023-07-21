public class Range
{
public static void main(String args[])
{
int a[]={7,7,44,32,13,21,18,15};
int min=a[0];
int max=a[0];
for(int i=1;i<a.length;i=i+1)
{
if(a[i]<min)
{
min=a[i];
}
if(a[i]>max)
{
max=a[i];
}
}
System.out.println(max-min);
}
}
