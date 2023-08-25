package com.cjc.akurddi;


import com.cjc.karve.A;
import com.cjc.karve.B;
import com.cjc.karve.C;
import com.cjc.akurddi.X;
import com.cjc.akurddi.Y;

public class Z extends X {
	
	public void zz(){
		
        Z z=new Z();
		z.m1();
		z.m4();
		
		X x=new X();
		x.m1();   	

		A a=new A();
		a.m1();
	}
	
	
   public static void main(String[] args)
   {
	
	   C c1 = new C();
	     c1.aa();
	   c1.cc();
	   
	   B b1 = new B();
	   b1.bb();
	   
	   X x1 = new X();
	   x1.xx();
	   
	   Y y1 = new Y();
	   y1.yy();
	   
	   Z z1 = new Z();
	   z1.zz();
	   
	   
	   
	   
	   
	   
	}
}
