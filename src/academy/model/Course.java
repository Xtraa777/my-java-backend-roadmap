package academy.model;

import java.util.*;

public class Course {

    private String courseId;
    private String title;
    private Set<Student> students;

    public Course(String courseId, String title) {
        this.courseId = courseId;
        this.title = title;
        this.students = new TreeSet<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public String getCourseId() {
        return courseId;
    }

    public String getTitle() {
        return title;
    }

    public Set<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "Course{" +
            "courseId='" + courseId + '\'' +
            ", title='" + title + '\'' +
            '}';
    }
}
