-- Create a new schema
CREATE SCHEMA library_management;

-- Create Publisher table
CREATE TABLE library_management.publisher (
    publisher_id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    address TEXT,
    website VARCHAR(255)
);

-- Create Author table
CREATE TABLE library_management.author (
    author_id SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name VARCHAR(100) NOT NULL,
    birth_date DATE,
    nationality VARCHAR(100)
);

-- Create Book table
CREATE TABLE library_management.book (
    book_id SERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(20) UNIQUE,
    publication_year INT,
    genre VARCHAR(100),
    pages INT,
    publisher_id INT,
    CONSTRAINT fk_publisher
        FOREIGN KEY (publisher_id)
        REFERENCES library_management.publisher (publisher_id)
        ON DELETE SET NULL
);

-- Create BookAuthor relationship table (many-to-many)
CREATE TABLE library_management.book_author (
    book_id INT,
    author_id INT,
    role VARCHAR(100), -- e.g., 'Main Author', 'Co-Author'
    PRIMARY KEY (book_id, author_id),
    CONSTRAINT fk_book
        FOREIGN KEY (book_id)
        REFERENCES library_management.book (book_id)
        ON DELETE CASCADE,
    CONSTRAINT fk_author
        FOREIGN KEY (author_id)
        REFERENCES library_management.author (author_id)
        ON DELETE CASCADE
);
