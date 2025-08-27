package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Todo;
import com.example.demo.exception.IlligalActionException;
import com.example.demo.service.impl.TodoServiceImpl;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
	//TODO一覧表示
	@GetMapping
	public String allTodo(Model model) {
		try {
			//List<Todo> todos = TodoMapper.selectAll();
			List<Todo> todos = TodoServiceImpl.getAll();
			model.addAttribute("todos", todos);
		} catch (IlligalActionException e) {
			attributes.addFlashAttribute("error_message", e.getMessage());
		}
		return "list";
	}

	//TODO詳細ページ表示
	@GetMapping("{todo_id}")
	public String detailTodo(@PathVariable("todo_id") Integer todoId) {

	}

	//TODO新規作成ページ表示
	@GetMapping("form")
	public String newTodo() {

	}

	//TODO編集ページ表示
	@GetMapping("edit/{todo_id}")
	public String editTodo(@PathVariable("todo_id") Integer todoId) {

	}

	//TODO新規作成処理
	@PostMapping("save")
	public String save() {

	}

	//TODO編集処理(TODO更新)
	@PostMapping("update")
	public String update() {

	}

	//TODO削除処理
	@PostMapping("delete/{todo_id}")
	public String delete(@PathVariable("todo_id") Integer todoId) {

	}
}
