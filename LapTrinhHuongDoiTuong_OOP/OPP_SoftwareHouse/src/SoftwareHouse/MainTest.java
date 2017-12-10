package SoftwareHouse;

import java.util.ArrayList;
import java.util.List;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer ted = new Programmer("Teddy", 10000000, "Java, Android");
		
		ted.displayProgammer();
		
		//---------------------------------
		
		Programmer nguyen = new Programmer("Andy Nguyễn", "PHP - Laravel framework");
		Programmer conan = new Programmer("Edogawa Conan", "ASP .Net");
		Programmer thu = new Programmer("Thu Autum", "Java");
		Programmer ha = new Programmer("Hà", "Android");
		
		SoftwareHouse vnpt = new SoftwareHouse("TTCNTT - VNPT Tiền Giang");
		vnpt.Hire(nguyen);
		vnpt.Hire(conan);
		vnpt.Hire(thu);
		vnpt.Hire(ha);
		
		vnpt.display();//Hiển thị tên công ty phát triển phần mềm
		
		ProjectLeader teamJava = new ProjectLeader("Java");
		teamJava.addMember(nguyen);
		teamJava.setLeader(ha);
		
		ProjectLeader teamAndroid = new ProjectLeader("Android");
		teamAndroid.setLeader(conan);
		teamAndroid.addMember(thu);
		teamAndroid.addMember(ha);
		
		teamJava.display();
		List<Programmer> team1 = teamJava.getMember();
		for (Programmer tv_java : team1 )
			tv_java.display();
		
		
		teamAndroid.display();
		List<Programmer> team2 = teamAndroid.getMember();
		for (Programmer tv_Android: team2)
			tv_Android.display();
				
		
		
		

	}

}
