package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class ClientComparator {

	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails();
		e1.setEmpId(6894);
		e1.setEmployeeName("Palak");
		e1.setEmpSalary(90000);
		
		EmployeeDetails e2 = new EmployeeDetails();
		e2.setEmpId(3698);
		e2.setEmployeeName("Kiran");
		e2.setEmpSalary(70000);
		
		EmployeeDetails e3 = new EmployeeDetails();
		e3.setEmpId(5685);
		e3.setEmployeeName("Karan");
		e3.setEmpSalary(100000);
		
		ArrayList<EmployeeDetails> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al, new EmpIdComparator());
		
		System.out.println("Sorting based on Employee Id (Ascending Order)");
		System.out.println("EmpId : EmpName : EmpSalary");
		for (EmployeeDetails employeeDetails : al) {
			System.out.println(employeeDetails.empId + "  : " + employeeDetails.employeeName + " 	: " + employeeDetails.empSalary);
		}
		
		Collections.sort(al, new EmpNameComparator());
		System.out.println("\nSorting based on Employee Name (Ascending Order)");
		System.out.println("EmpId : EmpName : EmpSalary");
		for (EmployeeDetails employeeDetails : al) {
			System.out.println(employeeDetails.empId + "  : " + employeeDetails.employeeName + " 	: " + employeeDetails.empSalary);
		}
		
		Collections.sort(al, new EmpSalaryComparator());
		System.out.println("\nSorting based on Employee Salary (Ascending Order)");
		System.out.println("EmpId : EmpName : EmpSalary");
		for (EmployeeDetails employeeDetails : al) {
			System.out.println(employeeDetails.empId + "  : " + employeeDetails.employeeName + " 	: " + employeeDetails.empSalary);
		}

	}

}
