package testgit;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the Input number:");
		int inputnumber = number.nextInt();
		//int inputnumber=3575;
		System.out.println("Enter the Digit:");
		int digit = number.nextInt();
		//sint digit=5;
		int m = 1;
		int sum = 0;
		//int temp=0;
		int rem=1;
		while(rem>0)
		{
			rem = inputnumber%10;
			inputnumber=inputnumber/10;

			if(rem==digit)
			{
				sum=(rem*m)-1;
			}
			else if(sum>0 && rem>0) 
			{
				sum=sum+((rem*m));
			}
			m=m*10;
		}

		System.out.println(sum);

	}

}
