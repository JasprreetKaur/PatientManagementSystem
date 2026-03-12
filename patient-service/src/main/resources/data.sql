CREATE TABLE IF NOT EXISTS patient
(
    id
    UUID
    PRIMARY
    KEY,
    name
    VARCHAR
(
    255
) NOT NULL, email VARCHAR
(
    255
) UNIQUE NOT NULL, address VARCHAR
(
    255
) NOT NULL, date_of_birth DATE NOT NULL, registered_date DATE NOT NULL );
INSERT INTO patient (id, name, email, address, date_of_birth, registered_date)
VALUES ('b1a1c2d3-e001-4a2b-9a11-111111111111', 'John Doe', 'john.doe@example.com', '123 Main Street', '1987-10-17',
        '2022-01-01'),
       ('b1a1c2d3-e002-4a2b-9a11-222222222222', 'Jane Smith', 'jane.smith@example.com', '45 Oak Avenue', '1990-03-12',
        '2022-02-14'),
       ('b1a1c2d3-e003-4a2b-9a11-333333333333', 'Michael Brown', 'michael.brown@example.com', '78 Pine Road',
        '1985-07-09', '2022-03-01'),
       ('b1a1c2d3-e004-4a2b-9a11-444444444444', 'Emily Davis', 'emily.davis@example.com', '16 Maple Street',
        '1992-11-21', '2022-03-20'),
       ('b1a1c2d3-e005-4a2b-9a11-555555555555', 'David Wilson', 'david.wilson@example.com', '9 Cedar Lane',
        '1988-01-05', '2022-04-10'),
       ('b1a1c2d3-e006-4a2b-9a11-666666666666', 'Sarah Miller', 'sarah.miller@example.com', '55 Birch Boulevard',
        '1995-06-18', '2022-05-03'),
       ('b1a1c2d3-e007-4a2b-9a11-777777777777', 'Chris Anderson', 'chris.anderson@example.com', '102 Willow Way',
        '1983-09-14', '2022-05-28'),
       ('b1a1c2d3-e008-4a2b-9a11-888888888888', 'Olivia Thomas', 'olivia.thomas@example.com', '33 Cherry Street',
        '1998-04-30', '2022-06-15'),
       ('b1a1c2d3-e009-4a2b-9a11-999999999999', 'Daniel Taylor', 'daniel.taylor@example.com', '87 Elm Drive',
        '1986-12-02', '2022-07-01'),
       ('b1a1c2d3-e010-4a2b-9a11-aaaaaaaaaaaa', 'Sophia Moore', 'sophia.moore@example.com', '21 Aspen Court',
        '1993-08-25', '2022-07-22'),
       ('b1a1c2d3-e011-4a2b-9a11-bbbbbbbbbbbb', 'James Jackson', 'james.jackson@example.com', '64 Poplar Road',
        '1984-05-11', '2022-08-10'),
       ('b1a1c2d3-e012-4a2b-9a11-cccccccccccc', 'Isabella Martin', 'isabella.martin@example.com', '12 Walnut Street',
        '1996-02-17', '2022-08-30'),
       ('b1a1c2d3-e013-4a2b-9a11-dddddddddddd', 'Benjamin Lee', 'benjamin.lee@example.com', '49 Spruce Lane',
        '1989-10-08', '2022-09-12'),
       ('b1a1c2d3-e014-4a2b-9a11-eeeeeeeeeeee', 'Mia Harris', 'mia.harris@example.com', '77 Cypress Street',
        '1991-01-29', '2022-10-03'),
       ('b1a1c2d3-e015-4a2b-9a11-ffffffffffff', 'Lucas Clark', 'lucas.clark@example.com', '5 Redwood Avenue',
        '1994-07-19', '2022-10-25');