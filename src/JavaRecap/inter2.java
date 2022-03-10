package JavaRecap;

public class inter2 implements Inter{
	 
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println("Sum of Two number:" +(a+b));
	}
	@Override
	public void Sub() {
		int c=40;
		int d=20;
		System.out.println("Two Numbers="+(c-d));
		
	}

	public static void main(String[] args) {
		inter2 i= new inter2();
		i.Sub();
		i.add();
	 

	}

	

}
