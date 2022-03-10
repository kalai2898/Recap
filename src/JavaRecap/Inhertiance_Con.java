package JavaRecap;

public class Inhertiance_Con {
	//dataType $ Access Modifier
	protected void sample()
	{ 
		double i=10.5;
		System.out.println("value of i"+ i);
	}
	public void sample(int a,float b)//Overloading
	{
		System.out.println("value of a: " +a+ " value of b: " +b);
	}
	private void sample1(String str)
	{
		System.out.println(str+ "hello world!!!");
	}
	public static void main(String[] args)
	{
		Inhertiance_Con IC= new Inhertiance_Con();
		IC.sample();
		IC.sample(40, 50);
		IC.sample1("Kalaivani");
	}

}
