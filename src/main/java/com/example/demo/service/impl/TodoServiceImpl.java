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
	
	/* @Author coffee-kunren
	 * 全件取得
	 */
	@Override
	public List<Todo> getAll(){
		return todoMapper.selectAll();
	}
	
	/* @Author yuri9652
	 * 一件取得
	 */
	@Override
	public Todo get(Integer todoId) {
		Todo todo = todoMapper.selectTodo(todoId);
		return todo;
	}
	
	/* @Author yuri9652, koyamizu
	 * TODO更新
	 */
	@Override
	public void update(Todo todo){
		todoMapper.updateTodo(todo);
    }
	
	/* @Author coffee-kunren
	 * TODO挿入
	 */
	@Override
	//todoの新規作成
	public void insertTodo(Todo newTodo) {
		todoMapper.insertTodo(newTodo);
    }
	
	/* @Author coffee-kunren
	 * TODO削除
	 */
	@Override
	//todoの削除
	public void deleteTodo(Integer todoId) {
		todoMapper.deleteTodo(todoId);
	}
}
