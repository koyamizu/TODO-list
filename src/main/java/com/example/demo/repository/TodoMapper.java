package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Todo;

@Mapper
public interface TodoMapper{
	List<Todo> selectAll(); //全件取得
	Todo selectTodo(Integer todoId); //一件のtodoの取得
	void updateTodo(Integer todoId,Todo updatedTodo); //todoの編集
	void insertTodo(Todo newTodo); //todoの新規作成 
	void deleteTodo(Todo targetTodo); //todoの削除
}
