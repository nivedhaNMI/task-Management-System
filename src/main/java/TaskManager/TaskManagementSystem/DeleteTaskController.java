package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteTaskController {
    @GetMapping("/DeleteTaskController")
    String deleteTask(){
        return "Deleting data....";
    }
}
