
class Student{
	int sId;
	String name;
	static String COLLEGE_NAME="RNSIT";
	
	public Student(int sId, String name) {
		this.sId = sId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ",COLLEGE_NAME="+ COLLEGE_NAME +"]";
	}
	
	static void disp() {
		int x=10;
		System.out.println(x);
	}
	
}
public class StaticVariableDemo {

	public static void main(String[] args) {
		System.out.println(Student.COLLEGE_NAME+ "Students");
    	Student s1=new Student(101,"Manoj Kowshik");
    	Student s2=new Student(102,"Rakesh");
    	Student s3=new Student(103,"Sandeep");
    	
    	System.out.println(s1);
    	System.out.println(s2);
    	System.out.println(s3);
    	Student.disp();
	}

}

