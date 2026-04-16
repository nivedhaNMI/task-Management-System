package TaskManager.TaskManagementSystem;

import TaskManager.TaskManagementSystem.models.TaskEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityReturnValueHandler;

@RestController
public class CreateTaskController {


    @GetMapping("/createController")
    String create(){
        return "Creating....";
    }
}


