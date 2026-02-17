package StudentInfoPractice;

public class StudentInfo {
	public int studentNumber;
	public String name;
	public StudentInfo link;

	public StudentInfo() {
		studentNumber = 0;
		name = "student";
		link = null;
	}
	
	public StudentInfo(int studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
		link = null;
	}
	
	public void printName() {
		System.out.println("Students name is:\n" + name);
	}
}
