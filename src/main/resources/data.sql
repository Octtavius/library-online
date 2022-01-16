insert into author
values
(nextval('book_id_seq'), 'Jerry', 'Merrit'),
(nextval('book_id_seq'), 'Robert', 'Dinsdale'),
(nextval('book_id_seq'), 'Blake', 'Crouch');

insert into book
values 
(
	nextval('book_id_seq'), 
	'The Toymakers',
	'It is 1917, and while war wages across Europe, in the heart of London, there is a place of hope and enchantment.\n The Emporium sells toys that capture the imagination of children and adults alike: patchwork dogs that seem alive, toy boxes that are bigger on the inside, soldiers that can fight battles of their own. Into this family business comes young Cathy Wray, running away from a shameful past. The Emporium takes her in, makes her one of its own.',
	1001,
	'FANTASY',
	to_date('1986-03-17', 'yyyy-mm-dd'),
	CURRENT_DATE,
	CURRENT_DATE
	),
	(
	nextval('book_id_seq'), 
	'A Gift of Time',
	'When Micajah Fenton discovers a crater in his front yard with a broken time glider in the bottom and a naked, virtual woman on his lawn, he delays his plans to kill himself. While helping repair the marooned time traveler’s glider, Cager realizes it can return him to his past to correct a mistake that had haunted him his entire life. As payment for his help, the virtual creature living in the circuitry of the marooned glider, sends Cager back in time as his ten-year-old self, knowing everything he’d known at eighty and gives him access to advanced equations of space and time',
	1000,
	'SCIFI',
	to_date('2014-12-09', 'yyyy-mm-dd'),
	CURRENT_DATE,
	CURRENT_DATE
	),
	(
	nextval('book_id_seq'), 
	'The Wayward Pines Trylogy',
	'Great science fiction book',
	1002,
	'SCIFI',
	to_date('2006-10-21', 'yyyy-mm-dd'),
	CURRENT_DATE,
	CURRENT_DATE
	);