package JavaRecap;


public class String_Con {

	

	public static void main(String[] args) {
		String str="Kalaivani";
		String ch="K";
		System.out.println(str);
		System.out.println("Character:"+ch);
		int size=str.length();
		System.out.println(size);
		System.out.println("index of v :"+str.indexOf('v'));
		
	   String[] st=str.split("", size);
	   for(int i=0;i<size;i++)
	   {
		   System.out.println(st[i]);
	   }
	   
	   
	   System.out.println("hashCode: " + ch.hashCode());
	   System.out.println("hashCode: " + System.identityHashCode(ch));
	   
	   String str1="KALAIVANI";
	       char at = str.charAt(4);
	       System.out.println(at);
	       
	     boolean b = str.endsWith(ch);
	     System.out.println(b);
	     
	   int c = str.compareToIgnoreCase(str1);
	   System.out.println(c);
	   
	   boolean d = str.contains(ch);
	   System.out.println(d);
	   
	   boolean e = str.equalsIgnoreCase(str1);
	   System.out.println(e);
	   
	 String r = str.replace('a', 'o');
	 System.out.println(r);
	 
	 String str2=str.substring(size-2);
	 System.out.println(str2);
	 
	 
	 String of = str.valueOf(at);
	 System.out.println(of);
	 
	 boolean f = str.isEmpty();
	 System.out.println(f);
	 
	 int j='a';
	 System.out.println(j);//ASCII VALUE
	 
	 
	 boolean g = str1.isBlank();
	 System.out.println(g);
	   
	System.out.println("+++++++++++++++++++++++++++++++++++++");
	  String a=new String("abc");
	  String b1=new String("Cde");
	  if(a==b1)
	  {
		  System.out.println("true");
	  }
	  else
	  {
		  System.out.println("false");
	  }
	  System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
	  for(int i=size-1;i>=0;i--)
	  {
		  System.out.print(str.charAt(i));
	  }


		

	}

}
