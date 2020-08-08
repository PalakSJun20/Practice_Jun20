package comparable_comparator;

import java.util.Comparator;

public class EmpIdComparator implements Comparator<EmployeeDetails> {

	@Override
	public int compare(EmployeeDetails o1, EmployeeDetails o2) {
		if (o1.getEmpId() == o2.getEmpId()) 
			return 0;
		else if(o1.getEmpId() > o2.getEmpId())
			return 1;
		else
		return -1;
	}

}
