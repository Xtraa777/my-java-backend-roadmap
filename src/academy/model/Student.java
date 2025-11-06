package academy.model;

import java.util.Objects;

public class Student implements Comparable<Student> {

    private String studentId;
    private String name;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(studentId);
    }

    @Override
    public int compareTo(Student other) {
        return studentId.compareTo(other.studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
            "studentId='" + studentId + '\'' +
            ", name='" + name + '\'' +
            '}';
    }
}
