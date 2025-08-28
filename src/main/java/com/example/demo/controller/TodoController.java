package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Todo;
import com.example.demo.form.TodoForm;
import com.example.demo.helper.TodoHelper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
	//TODO一覧表示
	@GetMapping
	public String allTodo() {

	}

	//TODO新規作成ページ表示
	@GetMapping("form")
	public String newTodo() {

	}

	//TODO編集ページ表示
	@GetMapping("edit/{todo_id}")
	public String editTodo(@PathVariable("todo_id") Integer todoId,Model model) {
		Todo todo = service.get(todoId); //serviceは小樋さん側で宣言しています。
		TodoForm todoForm = TodoHelper.convertTodoForm(todo);
		model.addAttribute("todoForm",todoForm);
		return "form";
	}

	//TODO新規作成処理
	@PostMapping("save")
	public String save() {

	}

	//TODO編集処理(TODO更新)
	@PostMapping("update")
	public String update(@Valid TodoForm todoForm,BindingResult bindingResult, RedirectAttributes attributes) {
		if(bindingResult.hasErrors()) {
			return "form";
		}
		Todo todo = TodoHelper.convertTodo(todoForm);
		service.update(todo);
		attributes.addFlashAttribute("message", "TODOを更新しました。");
		return "redirect:/todos";
	}

	//TODO削除処理
	@PostMapping("delete/{todo_id}")
	public String delete(@PathVariable("todo_id") Integer todoId) {

	}
}
