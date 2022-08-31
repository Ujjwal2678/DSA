//QUEUE
//FIFO
package testr;
import java.util.*;
public class queue {
	public static void main(String[] args) {
		
	      System.out.println("QUEUE ");
	      Queue<String> queue=new PriorityQueue<>(); 
	      //priority queue does automatic sorting 
	      queue.add("India") ;    
	      queue.add("Australia") ;
	      queue.add("Switzerland") ;
	      System.out.println("Queue :"+queue);//random order when printing
	     queue.remove();
	     System.out.println("Queue after popping :"+queue);
	     //.peek function is used to view the head 
	     //queue.peek();
	     //.poll to removes as well as returns the head element 
		}

}
