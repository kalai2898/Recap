package JavaRecap;

import java.util.Arrays;

public class Array_Concept {

	public static void main(String[] args) {

			int i,j;
		  int a[]= {10,20,30,40,50};
		  int size=a.length;
		  System.out.println(size);
		  System.out.println("======================================");
		  
		  for(i=0;i<size;i++)
		  {
			  System.out.println(a[i]);
		  }
		  System.out.println("=======================================");
		  int[] a1=new int[] {10,20,30,40,50};
		  int[] b1=new int[] {50,60,70,80,20};
		  if(Arrays.equals(a1,b1))
		  {
			  System.out.println("is Equal");
		  }
		  else
		  {
			  System.out.println("is Not Equal");
		  }
		 System.out.println("============================================="); 
		 int k,l;
		 int[] c1= {200,50,60,20,40};
		  
		  Arrays.sort(c1);
		  System.out.println("After Sorting");
		  for(k=0;k<c1.length;k++)
		  {
			  System.out.println(c1[k]);
		  }
		  
	}

}
