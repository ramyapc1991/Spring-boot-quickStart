package io.javabrains.springboot.topic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String topicId;
    private String name;
    private String desc;

    public Topic(){

    }

    public Topic(String topicId, String name, String desc) {
        this.topicId = topicId;
        this.name = name;
        this.desc = desc;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
