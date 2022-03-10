package JavaRecap;

import java.util.HashSet;

public class Set_Concept {

	public static void main(String[] args) {
		
		HashSet<String> s=new HashSet<String>();
		s.add("Arun");
		s.add("Abhishek");
		s.add("bala");
		s.add("Banu");
		s.add("Arun");
		System.out.println(s);
		s.add("null");
	   if(s.contains("Bala"))
	   {
		   System.out.println("yes");
	   }
	   else
	   {
		   System.out.println("No");
	   }

	}

}
