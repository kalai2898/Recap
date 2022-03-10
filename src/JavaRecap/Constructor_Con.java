package JavaRecap;

public class Constructor_Con {
	
	public Constructor_Con()//Non parameterized
	{
		System.out.println("Hello World!!");
	}
	
	public Constructor_Con(int a,float b)//parameterized
	{
		System.out.println("Value of A:" +a +"Value of B:" +b);
	}
	

	public static void main(String[] args) {
		Constructor_Con c=new Constructor_Con();
		Constructor_Con cc= new Constructor_Con(10,20);

	}

}
