package StudentInfoPractice;

import java.util.ArrayList;
// import java.util.List;

public class List {
    public static ArrayList<StudentInfo> students = new ArrayList<>();

    // public static void List() {
    // }

    public void addToFront(StudentInfo newStudent) {
        students.add(0, newStudent);        
    }

    public void printList() {
        for(int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}
