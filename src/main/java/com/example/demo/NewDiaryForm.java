package com.example.demo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class NewDiaryForm {
	//新規投稿された日記本文
	@NotNull
	@Size(min=3, max=150)
	private String newdiary;
}
