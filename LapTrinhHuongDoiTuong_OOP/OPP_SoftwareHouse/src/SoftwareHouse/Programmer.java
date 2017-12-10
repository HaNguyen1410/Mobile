package SoftwareHouse;

public class Programmer extends Employee {
	private String language;
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;		
	}
	//Hàm tạo (constructor) - tạo nhân viên lập trình có tên và ngôn ngữ lập trình
	public Programmer(String name, String lang){
		super(name);
		this.setLanguage(lang);
	}
	// Hàm tạo - 1 nhân viên lập trình có: tên, lương, ngôn ngữ lập trình
	public Programmer(String name, int monthsal, String language) {
		super(name, monthsal); //Thừa kế lại hàm khởi tạo của lớp cha
		this.setLanguage(language);
	}
	
	public void displayProgammer(){
		super.display(); // Thừa kế hàm display() ở lớp cha
		System.out.println(super.getName() + " - programming language: " + this.getLanguage());
		System.out.println("-----------------------------------------------------------------");
		System.out.println();
	}

	
	public void display(){
		System.out.println(super.getName() + " - programming language: " + this.getLanguage());
	}



}
