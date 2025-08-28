package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.repository.TodoMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl {
	private final TodoMapper todoMapper;
	
	//todoの削除
	public void deleteTodo(Integer todoId) {
		todoMapper.deleteTodo(todoId);
	}
}
