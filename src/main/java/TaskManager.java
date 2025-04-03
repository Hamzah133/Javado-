import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks; // hint: will change in iteration 3

    public TaskManager() {

        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {

        tasks.add(task);
    }

    public List<Task> listTasks() {
        for(int i=0;i<tasks.size();i++){
            System.out.println("\n====Task "+(i+1)+"====");
            System.out.println("title: "+tasks.get(i).getTitle());
            System.out.println("description:"+tasks.get(i).getDescription());
            System.out.println("status:"+tasks.get(i).isComplete());
        }
        return tasks;
    }
//public void listTasks() {
//    for(int i=0;i<tasks.size();i++){
//        System.out.println(tasks.get(i).title);
//    }
//}

    public void deleteTask(Task task){
//        leave for iteration 4
//        for(int i=0;i>tasks.size();i++){
//            if (tasks.get(i).title==task.title){
//                tasks.remove(i);
//            }
//        }
        if (tasks.contains(task)){
            tasks.remove(task);
        }else {
            throw new IllegalArgumentException("Task not found!");
        }
    }

    public void exit() {
        // leave for iteration 2
    }

    public void markTaskAsComplete(Task task){
        if (tasks.contains(task)){
            task.status=true;
        }
    }

    public void processMenuChoice(int i){
        if(i<0 || i>5){
            throw new IllegalArgumentException("Invalid menu option!");
        }
    }
}