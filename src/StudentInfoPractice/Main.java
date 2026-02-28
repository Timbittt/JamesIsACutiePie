// #TODO: test empty stack

package StudentInfoPractice;

public class Main {
	public static void main(String[] args) {
		
		// QUEUE TEST:
		MyQueue queue = new MyQueue();

		StudentInfo student = new StudentInfo(1, "a");
		queue.enqueue(student);

		student = new StudentInfo(2, "b");
		queue.enqueue(student);

		student = new StudentInfo(3, "c");
		queue.enqueue(student);

		student = new StudentInfo(4, "james");
		
		queue.enqueue(student);

		queue.displayQueue();
		queue.dequeue();

		queue.peek();

		queue.dequeue();

		queue.peek();

		queue.displayQueue();


		// STACK TEST
		MyStack stack = new MyStack();

		student = new StudentInfo(1, "a");
		stack.push(student);

		student = new StudentInfo(2, "b");
		stack.push(student);

		student = new StudentInfo(3, "c");
		stack.push(student);

		student = new StudentInfo(4, "james");
		stack.push(student);

		stack.pop();

		stack.peek();

		stack.pop();

		stack.peek();

		stack.displayStack();
	}
}
