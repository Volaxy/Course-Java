insert into companies (name, cnpj) values
	("Bradesco", 5498674589645),
    ("Vale", 74238443654546),
    ("Cielo", 9823425347535);
    
alter table companies modify cnpj varchar(25);

select * from companies;

desc companies;
desc mayors;
desc cities_companies;

insert into cities_companies (companie_id, citie_id, sede) values
	(1, 1, true),
    (1, 2, false),
    (2, 1, false),
    (2, 2, true);
    
select * from cities_companies;