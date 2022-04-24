import java.util.Scanner;
public class digit_sum
{
	public static void main(String args[])
	{
		int number;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a 3-digit number : ");
	    number=sc.nextInt();
	    digit_sum ob=new digit_sum();
	    if(number<0)
	    {
	    	System.out.println("Please enter positive number only!!");
	    }
	    else
	    {
			System.out.println("Sum of digits of 3-digit number "+number+" is: "+ob.sum_of_digits(number));
	    }
	}
	public int sum_of_digits(int number)
	{
		int remainder,sum=0;
		int temp=number;
		while(temp>0)
		{
			remainder=temp%10;
			sum=sum+remainder;
			temp=temp/10;
		}
		return sum;
	}
}