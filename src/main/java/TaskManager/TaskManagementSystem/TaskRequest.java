package TaskManager.TaskManagementSystem;

public class TaskRequest {

    private String body;
    private  int id;
    public TaskRequest() {
    }


    public int getId() {
        return id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setId(int id) {
        this.id = id;
    }
}
