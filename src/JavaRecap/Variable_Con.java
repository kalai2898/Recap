package JavaRecap;

public class Variable_Con {
	static int b=50;//static variable
	int i=20;//local variable
	final int c=80;
	
	public void sample()
	{
		System.out.println(c);
		int i=40;//class variable 
		System.out.println(i);
		System.out.println(i);
		System.out.println(b);
	}
	

	public static void main(String[] args) {
		Variable_Con  s= new Variable_Con ();
		s.sample();
		System.out.println(s.i);
		System.out.println(b);
		

	}

}
