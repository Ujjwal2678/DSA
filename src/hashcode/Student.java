package hashcode;


   class Student {

		private String name;
		private int rollNumber;
		private String address;
		
		//constructor 
		public Student(String name ,int rollNumber, String address) {
			this.name=name;
			this.rollNumber=rollNumber;
			this.address=address;
		}
		
		public void setName(String name) {
			this.name=name;
		 }
		public void setrollNumber(int rollNumber) {
			this.rollNumber=rollNumber;
		 }
		public void setAddress(String address) {
			this.address=address;
		 }
		public String getName() {
			return name;
		}
		public int getrollNumber() {
			return rollNumber;
		}
		public String getAddress() {
			return address;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			
			if (obj==null || obj.getClass() != this.getClass())
				return false;
			
			Student student =(Student)  obj;
			
			return (student.rollNumber==this.rollNumber);		
		}
		
		@Override
		public int hashCode() {
			return this.rollNumber;
		}
	
	}


