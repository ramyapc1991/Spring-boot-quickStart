package io.javabrains.springboot.course;

import io.javabrains.springboot.topic.Topic;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    private String courseId;
    private String name;
    private String description;
    @ManyToOne
    private Topic topic;

}
