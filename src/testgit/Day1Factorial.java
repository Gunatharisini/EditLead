package testgit;

import java.util.Scanner;

public class Day1Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter the number:");
int factorial=1;
int factorialnumber=scan.nextInt();
for(int i=2;i<=factorialnumber;i++)
{
	factorial=factorial*i;
}
System.out.println(factorial);
scan.close();
	}

}
