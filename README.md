# COMP 3005 Assignment 3 Demo

## Overview

This Java application demonstrates basic CRUD (Create, Read, Update, Delete) operations using JDBC to interact with a PostgreSQL `students` table.

## Prerequisites

- IntelliJ IDEA Community Edition 2023 (or newer)
- PostgreSQL server
- PostgreSQL JDBC Driver (this should be in the project source already though)

## Setup Steps

1. **Create Database Table**
   - Execute the provided SQL script in your PostgreSQL database to create the `students` table:

`CREATE TABLE students (
    student_id SERIAL PRIMARY KEY,
    first_name TEXT NOT NULL,
    last_name TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    enrollment_date DATE
);`

2. **Insert Initial Data**
   - Use the given INSERT statement to add sample data to the table.
     
`INSERT INTO students (first_name, last_name, email, enrollment_date) VALUES
('John', 'Doe', 'john.doe@example.com', '2023-09-01'),
('Jane', 'Smith', 'jane.smith@example.com', '2023-09-01'),
('Jim', 'Beam', 'jim.beam@example.com', '2023-09-02');`

3. **Configure Database Connection**
   - Edit the Java file and set `URL`, `USER`, and `PASSWORD` values to match your PostgreSQL setup.
   - Alternatively, leave the Java file as is and create a PostgresSQL database with hostname `postgres`, username `postgres`, and password `1337`

4. **Compile the Java Program**

## Demo video: https://youtu.be/aMOlR544kPs
