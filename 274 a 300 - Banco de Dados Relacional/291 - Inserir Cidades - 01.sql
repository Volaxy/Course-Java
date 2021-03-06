insert into cities (name, state_id, area) values
	("Campinas", 26, 795);
    
select * from states;

insert into cities (name, state_id, area) values
	("Niterói", 20, 133.9);
    
insert into cities (name, area, state_id) values
	("Caruaru", 920.6, (select id from states where acronym = "PE"));
    
select * from cities;