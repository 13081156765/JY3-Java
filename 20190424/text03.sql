	-- 1
	SELECT first_name,last_name,department_id,salary * 12 ANNUALSALARY
	FROM employees
	ORDER BY ANNUALSALARY DESC,first_name;
	-- 2
	SELECT first_name,last_name,salary
	FROM employees
	WHERE salary NOT BETWEEN 8000 AND 17000
	ORDER BY salary DESC;
	-- 3
	SELECT *
	FROM employees
	WHERE email LIKE "%e%"
	ORDER BY LENGTH(email) DESC,department_id;
	