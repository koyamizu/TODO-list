package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Todo;

import com.example.demo.repository.TodoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl {
	private final TodoMapper todoMapper;
	
	//todoの新規作成
	public void insertTodo(Todo newTodo) {
		todoMapper.insertTodo(newTodo);
    
	//todoの削除
	public void deleteTodo(Integer todoId) {
		todoMapper.deleteTodo(todoId);
    
	}
}
