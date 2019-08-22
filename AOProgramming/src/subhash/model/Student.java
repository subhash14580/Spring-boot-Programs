package subhash.model;

public class Student {
		private String name;
		private int rollno;
		public int getRollno() {
			return rollno;
		}
		public void setRollno(int rollno) {
			this.rollno = rollno;
		}
		private String course;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getCourse() {
			return course;
		}
		public void setCourse(String course) {
			this.course = course;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", rollNo=" + rollno + ", course=" + course + "]";
		}
		public void print(String type) {
			switch(type) {
				case "name":
					System.out.println("name is "+getName());
					break;
					
				case "rollNo":
					System.out.println("name is "+getRollno());
					break;
				case "course":
					System.out.println("name is "+getCourse());
					break;
			}
		}
		public void printThrowException() {
			throw new IllegalArgumentException();
		}
		
}
