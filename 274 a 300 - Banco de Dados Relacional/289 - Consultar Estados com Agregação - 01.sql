select region as "Região", sum(population) as Total from states group by region order by Total desc; -- Agrup the sum for each region in the table

select sum(population) from states;

select avg(population) from states;