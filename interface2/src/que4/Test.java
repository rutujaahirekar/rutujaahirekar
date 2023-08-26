package que4;

public class Test implements A,B {
	
	public void m1(){
		
		System.out.println("m1 method");
	}
	public int m2()
	{
		
		return 10;
	}
     	public static void main(String args[]){	
     		
     		A a = new Test();
     		a.m1();
     		B b = new Test();
     		
     		int x = b.m2();
     		System.out.println(x);
	
     		
   	}


}
