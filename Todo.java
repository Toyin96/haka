package todo;

public class Todo {
    private String todo;
    boolean isChecked;

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
    }

    public Todo(String todo) {
        this.todo = todo;
    }

    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    private String isDone(){
        if(isChecked)
            return "Done";
        else
            return "Yet to do";
    }

    @Override
    public String toString() {
        return String.format("%s%10s%10s",getTodo(),"", isDone());
    }
}