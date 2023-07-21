public class ArrayHW
{
public static void main(String args[])
{
int a[]={7,5,1,4,9};
int b[]={1,3,9};
int x[]=new int[a.length+b.length];//it creates 8 elements size space(Empty space)

for(int i=0;i<a.length;i++)//Merge
{
x[i]=a[i];
} 
for(int i=0;i<b.length;i++)
{
x[a.length+i]=b[i];
} 
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]+",");
}
System.out.println();

for(int i=0;i<x.length;i++)//ascending order
{
for(int j=i+1;j<x.length;j++)
{
if(x[i]>x[j])
{
int temp=x[i];
x[i]=x[j];
x[j]=temp;
}
}
}
for(int i=0;i<x.length;i++)
{
System.out.print(x[i]+",");
}
System.out.println();


for(int i=0;i<x.length;i++)//to remove duplicates
{
for(int j=i+1;j<x.length;j++)
{
if(x[i]==x[j])
{
x[j]=0;
}
}
}
for(int i=0;i<x.length;i++)
{
if(x[i]!=0)
{
System.out.print(x[i]+",");
}
}
System.out.println();

}
}

