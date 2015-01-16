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

