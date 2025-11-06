package academy;

import academy.model.Course;
import academy.model.Student;
import academy.repository.CourseRepository;
import academy.repository.StudentRepository;
import academy.service.CourseService;
import java.util.List;
import java.util.Set;

public class AcademyMain {

    public static void main(String[] args) {
        StudentRepository studentRepo = new StudentRepository();
        CourseRepository courseRepo = new CourseRepository();

        CourseService courseService = new CourseService(studentRepo, courseRepo);

        studentRepo.addStudent(new Student("101", "김철수"));
        studentRepo.addStudent(new Student("102", "박영희"));
        studentRepo.addStudent(new Student("103", "홍길동"));

        courseRepo.addCourse(new Course("CS101", "Java 프로그래밍"));
        courseRepo.addCourse(new Course("CS102", "자료구조"));

        courseService.enrollStudent("101", "CS101");
        courseService.enrollStudent("102", "CS101");
        courseService.enrollStudent("102", "CS102");
        courseService.enrollStudent("103", "CS101");

        System.out.println("[알림] '101' 학생 'CS101' 중복 수강 신청 시도...");
        courseService.enrollStudent("101", "CS101");
        System.out.println();

        System.out.println("--- 'Java 프로그래밍' 수강생 (ID순 / TreeSet 자동 정렬) ---");
        Set<Student> javaStudents = courseService.getStudentsInCourse("CS101");

        for (Student s : javaStudents) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("--- 전체 학생 (이름순 / Comparator 정렬) ---");
        List<Student> allStudentsSorted = courseService.getAllStudentsSortedByName();
        for (Student s : allStudentsSorted) {
            System.out.println(s);
        }
    }
}
