INSERT INTO student
(id, name, age, address)
VALUES
(1, '平野', 31, '横浜市'),
(2, '森', 33, 'つくば市'),
(3, '山田', 42, '川越市');



-- advanced level --
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('テスト太郎','テストタロウ','t.test@aaa.bbb','2010-01-01','東京',1);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('テスト次郎','テストジロウ','j.test@aaa.bbb','2010-03-01','大阪',1);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('佐藤剛','サトウゴウ','g.sato@aaa.bbb','2011-04-01','東京',2);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('田中聡','タナカサトシ','s.tanaka@aaa.bbb','2013-05-01','東京',2);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('山田五郎','ヤマダゴロウ','g.yamada@aaa.bbb','2012-11-01','大阪',2);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('平泉雄太','ヒライズミユウタ','y.hiraizumi@aaa.bbb','2014-02-01','東京',3);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('北島三郎','キタジマサブロウ','s.kitajima@aaa.bbb','2011-10-01','東京',3);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('伊藤四郎','イトウシロウ','s.itou@aaa.bbb','2010-08-01','大阪',3);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('内山雄二','ウチヤマユウジ','y.uchiyama@aaa.bbb','2010-08-01','東京',4);
INSERT INTO member(name, name_kana, mail_address, join_date, area, group_id) VALUES ('森太郎','モリタロウ','t.mori@aaa.bbb','2012-07-01','大阪',4);


INSERT INTO groups(name) VALUES ('山田グループ');
INSERT INTO groups(name) VALUES ('田中グループ');
INSERT INTO groups(name) VALUES ('佐藤グループ');
INSERT INTO groups(name) VALUES ('鈴木グループ');


INSERT INTO sales(customer_name,staff_name,sale_date) VALUES ('ラクス商事','山田太郎','2013-12-01');
INSERT INTO sales(customer_name,staff_name,sale_date) VALUES ('ラクス銀行','田中次郎','2014-01-13');
INSERT INTO sales(customer_name,staff_name,sale_date) VALUES ('A商事','佐藤一郎','2014-03-03');
INSERT INTO sales(customer_name,staff_name,sale_date) VALUES ('B銀行','佐藤一郎','2014-03-05');
INSERT INTO sales(customer_name,staff_name,sale_date) VALUES ('楽楽天','山田太郎','2014-04-05');


INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (1,10,1);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (2,10,1);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (3,10,1);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (1,11,2);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (2,11,2);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (3,11,2);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (1,12,3);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (2,12,3);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (3,12,3);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (1,13,4);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (2,13,4);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (3,13,4);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (1,14,5);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (2,14,5);
INSERT INTO sales_detail(item_id,quantity,sales_id) VALUES (3,14,5);


INSERT INTO item(name,price) VALUES ('ボールペン',120);
INSERT INTO item(name,price) VALUES ('ノート',140);
INSERT INTO item(name,price) VALUES ('消しゴム',150);


INSERT INTO hobby(name) VALUES ('野球');
INSERT INTO hobby(name) VALUES ('読書');
INSERT INTO hobby(name) VALUES ('サッカー');
INSERT INTO hobby(name) VALUES ('映画鑑賞');
INSERT INTO hobby(name) VALUES ('スノーボード');
INSERT INTO hobby(name) VALUES ('旅行');

