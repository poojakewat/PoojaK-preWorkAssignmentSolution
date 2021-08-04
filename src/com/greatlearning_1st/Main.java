package com.greatlearning_1st;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	int input;

	//function to checkPalindrome

	public void checkPalindrome()  {

		input = sc.nextInt();
		int sum=0;
		int temp=input;
		int r;
		//System.out.println("The given no "+input+"is palindrome");
		while(temp>0) {
			r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		if(sum==input)
			System.out.println("The given no: "+input+" is a palindrome number\n");
		else
			System.out.println("The given no: "+input+" is a not palindrome number\n");
	}


	//function to printPattern

	public void printPattern() {
		input = sc.nextInt();

		for(int i=1;i<=input;i++) {
			for(int j=i;j<=input;j++){	
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//function to check no is prime or not

	public void checkPrimeNumber() {
		
		input = sc.nextInt();
		int m;
		boolean flag=false;
		if(input==0||input==1)
			flag=false;
		m=input/2;
		for(int i=2;i<=m;i++)
		{
			if(input%i==0) {
				flag=false;
				break;
			}
			flag=true;
		}
		if(flag)
			System.out.println("The given number: "+input+" is a Prime Number\n");
		else
			System.out.println("The given number: "+input+" is not a Prime Number\n");

	}
	// function to print Fibonacci Series

	public void printFibonacciSeries() {

		//initialize the first and second value as 0,1 respectively.
		input = sc.nextInt();
		int first = 0, second = 1;
		int temp=0;
		System.out.print(first+" "+second);
		for(int i=2;i<input;i++) {
			temp=first+second;
			System.out.print(" "+temp);
			first=second;
			second=temp;
			
		}
		System.out.println();
	}
	//main method which contains switch and do while loop

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

			System.out.println();

			choice = sc.nextInt();

			switch (choice) {

			case 0:

				choice = 0;

				break;



			case 1: {

				obj.checkPalindrome();

			}

			break;



			case 2: {

				obj.printPattern();

			}

			break;
			case 3: {

				obj.checkPrimeNumber();

			}

			break;

			case 4: {
				obj.printFibonacciSeries();

			}

			break;
			default:

				System.out.println("Invalid choice. Enter a valid no.\n");

			}

		} while (choice != 0);
		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
