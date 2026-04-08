package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todo")
public class TodoController {
    @GetMapping("/getTodo")
    String getTodo(){
        return "ToDo List showing....";
    }
    //With Path variable int
    @GetMapping("/id/{id}")
    String getTodo(@PathVariable int id){
        return "ToDo List showing with id ...."+id;
    }
    @GetMapping("/name/{name}")
    String getName(@PathVariable String name){
        return "ToDo List showing with id ...."+name;
    }
}
