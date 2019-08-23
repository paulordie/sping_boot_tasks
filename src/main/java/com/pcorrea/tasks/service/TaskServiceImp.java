package com.pcorrea.tasks.service;

import com.pcorrea.tasks.domain.Task;
import com.pcorrea.tasks.repository.TaskRepository;

public class TaskServiceImp implements TaskService {

    private TaskRepository taskRepository;

    public TaskServiceImp(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }
}
