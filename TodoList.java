package todo;


import java.util.ArrayList;

public class TodoList {
    private ArrayList<Todo> todos;
    private String appName;



    public TodoList(String appName) {
        this.appName = appName;
        todos = new ArrayList<>();
    }

    public void addTodo(Todo newTodo) {
        Todo todo = findTodo(newTodo.getTodo());
          if(todo == null){
              todos.add(newTodo);
          }
    }

    private Todo findTodo(String todoValue) {
        for (int count = 0; count < todos.size(); count++) {
            if (todos.get(count).getTodo() == todoValue) {
                return todos.get(count);
            }
        }
        return null;
    }

    public int getTodoListLength() {
        return todos.size();
    }

    public String printTodoList(){
        StringBuilder todoList = new StringBuilder();
        int count = 1;
        for(Todo todo : todos){
            todoList.append(count++).append(".  ").append(todo.toString()).append("\n");
        }
        return todoList.toString();
    }

    public boolean checkTodo(int todoPosition, boolean checked) {
        for(int count = 0; count < todos.size(); count++){
            if(count == todoPosition){
                todos.get(count).setChecked(checked);
                return true;
            }
        }
        return false;
    }
}
