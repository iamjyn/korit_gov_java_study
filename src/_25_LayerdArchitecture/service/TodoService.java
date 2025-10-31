package _25_LayerdArchitecture.service;

import _25_LayerdArchitecture.dto.TodoRegisterReqDto;
import _25_LayerdArchitecture.entity.Todo;
import _25_LayerdArchitecture.entity.User;
import _25_LayerdArchitecture.repository.TodoList;
import _25_LayerdArchitecture.view.TodoListView;

public class TodoService {
    private TodoList todoList;
    private User user;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    // Todo 등록
    public void register(TodoRegisterReqDto todoRegisterReqDto) {
        // 1. entitiy 생성
        Todo todo = todoRegisterReqDto.toEntity();
        // 2. todoId 생성
        todo.setTodoId(todoList.generateTodoId());
        // 3. todoList에 추가
        todoList.add(todo);
    }

    // Todo 전체 출력
    public void printAllTodoByList(User user) {
        Todo[] foundTodos = todoList.findAllByUserId(user.getUserId());
        for (Todo todo : foundTodos) {
            System.out.println(todo);
        }
    }
}
