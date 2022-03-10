package JavaRecap;

public class Exception_Con  {

	public static void main(String[] args){
		
		try {
			int a=10;
			int b=0;
			int c=a/b;
 System.out.println(c);//Arithmetic
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

			
	
		//String s=null;
		//System.out.println(s.length());//null pointer
		
		finally
		{
			System.out.println("final is executed");
		}

	}

}
