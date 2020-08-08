package comparable_comparator;

import java.util.Comparator;

public class EmpNameComparator implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		if (o1.getEmployeeName().compareTo(o2.getEmployeeName()) == 0) 
			return 0;
		else if (o1.getEmployeeName().compareTo(o2.getEmployeeName()) > 0)
			return 1;
		else 
			return -1;
	}

}
