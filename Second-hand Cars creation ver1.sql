CREATE DATABASE SecondhandCars
GO
USE SecondhandCars
GO
CREATE TABLE CarStock (
	carID INTEGER NOT NULL IDENTITY PRIMARY KEY,
	year INTEGER NOT NULL,
	mark VARCHAR(50) NOT NULL,
	model VARCHAR(50) NOT NULL,
	version VARCHAR(50),
	volumeOfEngine VARCHAR(50) NOT NULL,
	fuelType VARCHAR(50) NOT NULL,
	odometer INTEGER NOT NULL,
	priceOfPurchase MONEY NOT NULL,
	sellingPrice MONEY NOT NULL,
	type VARCHAR(50) NOT NULL,
	description VARCHAR(500),
	licensePlate VARCHAR(50),
	dateOfPurchase DATE NOT NULL)
INSERT INTO CarStock VALUES(1988,'Mercedes','250','TD','2,5T','Diesel',560,138.000,159.900,'St.car',null,'DP 12.087','08-09-2014')
INSERT INTO CarStock VALUES(1998,'Daihatsu','Terius',null,'1,3','Petrol',7,122.000,139.900,'St.car','4x4','HT  66.411','2015-04-06')