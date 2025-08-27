package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
	//TODO一覧表示
	@GetMapping()
	public String allTodo() {

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
