package _25_LayerdArchitecture.repository;

import _25_LayerdArchitecture.entity.Todo;

public class TodoList {
    private Todo[] todos;

    public TodoList() {
        this.todos = new Todo[0];
    }

//    public Todo[] getAllTodo() {
//        return todos;
//    }

    // todoId 생성
    public int generateTodoId() {
        return todos.length == 0 ? 1 : todos[todos.length - 1].getTodoId() + 1;
    }

    // todo 추가 메소드
    public void add(Todo todo) {
        Todo[] newTodoLists = new Todo[todos.length + 1];
        for (int i = 0; i < todos.length; i++) {
            newTodoLists[i] = todos[i];
        }
        newTodoLists[newTodoLists.length - 1] = todo;
        todos = newTodoLists;
    }

    // Todo의 새로운 배열을 위한 길이 확인
    public Todo[] findAllByUserId(int userId) {
        int foundTodoCount = 0;
        for (Todo todo : todos) {
            if (todo.getUser().getUserId() == userId) {
                foundTodoCount++;
            }
        }
        Todo[] foundTodos = new Todo[foundTodoCount];
        for (int i = 0, j = 0; i < todos.length; i++) {
            if (todos[i].getUser().getUserId() == userId) {
                foundTodos[j] = todos[i];
                j++;
            }
        }
        return foundTodos;
    }



}
