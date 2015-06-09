USE SecondhandCars
GO
CREATE TABLE Customers(
	CustomerID INTEGER NOT NULL IDENTITY(1,1) PRIMARY KEY,
	FirstName VARCHAR(50) NOT NULL,
	LastName VARCHAR(50) NOT NULL,
	PhoneNumber VARCHAR(50) NOT NULL,
	Address VARCHAR(50) NOT NULL,
	Email VARCHAR(50) NOT NULL)

CREATE TABLE CarSale(
	CarSaleID INTEGER NOT NULL IDENTITY(1,1) PRIMARY KEY,
	CarID INTEGER NOT NULL FOREIGN KEY REFERENCES CarStock(CarID),
	SaleDate DATE NOT NULL,
	CustomerID INTEGER FOREIGN KEY REFERENCES Customers(CustomerID),
	Amount MONEY NOT NULL)
CREATE TABLE TireService(
	TireServiceID INTEGER NOT NULL IDENTITY(1,1) PRIMARY KEY,
	ServiceDate DATE NOT NULL,
	Description VARCHAR(500),
	Hours DECIMAL NOT NULL,
	CustomerID INTEGER FOREIGN KEY REFERENCES Customers(CustomerID),
	Amount MONEY NOT NULL)
CREATE TABLE ChipTuning(
	ChipTuningID INTEGER NOT NULL IDENTITY(1,1) PRIMARY KEY,
	TuningDate DATE NOT NULL,
	Description VARCHAR(500),
	Hours DECIMAL NOT NULL,
	CustomerID INTEGER FOREIGN KEY REFERENCES Customers(CustomerID),
	Amount MONEY NOT NULL)
CREATE TABLE TireHotel(
	TireSetID INTEGER NOT NULL IDENTITY(1,1) PRIMARY KEY,
	Location VARCHAR(50) NOT NULL,
	Description VARCHAR(500),
	NumberOfTires INTEGER NOT NULL)
CREATE TABLE TireVacation(
	TireVacationID INTEGER NOT NULL IDENTITY(1,1) PRIMARY KEY,
	TireSetID INTEGER NOT NULL FOREIGN KEY REFERENCES TireHotel(TireSetID),
	StartDate DATE NOT NULL,
	EndDate DATE NOT NULL,
	CustomerID INTEGER FOREIGN KEY REFERENCES Customers(CustomerID),
	Amount MONEY NOT NULL)
CREATE TABLE Repair(
	RepairID INTEGER NOT NULL IDENTITY(1,1) PRIMARY KEY,
	Type VARCHAR(50) NOT NULL,
	RepairDate DATE NOT NULL,
	Hours DECIMAL NOT NULL,
	Description VARCHAR(500),
	CustomerID INTEGER FOREIGN KEY REFERENCES Customers(CustomerID),
	Amount MONEY NOT NULL)