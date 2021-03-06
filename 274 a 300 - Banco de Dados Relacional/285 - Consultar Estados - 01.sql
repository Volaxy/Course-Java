select * from states;

select name, acronym from states;

select acronym, name from states;

select Acronym, name as "Name of state" from states;

select Acronym, name as "Name of state" from states where region = "South";

select Acronym, name as "Name of state" from states where region = "south";

select name, region from states where population > 10;

select name, region, population from states where population > 10 order by population;

select name, region, population from states where population > 10 order by population desc;

select name, region, population from states where population > 10 order by population asc;