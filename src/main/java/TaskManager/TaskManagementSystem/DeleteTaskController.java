package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/todo")
public class DeleteTaskController {
    @DeleteMapping("/delete/{id}")
    String todoWithPutRequestId(@PathVariable int id){
        return "Deleting your ID ..."+id;
    }}

