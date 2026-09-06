# Write your MySQL query statement below
select e.name as Employee from Employee e inner join Employee ee on e.managerId = ee.id where e.salary > ee.salary;
