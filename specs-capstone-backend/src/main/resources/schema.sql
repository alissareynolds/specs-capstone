drop table if exists animals;

CREATE TABLE animals (
            animal_id SERIAL PRIMARY KEY,
            name VARCHAR (64),
            gender VARCHAR (20) NOT NULL,
            breed VARCHAR (80) NOT NULL,
            birthdate VARCHAR (60) NOT NULL,
            thumbnail VARCHAR (200) NOT NULL,
            height VARCHAR (60),
            color VARCHAR (80),
            weight VARCHAR (60),
            info VARCHAR (50000) NOT NULL,
            species_name VARCHAR (60) NOT NULL
        );