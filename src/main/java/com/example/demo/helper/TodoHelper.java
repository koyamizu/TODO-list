package com.example.demo.helper;

import com.example.demo.entity.Todo;
import com.example.demo.form.TodoForm;

//@Author yuri9652
public class TodoHelper {
	public static Todo convertTodo(TodoForm todoForm) {
		Todo todo = new Todo();
		todo.setTodoId(todoForm.getTodoId());
		todo.setTodo(todoForm.getTodo());
		todo.setDetail(todoForm.getDetail());
		todo.setDeadLine(todoForm.getDeadLine());
		return todo;
	}
	public static TodoForm convertTodoForm(Todo todo) {
		TodoForm todoform = new TodoForm();
		todoform.setTodoId(todo.getTodoId());
		todoform.setTodo(todo.getTodo());
		todoform.setDetail(todo.getDetail());
		todoform.setDeadLine(todo.getDeadLine());
		todoform.setIsNew(false);
		
		return todoform;
	}
	
}
