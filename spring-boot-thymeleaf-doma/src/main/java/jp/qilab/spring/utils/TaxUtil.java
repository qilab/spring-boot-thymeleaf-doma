package jp.qilab.spring.utils;

public class TaxUtil {

	public static final double TAX_RATE = 0.08;
	
	public static int addTax(int price) {
		return (int) (price * (1 + TAX_RATE));
	}
}
