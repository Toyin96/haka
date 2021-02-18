package todo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TodoListTest {

    Todo todo;
    TodoList todoList;

    @BeforeEach
    void setUp() {

        todo = new Todo("Eat breakfast");
        todoList = new TodoList("Kolade TodoList");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatTodoIsNotNullAfterCreation(){
        Todo todo = new Todo("Take my bath");
        assertNotNull(todo.getTodo());
    }

    @Test
    void checkIfToDoIsCheckedAfterCompletion(){
        assertFalse(todo.isChecked());
    }

    @Test
    void todo_canSetTodoValue(){
        todo.setTodo("Take a break");
        assertEquals("Take a break", todo.getTodo());
    }

    @Test
    void todo_isCheckedAfterCompletion(){
        todo.setChecked(true);
        assertTrue(todo.isChecked());
    }

    @Test
    void todo_canRenderProperly(){
        todo.setTodo("Eat lunch");
        System.out.println(todo.toString());
        assertEquals("Eat lunch    false", todo.toString());
    }

    @Test
    void todoList_canAddTodo(){
        addTodoToTodoList();

        assertEquals(6, todoList.getTodoListLength());
        System.out.println(todoList.printTodoList());
    }

    @Test
    void todoList_canCheckTodo(){
        addTodoToTodoList();
        int todoPosition = 2;
        boolean isSuccessful = todoList.checkTodo(todoPosition, true);
        assertTrue(isSuccessful);
        System.out.println(todoList.printTodoList());

    }

    private void addTodoToTodoList() {
        todoList.addTodo(todo);
        todoList.addTodo(new Todo("My name na Abdullahi"));
        todoList.addTodo(new Todo("I get one gal"));
        todoList.addTodo(new Todo("I wan run the bae"));
        todoList.addTodo(new Todo("I gats buy am flower"));
        todoList.addTodo(new Todo("I no say i go jonz las las"));
    }
}