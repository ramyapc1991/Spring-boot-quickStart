package io.javabrains.springboot.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    public CourseRepository courseRepository;

    public List<Course> getAllCourses(String topicId){
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicTopicId(topicId).forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id){
        return courseRepository.findByCourseId(id);
    }

    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    public void updateCourse(Course topic) {
        courseRepository.save(topic);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
