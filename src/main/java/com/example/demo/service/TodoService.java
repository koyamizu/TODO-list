package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Todo;

public interface TodoService {
	List<Todo> getAll();//全件取得

  void insertTodo(Todo newTodo);//todoの新規作成

	void deleteTodo(Integer todoId); //todoの削除
}
