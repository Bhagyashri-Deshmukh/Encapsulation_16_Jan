package encapsulation;

public class Employee {

	private int empNumber;
	private String empName;
	
	// this fiels is read only
	private String password;
	
	public int getEmpNumber() {
		return empNumber;
	}
	public void setEmpNumber(int empNumber) {
		this.empNumber = empNumber;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	// this fiels is read only
	public String getPassword() {
		return "password@123";
	}
	
}
