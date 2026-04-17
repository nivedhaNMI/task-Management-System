package TaskManager.TaskManagementSystem.service;

import TaskManager.TaskManagementSystem.models.TaskEntity;
import TaskManager.TaskManagementSystem.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import TaskManager.TaskManagementSystem.dto.TaskPatchRequest;
@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public String taskPrint() {

        return "Task service working";
    }

    public TaskEntity createTask(TaskEntity taskEntity) {
        return taskRepository.save(taskEntity);// this is to see if POST worked
    }
    public void deleteTask(int id) {
        TaskEntity existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        taskRepository.delete(existingTask);
    }

    public TaskEntity updateTask(int id, TaskEntity updatedTask) {
        // this is to see if PUT worked
        TaskEntity existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        existingTask.setTitle(updatedTask.getTitle());
        existingTask.setDescription(updatedTask.getDescription());
        existingTask.setCompleted(updatedTask.getCompleted());

        return taskRepository.save(existingTask);
    }

    public TaskEntity patchTask(Integer id, TaskPatchRequest request) {
        TaskEntity existingTask = taskRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Task not found"));

        if (request.getTitle() != null) {
            existingTask.setTitle(request.getTitle());
        }

        if (request.getDescription() != null) {
            existingTask.setDescription(request.getDescription());
        }

        if (request.getCompleted() != null) {
            existingTask.setCompleted(request.getCompleted());
        }

        return taskRepository.save(existingTask);
    }
}