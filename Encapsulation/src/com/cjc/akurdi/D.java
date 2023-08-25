package com.cjc.akurdi;

import com.cjc.karvenagar.B;

public class D extends C {
	
	public void m5()
	{
	   C c = new C();
	   //System.out.println(c.x);   error because of parent class refrence
	   
	   D d = new D();
	    System.out.println(d.x);
	    
	    System.out.println(x);
	
	}
	
	public static void main(String[] args) {
		
		 D d1 = new D();
		 d1.m5();
		 d1.m4();
		 
		 B b1 = new B();
		 b1.m1();
		 
		
	}

}
