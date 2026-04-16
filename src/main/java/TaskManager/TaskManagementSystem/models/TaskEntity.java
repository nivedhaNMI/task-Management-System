package TaskManager.TaskManagementSystem.models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class TaskEntity {
    @Id
    @GeneratedValue
    public Integer id;
    public String title;

    public boolean isCompleted;
    public String description;
}
