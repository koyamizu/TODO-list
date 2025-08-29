package com.example.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

//@Author koyamizu
@Data
public class Todo {

	private Integer todoId;
	private String title;
	private String detail;
	private LocalDate deadLine;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	
}
