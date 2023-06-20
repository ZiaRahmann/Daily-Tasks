package Inheritance;

public class EmpManagement extends EmpDepartment {

	public static void main(String[] args) {
	

	Employee e1 = new Employee("Zia",1,"8341934186");
	
	EmpDepartment obj = new EmpDepartment("Software","CG",e1);
	
	obj.display();
	
}
}
