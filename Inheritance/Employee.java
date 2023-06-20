package Inheritance;

public class Employee {

	public String empName;
	public int empId;
	public String empNumber;
	static String cmpName="Capgemini";
	public Employee() {
		super();
	}

	public Employee(String empName, int empId, String empNumber) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empNumber = empNumber;
	}
	
	void view() {
		System.out.println(empId+"  "+empName+"  "+empNumber+" "+cmpName);
	}
	
	
	
}
