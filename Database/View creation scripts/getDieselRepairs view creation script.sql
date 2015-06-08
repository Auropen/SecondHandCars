USE SecondhandCars
GO
CREATE VIEW getDieselRepairs
AS SELECT * FROM Repair
WHERE Type = 'Diesel'