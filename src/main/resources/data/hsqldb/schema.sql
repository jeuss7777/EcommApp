DROP TABLE Vendor IF EXISTS;

CREATE TABLE Vendor(
	veVendorNumber BIGINT NOT NULL,
	veVendorName VARCHAR(60),
	veAddress VARCHAR(255),
	veCity VARCHAR(16),
	veState VARCHAR(2),
	veZipCode BIGINT(9),
	veTelephone VARCHAR(16),
	PRIMARY KEY (veVendorNumber)
);
