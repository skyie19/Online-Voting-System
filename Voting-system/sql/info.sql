CREATE DATABASE voting_system;

USE voting_system;

CREATE TABLE candidates (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    votes INT DEFAULT 0
);

-- Sample Data
INSERT INTO candidates (name, votes) VALUES ('Alice', 0), ('Bob', 0), ('Charlie', 0);
