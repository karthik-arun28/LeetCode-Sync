# Write your MySQL query statement below
select MAX(salary) AS SecondHighestSalary from Employee e where e.salary<(select MAX(salary) from employee);
