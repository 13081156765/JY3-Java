	-- 1
	SELECT first_name,last_name,salary
	FROM employees
	WHERE salary > 12000;
	-- 2
	SELECT first_name,last_name,department_id,salary * 12 "ANNUAL SALARY"
	FROM employees
	WHERE employee_id = 176;
	-- 3
	SELECT first_name,last_name,salary
	FROM employees
	WHERE salary NOT BETWEEN 5000 AND 12000;
	-- 4
	SELECT first_name,last_name,department_id
	FROM employees
	WHERE department_id = 20 OR department_id = 50;
	-- 5
	SELECT first_name,last_name,job_id
	FROM employees
	WHERE manager_id IS NULL;
	-- 6
	SELECT first_name,last_name,salary,commission_pct
	FROM employees
	WHERE commission_pct IS NOT NULL;
	-- 7
	SELECT first_name,last_name
	FROM employees
	WHERE first_name LIKE "__a%";
	-- 8
	SELECT first_name,last_name
	FROM employees
	WHERE first_name LIKE "%a%e%";
	-- 9
	SELECT first_name,last_name
	FROM employees
	WHERE first_name LIKE "%e";
	-- 10
	SELECT first_name,last_name,job_id
	FROM employees
	WHERE department_id BETWEEN 80 AND 100;
	-- 11
	SELECT first_name,last_name,job_id
	FROM employees
	WHERE manager_id = 100 OR manager_id = 101 OR manager_id = 110;