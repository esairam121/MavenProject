package ltidemos;

public class Customer {
	
	private int custNo;
	private String custName;
	private double salary;
	
	
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int custNo, String custName, double salary) {
		super();
		this.custNo = custNo;
		this.custName = custName;
		this.salary = salary;
	}
	
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custName=" + custName + ", salary=" + salary + "]";
	}
	
	
}
