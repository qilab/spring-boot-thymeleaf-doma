package jp.qilab.spring.dto;

import jp.qilab.spring.domain.Item;
import lombok.Data;

import org.springframework.beans.BeanUtils;

@Data
public class PurchasedItemDto {

	private String name;
	
	private Integer price;
	
	private Integer quantity;
	
	private Integer gross;
	
	public PurchasedItemDto() {
		super();
	}
	
	public PurchasedItemDto(Integer price, Integer quantity) {
		this.price = price;
		this.quantity = quantity;
		this.gross = price * quantity;
	}
	
	public <T extends Item> PurchasedItemDto(T item) {
		BeanUtils.copyProperties(item, this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
		if (quantity != null) {
			gross = price * quantity;
		}
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
		if (price != null) {
			gross = price * quantity;
		}
	}

	public Integer getGross() {
		if (gross == null) {
			if (price != null && quantity != null) {
				return price * quantity;
			}
		}
		return gross;
	}

//	public void setGross(Integer gross) {
//		this.gross = gross;
//	}
}
