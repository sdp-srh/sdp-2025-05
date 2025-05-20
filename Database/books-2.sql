
  INSERT INTO book (title, isbn, publication_year, genre, pages, publisher_id)
VALUES 
('Harry Potter and the Philosopher\'s Stone', '9780747532699', 1997, 'Fantasy', 223, 1),
('Harry Potter and the Chamber of Secrets', '9780747538493', 1998, 'Fantasy', 251, 1),
('Harry Potter and the Prisoner of Azkaban', '9780747542155', 1999, 'Fantasy', 317, 1),
('Harry Potter and the Goblet of Fire', '9780747546245', 2000, 'Fantasy', 636, 1),
('Harry Potter and the Order of the Phoenix', '9780747551003', 2003, 'Fantasy', 766, 1),
('Harry Potter and the Half-Blood Prince', '9780747581086', 2005, 'Fantasy', 607, 1),
('Harry Potter and the Deathly Hallows', '9780747591054', 2007, 'Fantasy', 607, 1),
('The Tales of Beedle the Bard', '9780747599876', 2008, 'Fantasy', 109, 1),
('Fantastic Beasts and Where to Find Them', '9781408880715', 2001, 'Fantasy', 128, 1),
('Quidditch Through the Ages', '9781408883082', 2001, 'Fantasy', 56, 1);

-- Insert Book-Author Relationships
-- Assuming Rowling's author_id = 1 and books got book_id from 1 to 10:
INSERT INTO book_author (book_id, author_id, role)
VALUES 
(11, 2, 'Main Author'),
(12, 2, 'Main Author'),
(13, 2, 'Main Author'),
(14, 2, 'Main Author'),
(15, 2, 'Main Author'),
(16, 2, 'Main Author'),
(17, 2, 'Main Author'),
(18, 2, 'Main Author'),
(19, 2, 'Main Author'),
(20, 2, 'Main Author');
