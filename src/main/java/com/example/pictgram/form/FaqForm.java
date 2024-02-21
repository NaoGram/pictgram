package com.example.pictgram.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class FaqForm {

	@NotEmpty(message = "タイトルを入力してください")
	@Size(max = 255, message = "タイトルは255文字以内で入力してください")
	private String title;

	@NotEmpty(message = "内容を入力してください")
	@Size(max = 1000, message = "内容は1000文字以内で入力してください")
	private String content;

	// コンストラクタ、getter、setterを追加する

	public FaqForm() {
	}

	public FaqForm(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;

	}
}