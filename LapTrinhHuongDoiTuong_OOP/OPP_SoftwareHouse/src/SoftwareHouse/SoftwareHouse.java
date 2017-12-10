package SoftwareHouse;

import java.util.ArrayList;
import java.util.List;

public class SoftwareHouse {
	private String name; //tên công ty
	private List<Programmer> prog; //các nhân viên lập trình trong công ty
	
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name =name;
	}
	
	//Khởi tạo lớp SoftwareHouse
	public SoftwareHouse(String name){
		this.setName(name); // set tên công ty
		this.prog = new ArrayList<Programmer>(); //lấy danh sách nhân viên lập trình trong công ty
	}
	
	public void display(){
		System.out.println("Company name is: " + this.name);
	}
	//Khai báo phương thức THUÊ kỹ sư lập trình
	public void Hire(Programmer engineer){
		prog.add(engineer);
	}

}
