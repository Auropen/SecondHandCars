USE SecondhandCars
GO
CREATE VIEW getCarsInStock
AS SELECT * FROM CarStock
WHERE inStock = 1