package com.example.demo.service;

import com.example.demo.entity.Todo;

public interface TodoService {
	void insertTodo(Todo newTodo);//todoの新規作成

public interface TodoService {
	void deleteTodo(Integer todoId); //todoの削除
}
