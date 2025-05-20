

SELECT b.book_id, b.title,a. last_name, a.first_name, b.publication_year, b.pages, p.name
	FROM book as b 
	INNER JOIN publisher as p ON b.publisher_id = p.publisher_id
	INNER JOIN book_author as ba ON b.book_id = ba.book_id 
	INNER JOIN author as a ON ba.author_id = a.author_id 
	where p.name LIKE 'Penguin%' and a.last_name = 'King' and b.pages > 600
	ORDER BY b.publication_year 
	LIMIT 2