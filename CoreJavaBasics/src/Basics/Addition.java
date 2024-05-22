package Basics;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		System.out.println("Finland");
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values:");
		a=s.nextInt();
		b=s.nextInt();
		c=a+b;
		System.out.println("Addition of a="+a+" and b="+b+" is:"+c);
	}

}
