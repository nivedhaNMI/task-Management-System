package TaskManager.TaskManagementSystem.dto;


import lombok.Data;

@Data
public class TaskPatchRequest {

    private String title;
    private String description;
    private Boolean completed;
}