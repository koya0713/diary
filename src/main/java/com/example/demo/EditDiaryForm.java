package com.example.demo;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EditDiaryForm {
	//編集する日記id
	@NotNull
	private int id;
	
	//編集投稿された日記本文
	@NotNull
	@Size(min=3, max=150)
	private String updateddiary;
}
