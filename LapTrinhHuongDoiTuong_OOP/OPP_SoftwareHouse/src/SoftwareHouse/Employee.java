package SoftwareHouse;

public class Employee {
	private String name;
	private int monthsalary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMonthSalary(int sal){
		this.monthsalary = sal;
	}
	public int getMonthSalary(){
		return this.monthsalary;
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	//Khởi tạo đối tượng Employee
	public Employee(String name, int monthsal){
		this.name = name;
		this.setMonthSalary(monthsal);
	}
	
	public void display(){
		System.out.println("Employee name is: " + name);
		System.out.println("Month salary: " + monthsalary);
	}
	
	

}
