package JavaRecap;

import java.util.LinkedHashSet;

class Student {
			  
		    int rollNo;
		    String name;
		  
		    Student(int r, String s)
		    {
		        rollNo = r;
		        name = s;
		    }
		}
		public class Set_User {

			public static void main(String[] args) {
		    {
		        Student stu1 = new Student(1, "Akshay");
		        Student stu2 = new Student(2, "Banu");
		        Student stu3 = new Student(3, "Chithu");
		        Student stu4 = new Student(4, "Darun");
		        LinkedHashSet<Student> set = new LinkedHashSet<>();
		 
		        set.add(stu1);
		        set.add(stu2);
		        set.add(stu3);
		       // set.add(stu4);
		 
		        if (set.contains(stu4))
		        {
		            System.out.println(stu4.name+ " is present in set.");
		        }
		        else
		        {
		            System.out.println(stu4.name+ " is not present in set.");
		        }
		    }

	}

}
