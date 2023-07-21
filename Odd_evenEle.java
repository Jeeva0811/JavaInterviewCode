public class Odd_evenEle
{
public static void main(String args[])
{
int a[]={7,3,4,1,6,8,9,12,11,16,9};
int oddCount=0,evenCount=0;
for(int i:a)
{
if(i%2==0)
{
evenCount=evenCount+1;
}
else
{
oddCount=oddCount+1;
}
}
int even[]=new int[evenCount];
int odd[]=new int[oddCount];
int j=0,k=0;
for(int i:a)
{
if(i%2==0)
{
even[j]=i;
j=j+1;
}
else
{
odd[k]=i;
k=k+1;
}
}
for(int x:even)
{
System.out.println("even "+x);
}
for(int i:odd)
{
System.out.println("odd "+i);
}

}
}
