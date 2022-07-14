package encapsulation;

public class Employee {

	private int empid;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}
}

class company {

	public static void main(String[] args) {

		Employee e = new Employee();
		e.setEmpid(101);
		System.out.println(e.getEmpid());
	}

}
