package Inheritance;

public class EmpDepartment extends Employee{

	public String deptName;
	public String deptId;
	public Employee employee;
	
	public EmpDepartment() {
		super();
	}

	public EmpDepartment(String deptName, String deptId,Employee employee) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
		this.employee= employee;
	}
	
	void display() {
		System.out.println(employee.empId+"  "+employee.empName+"  "+employee.empNumber+" "+cmpName);
		System.out.println(deptId +"  "+ deptName);
		
	}
	
	
}
