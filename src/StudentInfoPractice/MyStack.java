package StudentInfoPractice;

public class MyStack {
    StudentInfo top = null;
    int numInList;

    public void push(StudentInfo student) {
        student.link = top;
        top = student;
    }   

    public void pop() {
        top = top.link;
    }

    public void peek() {
        System.out.println(
            "-----------------------------------------------\n" +
            "Student Number: " + top.studentNumber + "\n" +
            "Name: " + top.name
        );
    }
}
