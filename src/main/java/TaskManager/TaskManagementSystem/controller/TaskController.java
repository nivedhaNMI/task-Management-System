package TaskManager.TaskManagementSystem.controller;

import TaskManager.TaskManagementSystem.models.TaskEntity;
import TaskManager.TaskManagementSystem.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/get")
    public String getTasks() {
        return taskService.taskPrint();
    }

    @PostMapping("/create")
    public ResponseEntity<TaskEntity> createTask(@RequestBody TaskEntity taskEntity) {
        TaskEntity createdTask = taskService.createTask(taskEntity);
        return new ResponseEntity<>(createdTask, HttpStatus.CREATED);
    }
}







/*
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
    @PostMapping("/CreateTask")
    ResponseEntity<TaskEntity> createUser(@RequestBody TaskEntity taskEntity){
        return new ResponseEntity<>(taskService.createTask(taskEntity), HttpStatus.CREATED);
    }
}*/
