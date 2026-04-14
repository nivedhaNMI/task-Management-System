package TaskManager.TaskManagementSystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateSpecificDataController {
    @GetMapping("/UpdateSpecificDataController")
    String updateSpecific(){
        return "Specific data to be changed";
    }
}
   