import java.io.*;
import java.util.*;


public class PrimeNo{
public static void main(String[] args) {
	
	int count=0;
	System.out.println("Enter a number: ");
	Scanner sc =new Scanner(System.in);
	int n=sc.nextInt();
	
	if(n==0||n==1||n==2)
	{
		System.out.println("It is a prime number ");
		
	}
	else {
		for(int i=2;i<=n;i++)
		{ if(n%i==0)
			count++;
			
		}
		if(count>1)
		{
		System.out.println("It is not a prime number ");
		}
		else
			System.out.println("It is  a prime number ");
	}
}
}
