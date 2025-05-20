

SELECT b.book_id, b.title, b.publication_year, a.author_id, a.last_name, a.first_name
	FROM book as b
	INNER JOIN book_author as ba on b.book_id = ba.book_id
	INNER JOIN author as a on ba.author_id = a.author_id
	ORDER BY publication_year