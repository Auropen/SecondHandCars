USE SecondhandCars

GO
CREATE VIEW getSoldCars
AS SELECT * FROM CarStock
WHERE inStock = 0