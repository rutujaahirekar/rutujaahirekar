package com.cjc.akurdi;

import com.cjc.karvenagar.*;

public class C extends A
{
  A a = new A ();
  
  public void m4() {
	
	 // System.out.println(a.x); error because of parent class refrence
	  
	  C c = new C();
	  
	 System.out.println(c.x);
      System.out.println(x);
      
  }
  
}
