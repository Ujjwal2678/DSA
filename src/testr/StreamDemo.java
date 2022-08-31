package testr;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> numberList=new ArrayList<>();
		numberList.add(10);
		numberList.add(20);
		numberList.add(30);
		numberList.add(40);
//		//without using stream
//		List<Integer> squaresList=new ArrayList<>();
//		for(Integer i : numberList)
//		{
//			squaresList.add(i*i);
//		}
//	
		
		//Using stream
	    List<Integer> squaresList=numberList.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("List of Squared numbers :"+ squaresList);
		
/////////////////////////////////////////////////////////////////	
		//without using stream
//		Set<Integer> squaresSet=new HashSet<>();
//		for(Integer i : numberList)
//			{
//				squaresSet.add(i*i);
//			}
		
		//using stream
		Set<Integer> squaresSet=numberList.stream().map(x -> x*x).collect(Collectors.toSet());
		System.out.println("set of Squared numbers :"+ squaresSet);
		
		
/////////////////////////////////////////////////////////////////
		
		List<String> languages=new ArrayList<>();
		languages.add("python");
		languages.add("java");
		languages.add("scala");
		
		//without using stream
//		List<String> filterResult=new ArrayList<>();
//		for(String s: languages) {
//			if(s.startsWith("p")) {
//				filterResult.add(s);
//			}
//		}
		//using stream
		List<String> filterResult=languages.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
		System.out.println("Languages starting with p :"+ filterResult);
		
		List<String> sortedList=languages.stream().sorted().collect(Collectors.toList());
		System.out.println("Languages sorted alphabetically:"+sortedList);
		
		
		System.out.println("printing all elements one by one ");
		languages.stream().forEach(y->System.out.println("element is: "+y));
		
		//demonstration of reduce method
		int sum=numberList.stream().reduce(0,(ans,i)->ans+i );
		System.out.println("sum of all elements in the numberlist: "+sum);
		
		
	}

}
