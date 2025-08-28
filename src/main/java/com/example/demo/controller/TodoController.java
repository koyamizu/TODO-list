package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Todo;
import com.example.demo.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
	private final TodoService service;
	
	//TODO一覧表示
	@GetMapping
	public String allTodo(Model model) {
		//List<Todo> todos = TodoMapper.selectAll();
		List<Todo> todos = service.getAll();
		model.addAttribute("todos", todos);
		return "list";
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
	public String delete(@PathVariable("todo_id") Integer todoId, RedirectAttributes attributes) {
		service.deleteTodo(todoId);
		attributes.addFlashAttribute("message", "Todoを削除しました。");
		return "redirect:/todos";
	}
}
