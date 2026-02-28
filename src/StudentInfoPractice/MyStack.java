package StudentInfoPractice;

public class MyStack {
    StudentInfo top = null;
    int numInStack = 0;

    public void displayStack() {
        StudentInfo student = top;

        System.out.println("Printing all students:");

        while (true) {
            if (student.link == null) {
                if (top == null) {
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

    public void push(StudentInfo student) {
        student.link = top;
        top = student;
        numInStack++;
    }   
    
    public StudentInfo peek() {
        return top;

        // System.out.println(
        //     "Printing top student:\n" +
        //     "+-------------------+\n" +
        //     "|Student Number: " + top.studentNumber + "\n" +
        //     "|Name: " + top.name + '\n' +
        //     "+-------------------+\n"
        // );
    }
    
    public void pop() {
        top = top.link;
        numInStack--;
    }
}
