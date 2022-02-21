CREATE TABLE ROBOTS (
    MODEL VARCHAR (255) ,
    SERIAL_NUMBER VARCHAR (255) NOT NULL,
    MANUFACTURED_DATE TIMESTAMP,
    CATEGORY VARCHAR (255)
);

CREATE TABLE survivor (
    NAME VARCHAR (255),
    AGE INTEGER,
	GENDER VARCHAR (255),
	ID VARCHAR (255) NOT NULL,
	LATITUDE DOUBLE,
	LONGITUDE DOUBLE,
    WATER BOOLEAN,
	FOOD BOOLEAN,
	MEDICATION BOOLEAN,
	AMMUNITION BOOLEAN,
	INFECTED_STATE BOOLEAN DEFAULT FALSE
);