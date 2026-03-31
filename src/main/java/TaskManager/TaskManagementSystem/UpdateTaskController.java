package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateTaskController {
    @GetMapping("/UpdateTaskController")
    String createTask(){
        return "Updating....";
    }
}
