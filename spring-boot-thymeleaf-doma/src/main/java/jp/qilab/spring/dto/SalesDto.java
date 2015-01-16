package jp.qilab.spring.dto;

import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import jp.qilab.spring.domain.Sales;
import jp.qilab.spring.utils.TaxUtil;
import lombok.Data;

@Data
public class SalesDto {

	private Integer id;  // 売上ID
	
	private String customerName;  // 顧客名
	
	private String staffName;  // 弊社担当
	
	private Date saleDate;  // 売上日
	
	private Integer grossSale;  // 合計売上金額
	
	private Integer grossSaleWithTax;  // 合計売上金額（税込み）
	
	private List<PurchasedItemDto> purchasedItemDtoList;
	
	public SalesDto() {
		super();
	}
	
	public <T extends Sales> SalesDto(T sales) {
		BeanUtils.copyProperties(sales, this);
	}
	
	public void addGrossSale(Integer sales) {
		if (grossSale == null) {
			grossSale = 0;
		}
		this.grossSale += sales;
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public Date getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(Date saleDate) {
		this.saleDate = saleDate;
	}

	public Integer getGrossSaleWithTax() {
		if (grossSaleWithTax == null) {
			if (grossSale != null) {
				return TaxUtil.addTax(grossSale);
			}
		}
		return grossSaleWithTax;
	}

	public void setGrossSaleWithTax(Integer grossSaleWithTax) {
		this.grossSaleWithTax = grossSaleWithTax;
	}

	public List<PurchasedItemDto> getPurchasedItemDtoList() {
		return purchasedItemDtoList;
	}

	public void setPurchasedItemDtoList(List<PurchasedItemDto> purchasedItemDtoList) {
		this.purchasedItemDtoList = purchasedItemDtoList;
	}

	public Integer getGrossSale() {
		return grossSale;
	}

	public void setGrossSale(Integer grossSale) {
		this.grossSale = grossSale;
	}
}
