DROP TABLE IF EXISTS baseball_teams;

CREATE TABLE baseball_teams
(
id INT AUTO_INCREMENT,
name VARCHAR(255),
base VARCHAR(255),
start DATE,
history VARCHAR(255),
INDEX(id)
);

DROP TABLE IF EXISTS hotels;

CREATE TABLE hotels
(
id INT AUTO_INCREMENT,
name VARCHAR(255),
nearest_station VARCHAR(255),
price INT,
INDEX(id)
);

DROP TABLE IF EXISTS clothes_color;

CREATE TABLE clothes_color
(
id INT AUTO_INCREMENT,
name VARCHAR(255),
INDEX(id)
);

DROP TABLE IF EXISTS sex;

CREATE TABLE sex
(
id INT AUTO_INCREMENT,
name VARCHAR(255),
INDEX(id)
);

DROP TABLE IF EXISTS clothes;

CREATE TABLE clothes
(
id INT AUTO_INCREMENT,
name VARCHAR(255),
sex_id INT,
clothes_color_id INT,
price INT,
FOREIGN KEY (sex_id) REFERENCES sex(id),
FOREIGN KEY (clothes_color_id) REFERENCES clothes_color(id),
INDEX(id)
);

