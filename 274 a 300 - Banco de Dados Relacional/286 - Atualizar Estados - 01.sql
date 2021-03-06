-- update states set name = "Maranhão"; -- In this case, this command update all data of the table

update states set name = "Maranhão" where acronym = "MA";

select * from states;

update states set name = "Paraná", population = 11.32 where acronym = "PR";

select sta.name, acronym, population from states sta where acronym = "PR";