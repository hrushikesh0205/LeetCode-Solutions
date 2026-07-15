select emp.name,U.unique_id
from Employees AS emp
LEFT JOIN EmployeeUNI AS u
ON emp.id=U.id