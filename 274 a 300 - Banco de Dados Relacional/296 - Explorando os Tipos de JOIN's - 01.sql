select * from mayors;

select * from cities;

select * from cities inner join mayors on cities.id = mayors.city_id;

select * from cities left join mayors on cities.id = mayors.city_id;

select * from cities right join mayors on cities.id = mayors.city_id;

-- select * from cities full join mayors on cities.id = mayors.city_id;

select * from cities left join mayors on cities.id = mayors.city_id
union
select * from cities right join mayors on cities.id = mayors.city_id;