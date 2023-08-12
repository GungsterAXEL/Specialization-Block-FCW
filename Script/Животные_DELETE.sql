/*
DELETE FROM верхняя_таблица
WHERE низкоуровневая_таблица_id = <id>;

или

DELETE low_level_table
FROM low_level_table
JOIN upper_level_table1 ON low_level_table.id = upper_level_table1.id
JOIN upper_level_table2 ON low_level_table.id = upper_level_table2.id
WHERE условие;
*/

USE Друзья_человека;
SET SQL_SAFE_UPDATES = 0;

DELETE FROM Вьючные_животные WHERE Вид='Верблюд';
DELETE FROM Животные WHERE Вид = 'Верблюд';
/*
DELETE Вьючные_животные, Животные
FROM Вьючные_животные
JOIN Животные ON Вьючные_животные.Вид = Животные.Вид
WHERE Животные.Вид = 'Верблюд';
*/
SET SQL_SAFE_UPDATES = 1;