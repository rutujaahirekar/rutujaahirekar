package com.cjc.calculator.client;
import com.cjc.calculator.*;
import com.cjc.calculator.client.*;
import com.cjc.calculator.service.Calculator;
import com.cjc.calculator.serviceImpl.Operations;

import java.util.Scanner;

public class Test {
  
	
	public static void main(String[] args) {
		
		Calculator c = new Operations();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.println("Please Enter Your Choice : \n"
				+ "1. Addition \n"
				+ "2. Substraction \n"
				+ "3. Multiplication \n"
				+ "4. Division");
		
		System.out.println("enter your choice");
		int x = sc.nextInt();
				
		switch(x)
		{
		case 1 :
			c.add();
			break;
		
        case 2 :
			c.sub();
			break;
		
	    case 3 :
		c.mul();
		break;
         case 4 :
			c.div();
			break;
		}
	}
		}
		
			
			
		
	}

