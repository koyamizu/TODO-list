package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;
import com.example.demo.repository.TodoMapper;
import com.example.demo.service.TodoService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
	private final TodoMapper todoMapper;
	
	@Override
	public Todo get(Integer todoId) {
		Todo todo = todoMapper.selectTodo(todoId);
		return todo;
	}
	
	public void update(Todo todo) {
		todoMapper.updateTodo(todo);
	}
}
