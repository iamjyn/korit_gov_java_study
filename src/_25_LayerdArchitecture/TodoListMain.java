package _25_LayerdArchitecture;

import _25_LayerdArchitecture.repository.*;
import _25_LayerdArchitecture.service.*;
import _25_LayerdArchitecture.view.*;

import java.time.LocalDateTime;

public class TodoListMain {
    public static void main(String[] args) {
        UserList userList = new UserList();
        TodoList todoList = new TodoList();

        UserService userService = new UserService(userList);
        TodoService todoService = new TodoService(todoList);

        TodoListView todoListView = new TodoListView(userService, todoService);
        todoListView.homeView();

        System.out.println(LocalDateTime.now());
    }
}
