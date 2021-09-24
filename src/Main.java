import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentsList studentsList = new StudentsList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите информацию о студенте: \"ФИО, номер группы, номер студенческого билета\"");

        while (true) {
            String[] segments = scanner.nextLine().split(",");
            if (segments[0].equals("end")) {
                break;
            }
            Student student = new Student(segments[0].trim(), segments[1].trim(), segments[2].trim());
            studentsList.addStudent(student);

            System.out.println("Введите информация о студенте (для завершения работы программы введите \"end\")");
        }
        studentsList.printList();
    }
}