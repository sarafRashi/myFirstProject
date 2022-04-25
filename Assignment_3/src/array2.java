import java.util.Scanner;
public class array2
{
	public static void main(String args[]) 
	{
		int i,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter the elements of array: ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		array2 ob=new array2();
		b=ob.rearrange(a);
		System.out.print("Original Array: ");
		ob.display(a);
		System.out.print("Restructured Array: ");
		ob.display(b);
	}	
	public int[] rearrange(int a[])
	{
		int n=a.length;
		int i,k=0,b[]=new int[n];
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0) 
			{
				b[k++]=a[i]; //inserting all even numbers first in array b
			}
		}
		for(i=0;i<n;i++)
		{
			if(a[i]%2!=0) 
			{
				b[k++]=a[i]; //inserting all odd numbers in array b
			}
		}
		return b;
	}
	public void display(int a[])
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}