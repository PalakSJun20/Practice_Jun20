package comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		Employee e1 = new Employee(551, "Palak",90000);
		Employee e2 = new Employee(102, "Sunny",50000);
		Employee e3 = new Employee(858, "Vipul",30000);
		
		ArrayList<Employee> al = new ArrayList<>();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		
		Collections.sort(al);
		
		System.out.println("Sorting on the basis of Employee Id (Ascending Order)");
		//System.out.println("Sorting on the basis of Employee Id (Descending Order)");
		System.out.println("EmpId : EmpName : EmpSalary");
		for (Employee employee : al) {
			System.out.println(employee.empId + "   : " + employee.empName + "   : " +employee.salary);
		}
	}

}
