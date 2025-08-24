package com.example.demo.entity;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Todo {

	private Integer todoId;
	private String todo;
	private String detail;
	private LocalDateTime deadLine;
	private State state;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
}
