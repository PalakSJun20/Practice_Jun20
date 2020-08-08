package comparable_comparator;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		return (int) (o1.getEmpSalary() - o2.getEmpSalary());
	}

}
