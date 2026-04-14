package TaskManager.TaskManagementSystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/task")
public class TaskController {
    //GET Request @ Path variable
    @GetMapping("/{id}")
    String taskWithId(@PathVariable int id){
        return "I am someone with ID: "+id;
    }
//POST Request with @ RequestParameter
    @PostMapping("/create")
    String taskWithPostRequestId(@RequestParam ("taskId")int id)
    {
        return  "I am Posting/Creating data with ID: "+id;
    }
    //POST request with @ Request Body
    @PostMapping("/create/bodyElements")
    String taskWithPostRequestBody(@RequestBody TaskRequest request){
        return "Body: "+ request.getBody()+" id: "+request.getId();
    }
    @Autowired
    private TaskService taskService;
    @GetMapping("/get")
    String getTask() {
        return taskService.taskPrint();
    }
    //POST request with @ Request Body

}
