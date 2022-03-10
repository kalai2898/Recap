package JavaRecap;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Con {

	public static void main(String[] args) {
			  ArrayList<Integer> li= new ArrayList<Integer>();
			  li.add(50);
			  li.add(20);
			  li.add(40);
			  li.add(10);
			  System.out.println(li);
			  System.out.println("+++++++++++++++++++++++++++++");
			  li.remove(2);
			  li.add(40);
			  li.add(60);
			  li.add(70);
			  System.out.println(li);
			  
			  System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
			 for(int op:li)
			 {
				 System.out.println(op);
			 }
			  System.out.println("//////////////////////////////");
			  li.set(2, 100);
			  li.set(5, 700);
		System.out.println(li);
		//ArrayList in List
		List<Integer> l=new ArrayList<Integer>();
		l.add(0, 100);
		l.add(1, 500);
		l.add(2, 200);
		l.add(3, 300);
		System.out.println(l);


	}

}
