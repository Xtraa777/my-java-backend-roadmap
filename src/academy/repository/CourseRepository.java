package academy.repository;

import academy.model.Course;
import java.util.HashMap;
import java.util.Map;

public class CourseRepository {

    private Map<String, Course> courses;

    public CourseRepository() {
        this.courses = new HashMap<>();
    }

    public void addCourse(Course course) {
        courses.put(course.getCourseId(), course);
    }

    public Course findById(String courseId) {
        return courses.get(courseId);
    }
}
