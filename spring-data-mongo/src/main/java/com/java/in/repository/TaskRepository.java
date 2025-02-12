package com.java.in.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.java.in.model.Task;

import java.util.List;

public interface TaskRepository extends MongoRepository<Task,String> {

    List<Task> findByAssigneeAndPriority(String assignee, String priority);

    @Query(value = "{assignee: ?0 ,priority: ?1}",fields = "{'description' : 1 , 'storyPoint': 2}")
    List<Task> finTaskWithAssigneeAndPriority(String assignee, String priority);

    //operator (IN/LIKE/BETWEEN)
    //pagination & sorting
}
