/*
				_________________
			|---|Друзья человека|---|
			|	‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾	|
	___________________		__________________
	|Домашние животные|		|Вьючные животные|
	‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾		‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾
	|	________				  ________   |
	|---|Собаки|				  |Лошади|---|
	|	‾‾‾‾‾‾‾‾				  ‾‾‾‾‾‾‾‾	 |
	|	_______					__________	 |
	|---|Кошки|					|Верблюды|---|
	|	‾‾‾‾‾‾‾					‾‾‾‾‾‾‾‾‾‾	 |
	|	________					______	 |
	|---|Хомяки|					|Ослы|---|
		‾‾‾‾‾‾‾‾					‾‾‾‾‾‾
*/



CREATE DATABASE Друзья_человека;
USE Друзья_человека;



# Родительский класс.
CREATE TABLE Животные (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);



## Второй уровень.
CREATE TABLE Домашние_животные (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Вьючные_животные (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);



### Третий уровень.
## Домашние животные.
CREATE TABLE Собаки (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Кошки (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Хомяки (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);



## Вьючные животные.
CREATE TABLE Лошади (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Верблюды (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE Ослы (
  id INT NOT NULL AUTO_INCREMENT,
  имя VARCHAR(50) NOT NULL,
  команды TEXT DEFAULT NULL,
  дата_рождения DATE DEFAULT NULL,
  вид VARCHAR(50) DEFAULT NULL,
  PRIMARY KEY (id)
);



#### Добавление данных в таблицы.
## Домашние животные.
INSERT INTO Собаки (имя, команды, дата_рождения, вид)
VALUES ('Джош', 'Сидеть, Лежать, Голос', '2023-06-25', 'Собака'),
	   ('Черри', 'Боевой пёс', '2001-01-01', 'Собака'),
       ('Малыш', 'Цирковые трюки', '2013-05-17', 'Собака');

INSERT INTO Кошки (имя, команды, дата_рождения, вид)
VALUES ('Персик', 'Широкую на широкую', '2003-03-12', 'Кошка'),
	   ('Рыжий', 'Бросай курить', '2013-01-07', 'Кошка'),
       ('Зорька', 'Брысь', '2001-08-20', 'Кошка');
       
INSERT INTO Хомяки (имя, дата_рождения, вид)
VALUES ('Чума', '2021-06-17', 'Хомяк'),
	   ('Мауи', '2011-11-05', 'Хомяк'),
       ('Цветочек', '2018-05-23', 'Хомяк');

## Вьючные животные.
INSERT INTO Лошади (имя, команды, дата_рождения, вид)
VALUES ('Зорро', 'Шагай, Трот, Галоп, Вертикаль, Поворот, Стоять', '2004-09-11', 'Лошадь'),
	   ('Амур', 'Цирковой конь', '2020-12-31', 'Лошадь'),
       ('Бриз', 'Оп-оп-оп', '2007-07-07', 'Лошадь');

INSERT INTO Верблюды (имя, команды, дата_рождения, вид)
VALUES ('Марго', 'Идти, Пастись', '2013-02-27', 'Верблюд'),
	   ('Амир', 'Идти на зов, Нести грузы', '2013-06-13', 'Верблюд'),
       ('Сахар', 'Пастись', '2021-10-20', 'Верблюд');

INSERT INTO Ослы (имя, команды, дата_рождения, вид)
VALUES ('Иван', 'Вперёд, Назад, Голос', '2023-08-06', 'Осёл'),
	   ('Мурзик', 'Стой', '2023-03-12', 'Осёл'),
       ('Булыжник', 'Исследование завершено', '2021-02-12', 'Осёл');