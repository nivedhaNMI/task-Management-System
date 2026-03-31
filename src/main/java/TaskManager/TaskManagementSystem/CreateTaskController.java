package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CreateTaskController {
    @GetMapping("/CreateTaskController")
    String createTask(){
        return "Creating....";
    }
}
