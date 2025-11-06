package academy.service;

import academy.model.*;
import academy.repository.CourseRepository;
import academy.repository.StudentRepository;
import java.util.*;

public class CourseService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;

    public CourseService(StudentRepository studentRepository, CourseRepository courseRepository) {
        this.studentRepository = studentRepository;
        this.courseRepository = courseRepository;
    }

    public void enrollStudent(String studentId, String courseId) {
        Student student = studentRepository.findById(studentId);
        Course course = courseRepository.findById(courseId);

        if (student != null && course != null) {
            course.addStudent(student);
        } else {
            System.out.println("Student or Course not found");
        }
    }

    public Set<Student> getStudentsInCourse(String courseId) {
        Course course = courseRepository.findById(courseId);
        if (course != null) {
            return course.getStudents();
        }
        return Set.of();
    }

    public List<Student> getAllStudentsSortedByName() {
        Collection<Student> students = studentRepository.findAll();
        List<Student> studentList = new ArrayList<>(students);

        studentList.sort(new StudentNameComparator());

        return studentList;
    }
}
