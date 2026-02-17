package StudentInfoPractice;

public class Main {
	public static void main(String[] args) {

		LinkedList List = new LinkedList();

		StudentInfo student = new StudentInfo(1, "a");
		List.addToFront(student);

		student = new StudentInfo(2, "b");
		List.addToFront(student);

		student = new StudentInfo(3, "c");
		List.addToFront(student);

		student = new StudentInfo(4, "james");
		List.addToRear(student);

		List.removeFromRear();

		List.printList();

		// List.removeFromFront();

		// List.printList();
	}
}
