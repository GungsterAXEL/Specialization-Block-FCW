USE Друзья_человека;
DROP TABLE IF EXISTS Молодые_животные;
CREATE TABLE Молодые_животные AS
SELECT *,
    CONCAT(TIMESTAMPDIFF(YEAR, Дата_рождения, CURDATE()) - IF(EXTRACT(MONTH FROM Дата_рождения) > EXTRACT(MONTH FROM CURDATE()), 1, 0), ' лет ',
        IF(EXTRACT(MONTH FROM Дата_рождения) > EXTRACT(MONTH FROM CURDATE()), EXTRACT(MONTH FROM CURDATE()) + 12 - EXTRACT(MONTH FROM Дата_рождения), EXTRACT(MONTH FROM CURDATE()) - EXTRACT(MONTH FROM Дата_рождения)), ' месяцев') AS Возраст
FROM Животные
WHERE Дата_рождения <= DATE_SUB(CURDATE(), INTERVAL 1 YEAR)
    AND Дата_рождения > DATE_SUB(CURDATE(), INTERVAL 3 YEAR);