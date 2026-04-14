package TaskManager.TaskManagementSystem;

import org.springframework.stereotype.Component;

@Component
public class TaskRepository {

    public String getAllTask() {
        return "Getting Tasks";
    }
}