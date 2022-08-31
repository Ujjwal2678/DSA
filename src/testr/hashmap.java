//HASHMAP
package testr;

import java.util.*;
import java.util.Map.Entry;

public class hashmap {

	public static void main(String[] args) {
		System.out.println("HASHMAP ");
	      HashMap<String, Integer> map=new HashMap<>(); //string is for key int is for integers
          map.put("a", 10);
          map.put("b", 20);
          map.put("c", 30);
          System.out.println("Size of map is: "+map.size());
          System.out.println(map);
          if(map.containsKey("a"))
          {
        	  Integer a=map.get("a");
        	  System.out.println("value for key "+"\"a\"is : "+a);
          }
          for(String key:map.keySet())
          {
        	  System.out.println("key: "+key+" value :"+map.get(key));  
          }
          //another way
          //each entry has a key and value
          for(Entry<String,Integer> entry:map.entrySet())
          {
        	  System.out.println("key - "+entry.getKey()+" value :"+entry.getValue());  
          }
	}

}
