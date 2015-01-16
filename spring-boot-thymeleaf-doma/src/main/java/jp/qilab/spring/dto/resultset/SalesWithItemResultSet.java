package jp.qilab.spring.dto.resultset;

import jp.qilab.spring.domain.Sales;

import org.seasar.doma.Entity;

@Entity
public class SalesWithItemResultSet extends Sales {

	private String itemName;
	
	private Integer price;
	
	private Integer quantity;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
}
