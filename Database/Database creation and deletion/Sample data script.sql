USE SecondhandCars
GO
INSERT INTO CarStock VALUES(1988,'Mercedes','250','TD','2,5T','Diesel',560,138000,159900,'St.car',null,'DP 12.087','08-09-2014',1)
INSERT INTO CarStock VALUES(1998,'Daihatsu','Terius',null,'1,3','Petrol',7,122000,139900,'St.car','4x4','HT 66.411','2015-04-06',1)
INSERT INTO CarStock VALUES(1994,'Ford','Mondeo','CLX','2','Petrol',225,83000,99900,'Sedan','Servo, c.lock, El-panes, CD, Alu mm','PE 32.600','2015-04-10',1)
INSERT INTO CarStock VALUES(1988,'VW','Passat','CL','1,8','Petrol',222,86000,94900,'St.car','16" alu, GT upholstery, Centralistic locked','GN 74.960','2014-08-04',1)
INSERT INTO CarStock VALUES(2005,'Smart','Fortwo','Passion','0,8','Diesel',89,65000,80000,'Cabriolet','Sound system, Alu trim, Leather seats','WQ 45333','2014-12-11',1)

INSERT INTO Customers
VALUES('Andreas','Andersen','29475911','','')
INSERT INTO Customers
VALUES('Bo','Børgesen','10928467','Benthoffsgade 17, 6300 Aabenraa','')
INSERT INTO Customers
VALUES('Casper','Carlsen','75982734','','ccarlsen@gmail.com')

INSERT INTO TireHotel
VALUES('10001101','Off-road tires',4,3)
INSERT INTO TireHotel
VALUES('00011001','Winter-tires',4,3)

INSERT INTO CarSale
VALUES(2,'2015-05-06',3,139900)
UPDATE CarStock
SET inStock = 0
WHERE carID = 2
INSERT INTO CarSale
VALUES(3,'2015-05-10',3,99900)
UPDATE CarStock
SET inStock = 0
WHERE carID = 3

INSERT INTO Repair
VALUES('Diesel','2015-04-18',7.5,'Broken Frontal Axel',1,27000)
INSERT INTO Repair
VALUES('Petrol','2015-05-02',4.5,'Cigarette tray broken',2,4000)
INSERT INTO Repair
VALUES('Diesel','2015-06-18',30,'Burned-out husk',1,118000)

INSERT INTO ChipTuning
VALUES('2015-05-22','Pedal to the metal',3,1,14000)
INSERT INTO ChipTuning
VALUES('2015-06-07','Slow ride',1,2,6550)

INSERT INTO TireVacation
VALUES(1,'2014-10-12','2015-02-23',3,3400)
INSERT INTO TireVacation
VALUES(2,'2013-03-08','2013-10-11',1,5500)