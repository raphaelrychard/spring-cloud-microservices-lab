package com.raphaelrychard.service.tasks;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity(name = "Task")
@Table(name = "task")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TasksEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String email;
    private LocalDateTime deadLine;
    private boolean notified;

    public TasksEntity(TaskRequest taskRequest) {
       this.title = taskRequest.title();
       this.email = taskRequest.email();
       this.deadLine = taskRequest.dueDate();
       this.notified = taskRequest.notified();
    }
}
