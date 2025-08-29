package com.example.demo.form;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Author yuri9652, koyamizu
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
	private LocalDate deadLine;
	
	private Boolean isNew;
	
	public Boolean isValid() {
		//期限が今日より前ではない＝期限が今日以降
		return !deadLine.isBefore(LocalDate.now());
	}
}
