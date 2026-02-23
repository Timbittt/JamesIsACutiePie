package StudentInfoPractice;

public class Main {
	public static void main(String[] args) {
		MyQueue List = new MyQueue();

		StudentInfo student = new StudentInfo(1, "a");
		List.enqueue(student);

		student = new StudentInfo(2, "b");
		List.enqueue(student);

		student = new StudentInfo(3, "c");
		List.enqueue(student);

		student = new StudentInfo(4, "james");
		List.enqueue(student);

		List.dequeue();

		List.peek();

		List.dequeue();

		List.peek();
	}
}
