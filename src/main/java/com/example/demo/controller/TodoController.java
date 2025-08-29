package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Todo;
import com.example.demo.form.TodoForm;
import com.example.demo.helper.TodoHelper;
import com.example.demo.service.TodoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
	private final TodoService service;

	/* @Author coffee-kunren
	 * TODO一覧表示
	 */
	@GetMapping
	public String allTodo(Model model) {
		List<Todo> todos = service.getAll();
		model.addAttribute("todos", todos);
		return "list";
	}

	/* @Author koyamizu
	 * TODO詳細
	 */
	@GetMapping("{todo_id}")
	public String showDetail(@PathVariable("todo_id") Integer todoId, Model model) {

		Todo todo = service.get(todoId);
		model.addAttribute("todo", todo);

		return "detail";
	}

	/* @Author coffee-kunren
	 * TODO新規作成ページ表示
	 */
	@GetMapping("form")
	public String newTodo(Model model) {
		TodoForm todoForm = new TodoForm();
		todoForm.setIsNew(true);
		model.addAttribute("todoForm", todoForm);
		return "form";
	}

	/* @Author yuri9652
	 * TODO編集ページ表示
	 */
	@GetMapping("edit/{todo_id}")
	public String editTodo(@PathVariable("todo_id") Integer todoId, Model model) {
		Todo todo = service.get(todoId); //serviceはcoffee-kunrenさん側で宣言しています。
		TodoForm todoForm = TodoHelper.convertTodoForm(todo);
		model.addAttribute("todoForm", todoForm);
		return "form";
	}

	/* @Author coffee-kunren, koyamizu
	 * TODO新規作成処理
	 */
	@PostMapping("save")
	public String save(@Validated TodoForm todoForm, BindingResult bindingResult, RedirectAttributes redirectAttributes,
			Model model) {
		if (bindingResult.hasErrors()) {
			todoForm.setIsNew(true);
			return "form";//入力エラーなら処理せず返す
		}
		if (!todoForm.isValid()) {
			todoForm.setIsNew(true);
			model.addAttribute("error_message", "今日以降の日付を選択してください");
			return "form";
		}
		Todo newTodo = TodoHelper.convertTodo(todoForm);
		service.insertTodo(newTodo);
		redirectAttributes.addFlashAttribute("message", "TODOを追加しました。");
		return "redirect:/todos";
	}

	/* @Author yuri9652, koyamizu（例外処理）
	 * TODO編集処理(TODO更新)
	 */
	@PostMapping("update")
	public String update(@Validated TodoForm todoForm, BindingResult bindingResult
			, RedirectAttributes attributes,Model model) {
		if (bindingResult.hasErrors()) {
			return "form";
		}
		if (!todoForm.isValid()) {
			model.addAttribute("error_message", "今日以降の日付を選択してください");
			return "form";
		}
		Todo todo = TodoHelper.convertTodo(todoForm);
		service.update(todo);
		attributes.addFlashAttribute("message", "TODOを更新しました。");
		return "redirect:/todos";
	}

	/* @Author coffee-kunren
	 * TODO削除処理
	 */
	@PostMapping("delete/{todo_id}")
	public String delete(@PathVariable("todo_id") Integer todoId, RedirectAttributes attributes) {
		service.deleteTodo(todoId);
		attributes.addFlashAttribute("message", "TODOを削除しました。");
		return "redirect:/todos";
	}
}
