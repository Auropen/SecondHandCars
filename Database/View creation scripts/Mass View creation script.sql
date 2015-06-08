USE SecondhandCars
GO
CREATE VIEW getAllCustomers
AS SELECT * FROM Customers
GO
CREATE VIEW getAllRepairs
AS SELECT * FROM Repair
GO
CREATE VIEW getAllTireSets
AS SELECT * FROM TireHotel
GO
CREATE VIEW getCarSales
AS SELECT * FROM CarSale
GO
CREATE VIEW getCarsInStock
AS SELECT * FROM CarStock
WHERE inStock = 1
GO
CREATE VIEW getChipTunings
AS SELECT * FROM ChipTuning
GO
CREATE VIEW getDieselRepairs
AS SELECT * FROM Repair
WHERE Type = 'Diesel'
GO
CREATE VIEW getPetrolRepairs
AS SELECT * FROM Repair
WHERE Type = 'Petrol'
GO
CREATE VIEW getSoldCars
AS SELECT * FROM CarStock
WHERE inStock = 0
GO
CREATE VIEW getTireServices
AS SELECT * FROM TireService
GO
CREATE VIEW getTireVacations
AS SELECT * FROM TireVacation