package com.raphaelrychard.service.tasks;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TasksControllers {

    private final TasksRepository tasksRepository;

    public TasksControllers(TasksRepository tasksRepository) {
        this.tasksRepository = tasksRepository;
    }

    @PostMapping
    public ResponseEntity<TasksEntity> createTask(@RequestBody TaskRequest taskEntity) {
        TasksEntity tasksEntity = new TasksEntity(taskEntity);
        return ResponseEntity.ok(this.tasksRepository.save(tasksEntity));
    }
}
