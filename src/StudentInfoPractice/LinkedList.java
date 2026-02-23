package StudentInfoPractice;

public class LinkedList {
    StudentInfo front = null;
    StudentInfo end = null;
    int numInList;

    // public static void LinkedList() {
    // }

    public void addToFront(StudentInfo student) {
        student.link = front;
        front = student;

        // System.out.printlnstudent)
    }   

    public void removeFromFront() {
        front = front.link;
    }
    
    public void addToRear(StudentInfo student) {
        if(front == null) {
            front = student; // TODO: fix u moron
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

    public void removeFromRear() {
        if(front == null) {
            System.out.println("List is empty.");
            return;
        }

        StudentInfo currentStudent = front;

        while(true) {
            if(currentStudent.link.link == null) {
                currentStudent.link = null;
                break;
            }

            currentStudent = currentStudent.link;
        }
    }

    public void printStudent(StudentInfo student) {
        System.out.println(
            "-----------------------------------------------\n" +
            "Student Number: " + student.studentNumber + "\n" +
            "Name: " + student.name
        );
    }

    public void printList() {
        StudentInfo currentStudent;
        
        if(front == null) {
            // print err
            System.out.println("List is empty.");
            return;
        }

        System.out.println(
            "===================================================\n" +
            "Printing list:"
        );

        currentStudent = front;

        while(true) {
            printStudent(currentStudent);

            currentStudent = currentStudent.link;

            if(currentStudent == null) {
                break;
            }
        }
    }
} 