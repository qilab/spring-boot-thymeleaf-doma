SELECT
	m.name AS member_name,
	m.name_kana AS member_name_kana,
	m.mail_address,
	m.area,
	m.join_date,
	g.name AS group_name
FROM member AS m
LEFT OUTER JOIN groups AS g
ON m.group_id = g.id
WHERE
	/*%if @isNotEmpty(nameKana) */
		m.name_kana like /* @infix(nameKana) */'%カナ%' ESCAPE '$'
	/*%end*/
	/*%if groupId != null */
		AND g.id = /* groupId */0
	/*%end*/
ORDER BY m.id