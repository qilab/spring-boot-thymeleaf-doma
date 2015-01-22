-- elementary level --
INSERT INTO student
(id, name, age, address)
VALUES
(1, '平野', 31, '横浜市'),
(2, '森', 33, 'つくば市'),
(3, '山田', 42, '川越市');


-- intermediate level --
INSERT INTO baseball_teams
(id, name, base, start, history)
VALUES
(1, '読売ジャイアンツ', '東京ドーム（東京都文京区）', '1934-12-26', '大日本東京野球倶楽部（1934年）\n↓\n東京巨人軍（1935年～1946年）\n↓\n読売ジャイアンツ（1947年～）'),
(2, '阪神タイガース', '阪神甲子園球場（兵庫県西宮市）', '1935-12-10', '大阪タイガーズ（1935年～1940年）\n↓\n阪神軍（1940年～1944年）\n↓\n大阪タイガース（1946年～1960年）\n↓\n阪神タイガース（1961年～）'),
(3, '中日ドラゴンズ', 'ナゴヤドーム（愛知県名古屋市東区）', '1936-01-15' , '名古屋軍（1936年～1943年）\n↓\n産業軍（1944年）\n↓\n中部日本（1946年）\n↓\n中部日本ドラゴンズ（1947年）\n↓\n中日ドラゴンズ（1948年～1950年）\n↓\n名古屋ドラゴンズ（1951年～1953年）\n↓\n中日ドラゴンズ（1954年～）'),
(4, '横浜DeNAベイスターズ', '横浜スタジアム（神奈川県横浜市中区）', '1953-12-16', '大洋松竹ロビンス（1953年）\n↓\n洋松ロビンス（1954年）\n↓\n大洋ホエールズ（1955年～1977年）\n↓\n横浜大洋ホエールズ（1978年～1992年）\n↓\n横浜ベイスターズ（1993年～2011年）\n↓\n横浜DeNAベイスターズ（2012年）'),
(5, '広島東洋カープ', 'MAZDA Zoom-Zoom スタジアム広島（広島市民球場）（広島県広島市南区）', '1950-01-15', '広島カープ（1950年～1967年）\n↓\n広島東洋カープ（1968年～）'),
(6, '東京ヤクルトスワローズ', '明治神宮野球場（東京都新宿区）', '1950-01-12', '国鉄スワローズ（1950年～1965年）\n↓\nサンケイスワローズ（1965年）\n↓\nサンケイアトムズ（1966年～1968年）\n↓\nアトムズ（1969年）\n↓\nヤクルトアトムズ（1970年～1973年）\n↓\nヤクルトスワローズ（1974年～2005年）\n↓\n東京ヤクルトスワローズ（2006年）')
;

INSERT INTO hotels
(id, name, nearest_station, price)
VALUES
(1, '横浜ベイホテル東急', '桜木町駅', 10000),
(2, '渋谷エクセルホテル東急', '渋谷駅', 10000),
(3, 'ホテルローズガーデン新宿', '桜木町駅', 5000),
(4, 'International Hotel', '新宿駅', 20000);

INSERT INTO sex
(id, name)
VALUES
(1, '男'),
(2, '女');

INSERT INTO clothes_color
(id, name)
VALUES
(1, '赤'),
(2, '青'),
(3, '黄'),
(4, '白');

INSERT INTO clothes
(id, name, sex_id, clothes_color_id, price)
VALUES
(1, 'Tシャツ(mens, red)', 1, 1, 1000),
(2, 'Tシャツ(mens, blue)', 1, 2, 1100),
(3, 'Tシャツ(mens, yellow)', 1, 3, 1200),
(4, 'Tシャツ(mens, white)', 1, 4, 1300),
(5, 'Tシャツ(ladies, red)', 2, 1, 1400),
(6, 'Tシャツ(ladies, blue)', 2, 2, 1500),
(7, 'Tシャツ(ladies, yellow)', 2, 3, 1600),
(8, 'Tシャツ(ladies, white)', 2, 4, 1700),
(9, 'Tシャツ2(mens, red)', 1, 1, 1800);


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

