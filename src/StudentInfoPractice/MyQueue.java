package StudentInfoPractice;

public class MyQueue {
    StudentInfo front = null;
    int numInList;

    public void dequeue() {
        front = front.link;
    }
    
    public void enqueue(StudentInfo student) {
        if(front == null) {
            front = student;
            return;
        }

        StudentInfo currentStudent = front;

        while(true) {
            if(currentStudent.link == null) {
                currentStudent.link = student;
                break;
            }

            currentStudent = currentStudent.link;
        }
    }

    public void peek() {
        System.out.println(
            "-----------------------------------------------\n" +
            "Student Number: " + front.studentNumber + "\n" +
            "Name: " + front.name
        );
    }
}
