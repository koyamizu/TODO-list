package com.example.demo.service.impl;

import java.util.List;

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
	public List<Todo> getAll(){
		return todoMapper.selectAll();
	}
	
	@Override
	public Todo get(Integer todoId) {
		Todo todo = todoMapper.selectTodo(todoId);
		return todo;
	}
	
	@Override
	public void update(Todo todo) {
		todoMapper.updateTodo(todo);
  }
	@Override
	//todoの新規作成
	public void insertTodo(Todo newTodo) {
		todoMapper.insertTodo(newTodo);
  }
	
	@Override
	//todoの削除
	public void deleteTodo(Integer todoId) {
		todoMapper.deleteTodo(todoId);
	}
}
