import java.util.Scanner;
public class array1 
{
	public static void main(String args[]) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		array1 ob=new array1();
		ob.count(a);
	}
	public void count(int a[])
	{
		int i,p=0,e=0,o=0;
		for(i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				p++;
			}
			if(a[i]%2==0)
			{
				e++;
			}
			if(a[i]%2!=0)
			{
				o++;
			}
		}
		System.out.println("Positive numbers in the array: "+p+"\nEven numbers in the array: "+e+"\nOdd numbers in the array: "+o);
	}
}
