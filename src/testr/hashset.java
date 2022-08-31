 //HASHSET
package testr;
import java.util.*;
public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("HASHSET ");
      HashSet<String> hashset=new HashSet<String>(); 
      hashset.add("A");
      hashset.add("B");
      hashset.add("B");
      System.out.println(hashset);
     if(hashset.contains("B"))
     {System.out.println("B is present");}
      
	}

}