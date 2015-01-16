package jp.qilab.spring.form.elementary;

import javax.validation.constraints.NotNull;

public class Problem05Form {

	@NotNull(message="IDが未入力です。")
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
