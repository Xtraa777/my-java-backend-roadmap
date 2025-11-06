package academy.repository;

import academy.model.Student;
import java.util.*;

public class StudentRepository {

    private Map<String, Student> students;

    public StudentRepository() {
        this.students = new HashMap<>();
    }

    public void addStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

    public Student findById(String studentId) {
        return students.get(studentId);
    }

    public Collection<Student> findAll() {
        return students.values();
    }
}
