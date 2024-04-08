package www.deepak.oops.program;

public class StudentClient {
	public static void main(String[] args) {
		Student s = new Student();
		Student s2 = new Student();
		s.setName("Deepak");
		s.setAge(23);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		s2.setName("Ashish");
		s2.setAge(26);
		System.out.println(s2.getName());
		System.out.println(s2.getAge());
	}

}
