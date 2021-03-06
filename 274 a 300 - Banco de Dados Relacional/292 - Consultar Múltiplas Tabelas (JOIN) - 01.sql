select * from states e, cities c where e.id = c.state_id;

select e.name as State, c.name City, region as Region from states e inner join cities c on e.id = c.state_id;