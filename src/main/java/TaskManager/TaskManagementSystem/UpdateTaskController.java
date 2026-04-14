package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class UpdateTaskController {
    //POST request with @ Request Body
    @PostMapping("/update")
    String todoWithPutRequestBody(@RequestBody String body,@RequestBody  int age){
        return body+age;
    }
}
