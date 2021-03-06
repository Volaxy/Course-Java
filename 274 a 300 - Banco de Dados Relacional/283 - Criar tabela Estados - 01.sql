-- Create the table state

use bancodedadosrelacional;

create table states (
	id int unsigned not null auto_increment,
    name varchar(45) not null,
    acronym varchar(2) not null,
    region enum("North", "Northeast", "Midwest", "Southeast", "South") not null,
    population decimal(5, 2) not null,
    primary key(id),
    unique key (name),
    unique key (acronym)
)