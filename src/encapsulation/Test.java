package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setRollNumber(100);
		student.setName("Radhika");
		student.setAddress("Pune");
		
		System.out.println("Student information is : \n");
		System.out.println("Student roll is : "+student.getRollNumber());
		System.out.println("Student Name is : "+student.getName());
		System.out.println("Student address is : "+student.getAddress());
		
		System.out.println("==========================================================");
		
		Employee emp = new Employee();
		emp.setEmpNumber(101);
		emp.setEmpName("Abc");
		
		System.out.println("Employee information is : \n");
		System.out.println("Employye Number is : "+emp.getEmpNumber());
		System.out.println("Employee name is : "+emp.getEmpName());
		System.out.println("Employee pssword is : "+emp.getPassword());
	}

}
