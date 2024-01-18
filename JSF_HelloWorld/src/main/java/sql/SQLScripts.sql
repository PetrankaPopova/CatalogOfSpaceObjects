CREATE TABLE Galaxies (
    galaxy_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    type ENUM('elliptical', 'lenticular', 'spiral', 'irregular') NOT NULL,
    age DOUBLE NOT NULL,
    age_unit CHAR(1) CHECK(age_unit IN ('B', 'M'))

);

CREATE TABLE Stars (
    star_id INT PRIMARY KEY AUTO_INCREMENT,
    galaxy_id INT,
    name VARCHAR(255),
    class CHAR(1) CHECK(class IN ('O', 'B', 'A', 'F', 'G', 'K', 'M')),
    mass DOUBLE ,
    size DOUBLE ,
    temperature INT ,
    luminosity DOUBLE,
    FOREIGN KEY (galaxy_id) REFERENCES Galaxies(galaxy_id)
);

CREATE TABLE Planets (
    planet_id INT PRIMARY KEY AUTO_INCREMENT,
    galaxy_id INT,
    name VARCHAR(255),
    type VARCHAR(255) CHECK(type IN (
        'terrestrial', 'giant planet', 'ice giant', 'mesoplanet', 'mini-neptune',
        'planetary', 'super-earth', 'super-jupiter', 'sub-earth'
    )) ,
    habitable BOOLEAN ,
    FOREIGN KEY (galaxy_id) REFERENCES Galaxies(galaxy_id)
);

CREATE TABLE Moons (
    moon_id INT PRIMARY KEY AUTO_INCREMENT,
    planet_id INT,
    name VARCHAR(255) NOT NULL,
    FOREIGN KEY (planet_id) REFERENCES Planets(planet_id)
);