SELECT
	sales.id,
	sales.customer_name,
	sales.staff_name,
	sales.sale_date,
	item.name AS item_name,
	item.price,
	sales_detail.quantity
FROM sales
LEFT OUTER JOIN sales_detail
	ON sales.id = sales_detail.sales_id
LEFT OUTER JOIN item
	ON item.id = sales_detail.item_id
WHERE 
	/*%if id != null */
		sales.id = /* id */1
	/*%end*/
ORDER BY sales.id
