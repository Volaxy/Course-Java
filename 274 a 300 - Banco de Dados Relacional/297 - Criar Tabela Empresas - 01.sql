create table if not exists companies (
	id int unsigned not null auto_increment,
    name varchar(255) not null,
    cnpj int unsigned,
    primary key(id),
    unique key(cnpj)
);

-- Cities_Companies

create table if not exists cities_companies (
	companie_id int unsigned not null,
    citie_id int unsigned not null,
    sede boolean not null,
    primary key(companie_id, citie_id)
);