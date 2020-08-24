package io.javabrains.springboot.course;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

    Course findByCourseId(String id);
    List<Course> findByTopicTopicId(String topicId);
}
