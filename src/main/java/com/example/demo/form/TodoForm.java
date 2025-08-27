package com.example.demo.form;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoForm {
	
	private Integer todoId;
	
	@NotBlank(message="入力してください")
	private String todo;
	
	@NotBlank(message="入力してください")
	private String detail;
	
	@NotNull(message="入力してください")
	private LocalDateTime deadLine;
	
	private Boolean isNew;
	
}
