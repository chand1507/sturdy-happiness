package day4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = s.nextInt();
		
		try
		  {
			  if(age<18) 
				  throw new Ageexception("Invalid age");
			  else
				  System.out.println("Valid Age");
		  }
		catch(Ageexception a)
		{
			System.out.println(a);
		}
	}

}
