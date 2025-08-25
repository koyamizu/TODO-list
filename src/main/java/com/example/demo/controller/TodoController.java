package com.example.demo.controller;

import java.awt.print.Book;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor//finalが付けられたフィールドのみを引数とするコンストラクタを自動的に生成する
@RequestMapping("/todos")
public class TodoController {
	@GetMapping(params="state=NOT_DONE")
	public String showPage() {
		
	}
	
	@GetMapping(params="state=DONE")
	
	
	@GetMapping("expired")
	
	
	@GetMapping("{todo_id}")
	public String deleteOrder(@PathVariable("todo_id") Integer todoId, RedirectAttributes attributes) {
		
	}
	
	@GetMapping("form")
	
	
	@GetMapping("edit/{todo_id}")
	
	
	@PostMapping("")
	
}
