package com.example.demo.helper;

import com.example.demo.entity.Todo;
import com.example.demo.form.TodoForm;

public class TodoConverter {
	public static Todo convertTodo(TodoForm todoForm) {
		Todo todo = new Todo();
		todo.setTodo(todoForm.getTodo());
		todo.setDetail(todoForm.getDetail());
		todo.setDeadLine(todoForm.getDeadLine());
		return todo;
	}
	public static TodoForm convertTodoForm(Todo todo) {
		TodoForm todoform = new TodoForm();
		todoform.setTodo(todo.getTodo());
		todoform.setDetail(todo.getDetail());
		todoform.setDeadLine(todo.getDeadLine());
		todoform.setIsNew(true);
		
		return todoform;
	}
	
}
