	-- 1
	SELECT last_name,job_id,salary AS sal
	FROM employees;
	-- 2
	SELECT * FROM employees;
	-- 3
	SELECT employee_id,last_name,
				 salary * 12 "ANNUAL SALARY"
	FROM employees;
	-- 4
	DESC departments;
	-- 5
	SELECT DISTINCT job_id
	FROM employees;
	-- 6
	SELECT CONCAT(employee_id,',',first_name,',',last_name,',',email,',',phone_number,',',job_id,',',salary,',',IFNULL(commission_pct,0),',',IFNULL(manager_id,0),',',department_id,',',hiredate) AS OUT_PUT
	FROM employees;