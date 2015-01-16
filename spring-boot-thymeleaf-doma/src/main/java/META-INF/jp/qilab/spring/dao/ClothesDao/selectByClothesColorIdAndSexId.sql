SELECT
	clothes.name AS name,
	clothes.price AS price,
	sex.name AS sexName,
	clothes_color.name AS clothesColorName
FROM clothes
INNER JOIN sex ON sex.id = clothes.sex_id
INNER JOIN clothes_color ON clothes_color.id = clothes.clothes_color_id
WHERE 
/*%if clothesColorId != null */
	clothes_color.id = /* clothesColorId */0
/*%end*/
/*%if sexId != null */
	AND sex.id = /* sexId */0
/*%end*/
	