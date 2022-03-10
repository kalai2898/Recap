package JavaRecap;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
	   int sum=0,m = 0;
	      Scanner sc=new Scanner(System.in);
	      int n = sc.nextInt();
	      while(n>0)
	      {
	    	  m = n%10;
	    	  sum= sum+m;
	    	  n=n/10;
	      }
	  
		System.out.println(sum);
	
	      /*String line = sc.nextLine();
	      System.out.println("Welcome to India,"+line);
	      
	      int i = sc.nextInt();
	      System.out.println("value of I:" +i);
	   
	      
	      String string = sc.next();
	      System.out.println("Input:"+string);*/

	}

}
