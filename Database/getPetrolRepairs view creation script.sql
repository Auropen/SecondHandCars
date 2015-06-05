USE SecondhandCars
GO
CREATE VIEW getPetrolRepairs
AS SELECT * FROM Repair
WHERE Type = 'Petrol'