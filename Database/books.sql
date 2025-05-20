-- Insert Books
INSERT INTO book (title, isbn, publication_year, genre, pages, publisher_id) VALUES
  ('Carrie', '9780307743664', 1974, 'Horror', 199, 1),
  ('The Shining', '9780307743657', 1977, 'Horror', 447, 1),
  ('It', '9781501142970', 1986, 'Horror', 1138, 1),
  ('Misery', '9780450417399', 1987, 'Thriller', 320, 1),
  ('The Stand', '9780307743688', 1978, 'Post-apocalyptic', 1152, 1),
  ('Pet Sematary', '9781501156700', 1983, 'Horror', 416, 1),
  ('Cujo', '9780451161352', 1981, 'Horror', 319, 1),
  ('Salem''s Lot', '9780307743671', 1975, 'Horror', 439, 1),
  ('Doctor Sleep', '9781476727653', 2013, 'Horror', 531, 1),
  ('11/22/63', '9781451627299', 2011, 'Science Fiction', 849, 1);

-- Associate Books with Author
INSERT INTO book_author (book_id, author_id, role) VALUES
  (1, 1, 'Main Author'),
  (2, 1, 'Main Author'),
  (3, 1, 'Main Author'),
  (4, 1, 'Main Author'),
  (5, 1, 'Main Author'),
  (6, 1, 'Main Author'),
  (7, 1, 'Main Author'),
  (8, 1, 'Main Author'),
  (9, 1, 'Main Author'),
  (10, 1, 'Main Author');

