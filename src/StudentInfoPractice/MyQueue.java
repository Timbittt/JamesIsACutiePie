package StudentInfoPractice;

public class MyQueue {
    StudentInfo front = null;
    int numInQueue;

    public void displayQueue() {
        StudentInfo student = front;

        System.out.println("Printing all students:");

        while (true) {
            if (student == null) {
                if (front == null) {
                    System.out.println("List is empty");
                }

                System.out.println("+--------------------");

                break;
            }

            System.out.println(
                "+--------------------\n" +
                "|Name: " + student.name + '\n' +
                "|Student#: " + student.studentNumber
            );

            student = student.link;
        }
    }
    
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

    public StudentInfo peek() {
        return front;

        // System.out.println(
        //     "Printing top student:\n" +
        //     "+-------------------+\n" +
        //     "|Student Number: " + front.studentNumber + "\n" +
        //     "|Name: " + front.name + '\n' +
        //     "+-------------------+\n"
        // );
    }
}
