import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class StudentsList {
    HashSet<String> studentsIds = new HashSet<>();

    List<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        if (!studentsIds.contains(student.getStudentId())) {
            studentsList.add(student);
            studentsIds.add(student.getStudentId());
        }else {
            System.out.println("Данный номер студенческого билета уже существует!");
        }
    }

    public void printList() {
        for (Student student : studentsList) {
            System.out.println(student.toString());
        }
    }
}