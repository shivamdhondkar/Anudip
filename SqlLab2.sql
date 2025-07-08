CREATE DATABASE StudentSystem;
USE StudentSystem;

CREATE TABLE Students (
    StudentID INT AUTO_INCREMENT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Age INT,
    Gender ENUM('Male', 'Female', 'Other'),
    Email VARCHAR(100)
);

INSERT INTO Students (FirstName, LastName, Age, Gender, Email) VALUES
('Aarav', 'Sharma', 20, 'Male', 'aarav.sharma@example.com'),
('Vivaan', 'Patel', 22, 'Male', 'vivaan.patel@example.com'),
('Anaya', 'Verma', 19, 'Female', 'anaya.verma@example.com'),
('Sunil', 'Rawat', 21, 'Female', 'diya.iyer@example.com'),
('Arjun', 'Reddy', 23, 'Male', 'arjun.reddy@example.com'),
('Jane', 'Smith', 20, 'Female', 'saanvi.kumar@example.com'),
('Kabir', 'Singh', 22, 'Male', 'kabir.singh@example.com'),
('Nisha', 'Mehta', 19, 'Female', 'nisha.mehta@example.com');

SELECT * FROM Students;

USE StudentSystem;

CREATE TABLE StudentPercentage (
    PercentageID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID INT,
    Percentage DECIMAL(5,2),
    Grade VARCHAR(2),
    Year INT,
    FOREIGN KEY (StudentID) REFERENCES Students(StudentID)
);

INSERT INTO StudentPercentage (StudentID, Percentage, Grade, Year)
VALUES
    (1, 85.50, 'A', 2023),
    (2, 92.75, 'A+', 2023),
    (3, 78.25, 'B+', 2023),
    (4, 88.00, 'A', 2023),
    (5, 95.50, 'A+', 2023),
    (6, 81.75, 'B+', 2023),
    (7, 76.00, 'B', 2023),
    (8, 89.25, 'A', 2023); 

SELECT * FROM StudentPercentage;

SET SQL_SAFE_UPDATES = 0;

UPDATE Students
SET Email = 'jane_Smith@example.com'
WHERE FirstName = 'Jane' AND LastName = 'Smith';

UPDATE Students
SET Email = 'sunilrawat@example.com'
WHERE FirstName = 'Sunil' AND LastName = 'Rawat';

DELETE FROM Students
WHERE LastName = 'Smith';

SELECT * FROM Students
WHERE FirstName LIKE 'J%';UPDATE Students SET Email = 'jane_Smith@example.com' WHERE FirstName = 'Jane' AND LastName = 'Smith'