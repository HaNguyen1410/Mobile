package SoftwareHouse;

import java.util.ArrayList;
import java.util.List;

public class ProjectLeader {
	private String name; //Tên dự án
	private String leader; // nhóm trưởng dự án
	private List<Programmer> staff; // các thành viên
	
	//Hàm khởi tạo
	public ProjectLeader(String name){
		this.name = name;
		this.staff = new ArrayList<>();
	}
	
	public String getLeader() {	
		return leader;
	}
	public void setLeader(Programmer leader) {
		staff.add(leader);
		this.leader = "Project leader: " + leader.getName();
	}

	public void addMember(Programmer engineer){
		staff.add(engineer);
		
	}
	
	public List<Programmer> getMember(){
		return this.staff;
	}
	
	//Lấy thông tin thành viên của Team
	public void display(){
		System.out.println("");
		System.out.println("--------------------Team: " + this.name + "-------------------");
		System.out.println(this.leader);
		System.out.println("LIST MEMBER:");

	}
	
	



}
