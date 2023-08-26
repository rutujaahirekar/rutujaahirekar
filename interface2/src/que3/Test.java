package que3;

public class Test implements I1,I2 {
	
	public void m1() {
		
		System.out.println("m1--i");
		
	}
    public void m2() {
		
		System.out.println("m2--i");
		
	}
	
	
	public static void main(String args[])
	{
		
	I1 i1=new Test();
	i1.m1();
	
	I2 i = new Test();
	i.m2();
	
	
	
	}


}
