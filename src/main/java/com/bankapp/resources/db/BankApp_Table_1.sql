DROP DATABASE IF EXISTS BankApp;

CREATE DATABASE BankApp;

USE BankApp;

CREATE TABLE Customer(
Name VARCHAR(40) NOT NULL, 
Address VARCHAR(60), 
Email VARCHAR(40) NOT NULL,
PIN INT(4) NOT NULL
);

INSERT INTO Customer VALUES (
"Bianca Del Rio","22 Deer Rd, Sidcup, London, SW1 2EH.","shadypalmtrees@bianca.com",1234
);

SELECT * FROM customer;

INSERT INTO Customer VALUES (
"John Murphy","Sea View, Monkstown, Dublin.", "seapoint@test.com",1335
);

INSERT INTO Customer VALUES (
"Fred Flintstone","123 Yabba Dabba Way, Bedrock, Ballybrack.", "dino123@pebbles.com",7993
);

INSERT INTO Customer VALUES (
"Aisling Test","West Pier, Dun Laoghaire, Dublin.", "setaisling@test.com",2121
);

INSERT INTO Customer VALUES (
"Shay Mangoton","Mangoville Mews, Howth, Dublin.", "shaynerd@mango.com",1909
);