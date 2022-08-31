//DYNAMIC ARRAY
package testr;
import java.util.*;
public class dynamic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("DYNAMIC ARRAY ");
      List<Integer> arrlist=new ArrayList<Integer>(5); 
      for(int i=1;i<=5;i++)
      {
    	  arrlist.add(i);//add element in dynamic array
      }
      System.out.println(arrlist);
          arrlist.remove(2);//removes element at given index
      System.out.println(arrlist);
      for(int i=0;i<arrlist.size();i++)
      {
    	  System.out.print(arrlist.get(i)+" ");
      }
      System.out.println("\n");
      for(int i:arrlist)
      {
    	  System.out.print(i);
      }
      
	}

}
