package TaskManager.TaskManagementSystem.service;

import TaskManager.TaskManagementSystem.models.TaskEntity;
import TaskManager.TaskManagementSystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public String taskPrint() {
        return "Task service working";
    }

    public TaskEntity createTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);
    }
}