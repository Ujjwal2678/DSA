//TREEMAP
//the tree set brings the elements in natural order of the keys
package testr;

import java.util.*;

public class treemap {

	public static void main(String[] args) {
		System.out.println("TREEMAP ");
	      TreeMap<Integer, String> map=new TreeMap<>(); //string is for key int is for integers
        map.put(3,"a");
        map.put(1,"b" );
        map.put(2,"c");
        System.out.println("Size of map is: "+map.size());
        System.out.println(map);

	}

}
