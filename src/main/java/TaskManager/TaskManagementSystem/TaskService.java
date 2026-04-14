package TaskManager.TaskManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public String taskPrint() {
        return taskRepository.getAllTask();
    }
}