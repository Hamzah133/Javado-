



public class Task {
    public String title;
    public String description;
    public Boolean status;


    public Task(String title, String description, Boolean status){
        this.title=title;
        this.description=description;
        this.status=status;
    }

    public String getTitle(){
        return this.title;
    }
    public String getDescription(){
        return this.description;
    }
    public Boolean isComplete(){
        return this.status;
    }
//    leave empty this is for iteration 3
}
