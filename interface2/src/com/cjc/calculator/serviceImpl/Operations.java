package com.cjc.calculator.serviceImpl;

import java.util.Scanner;

import com.cjc.calculator.service.Calculator;


public class Operations implements Calculator
{
 
	
	 Scanner sc = new Scanner(System.in);
	public void add()
	{  
	System.out.println("enter first number");
	      int num1 = sc.nextInt();
	     System.out.println("enter second number");
	      int num2 = sc.nextInt();
	      int z = num1+num2;
	     System.out.println("addition= " +z);
	}
	public void sub()
	     {
	     System.out.println("enter first number");
	      int num1 = sc.nextInt();
	     System.out.println("enter second number");
	      int num2 = sc.nextInt();
	      int z = num1-num2;
	     System.out.println("substraction = " +z);
	     }
	public void mul()
	{
	System.out.println("enter first number");
	      int num1 = sc.nextInt();
	     System.out.println("enter second number");
	      int num2 = sc.nextInt();
	      int z = num1*num2;
	     System.out.println("multiplication= " +z);
	}
	public void div()
	{
	System.out.println("enter first number");
	      int num1 = sc.nextInt();
	     System.out.println("enter second number");
	      int num2 = sc.nextInt();
	      int z = num1/num2;
	     System.out.println("division= " +z);

	}


	}
	

