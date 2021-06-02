CREATE TABLE brand
(
    id   LONG AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    logo VARCHAR(250) NOT NULL
);

CREATE TABLE chat
(
    id            LONG AUTO_INCREMENT PRIMARY KEY,
    supportnameID LONG         NOT NULL,
    costumer      VARCHAR(250) NOT NULL,
    supportCaseID LONG         NOT NULL
);

CREATE TABLE product
(
    id            LONG AUTO_INCREMENT PRIMARY KEY,
    supportnameID LONG         NOT NULL,
    notification  VARCHAR(250) NOT NULL,
    name          VARCHAR(250) not null
);

CREATE TABLE supportcase
(
    id            LONG AUTO_INCREMENT PRIMARY KEY,
    supportNameID LONG         NOT NULL,
    name          VARCHAR(250) NOT NULL,
    description   VARCHAR(250) NOT NULL,
    chatID        VARCHAR(250) NOT NULL
);

CREATE TABLE user
(
    id       LONG AUTO_INCREMENT PRIMARY KEY,
    name     VARCHAR(250) NOT NULL,
    userType VARCHAR(250) NOT NULL

);