package hashcode;

 class Main {
	 public static void main (String args[])
	 {
		 Student john1=new Student ("KEVIN",23,"California");
		 Student john2 =new Student ("JOHN",23,"California");
		 Student john3=new Student ("JOHN",23,"California");
		 
		 System.out.println(john1.equals(john2));
		 
	 }

}
