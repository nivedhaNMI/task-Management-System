package TaskManager.TaskManagementSystem.repository;

import TaskManager.TaskManagementSystem.models.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
}