package jp.qilab.spring.dto;

import org.seasar.doma.Entity;

@Entity
public class ClothesDto {

	private String name;
	
	private Integer price;
	
	private String sexName;
	
	private String clothesColorName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexName() {
		return sexName;
	}

	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	public String getClothesColorName() {
		return clothesColorName;
	}

	public void setClothesColorName(String clothesColorName) {
		this.clothesColorName = clothesColorName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
