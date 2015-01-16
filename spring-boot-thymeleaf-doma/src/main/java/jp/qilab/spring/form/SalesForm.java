package jp.qilab.spring.form;

import lombok.Data;

@Data
public class SalesForm {

	private Integer salesDetailId;

	public Integer getSalesDetailId() {
		return salesDetailId;
	}

	public void setSalesDetailId(Integer salesDetailId) {
		this.salesDetailId = salesDetailId;
	}
	
}
