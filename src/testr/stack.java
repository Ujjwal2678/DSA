//STACK
//LIFO
package testr;
import java.util.*;
public class stack {
	public static void main(String[] args) {
	
      System.out.println("STACK ");
      Stack<String> stack=new Stack<>(); 
      stack.push("India") ;    
      stack.push("Australia") ;
      stack.push(" Switzerland") ;
      System.out.println("Stack :"+stack);
     stack.pop();
     System.out.println("Stack after popping :"+stack);
     //.peek function is used to view the top most element 
	}

}
