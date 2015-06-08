USE SecondhandCars
GO
INSERT INTO Customers
VALUES('Andreas','Andersen','29475911',NULL,NULL)
INSERT INTO Customers
VALUES('Bo','Børgesen','10928467','Benthoffsgade 17, 6300 Aabenraa',NULL)
INSERT INTO Customers
VALUES('Casper','Carlsen','75982734',NULL,'ccarlsen@gmail.com')

INSERT INTO TireHotel
VALUES('10001101','Off-road tires',4)
INSERT INTO TireHotel
VALUES('00011001','Winter-tires',4)

INSERT INTO CarSale
VALUES(2,'2015-05-06',3,139900)
UPDATE CarStock
SET inStock = 0
WHERE carID = 2