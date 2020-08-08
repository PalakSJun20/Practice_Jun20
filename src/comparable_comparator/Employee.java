package comparable_comparator;

public class Employee implements Comparable<Employee> {

	int empId;
	String empName;
	double salary;

	public Employee(int empId, String empName, double salary) {
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}

	// Sorting on EmployeeName
	/*@Override
	public int compareTo(Employee o) {
		return this.empName.compareTo(o.empName);
		
		 * if (this.empName.compareTo(o.empName) == 0) return 0; else if
		 * (this.empName.compareTo(o.empName) > 0) return 1; else return 0;
		 
	}*/

	// Sorting on Empid
	@Override
	public int compareTo(Employee o) {
		//return this.empId - o.empId;
		if (this.empId == o.empId)
			return 0;
		else if (this.empId > o.empId)
			return 1;
		else
			return -1;
	}
	
	//Sorting on Empid Descending Order 
/*	@Override
	public int compareTo(Employee o) {
		//return o.empId - this.empId;
		if (this.empId == o.empId)
			return 0;
		else if (this.empId < o.empId)
			return 1;
		else
			return -1;
	}
*/
}
