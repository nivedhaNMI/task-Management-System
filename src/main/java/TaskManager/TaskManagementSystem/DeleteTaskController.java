package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTaskController {
    @GetMapping("/DeleteTaskController")
    String createTask(){
        return "Deleting data....";
    }
}
