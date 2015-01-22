package jp.qilab.spring.domain;

import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;


@Entity
@Table(name = "clothes")
public class Clothes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	
	private Integer sexId;
	
	private Integer clothesColorId;
	
	private Integer price;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSexId() {
		return sexId;
	}

	public void setSexId(Integer sexId) {
		this.sexId = sexId;
	}

	public Integer getClothesColorId() {
		return clothesColorId;
	}

	public void setClothesColorId(Integer clothesColorId) {
		this.clothesColorId = clothesColorId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}
	
}
