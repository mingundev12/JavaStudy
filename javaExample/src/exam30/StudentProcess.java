package exam30;

import java.util.List;
import java.util.Scanner;

public class StudentProcess {
	
	private Scanner sc;
	private String menu;
	private boolean programExit;
	private StudentDAO dao;
	List<StudentDTO> list;
	
	public StudentProcess() throws Exception{
		this.sc = new Scanner(System.in);
		this.menu = "";
		this.programExit = false;
		this.dao = new StudentDAO();
	}

	private void setProgramExit() {
		programExit = !programExit;
	}
	
	public boolean getProgramExit() {
		return programExit;
	}

	public void selectMenu() throws Exception {
		menu = getInput("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료)");
		switch(menu) {
		case "1":
			viewStudentList();
			break;
		case "2":
			viewStudentDetail();
			break;
		case "3":
			registrateStudent();
			break;
		case "4":
			System.out.println("- 수정 -");
			break;
		case "5":
			System.out.println("- 삭제 -");
			break;
		default :
			System.out.println("- 종료 -");
			setProgramExit();
		}
	}
	
	private void viewStudentDetail() throws Exception {
		System.out.println("- 상세보기 -");
		
		String name = getInput("이름 : ");
		
		String command = "select";
		String sql = " * from student where name = '" 
					+name +"'";
		dao.executeQuery(command, sql);
		
		this.list = dao.getStudentList();
		
		displayDetail();
	}

	private void viewStudentList() throws Exception {
		System.out.println("- 목록 -");
		
		String command = "select";
		String sql = " * from student";
		
		dao.executeQuery(command, sql);
		
		this.list = dao.getStudentList();
		
		displaySimple();
	}
	
	private void displaySimple() {
		for(StudentDTO student : list) {
			student.displaySimple();
		}
	}
	
	private void displayDetail() {
		for(StudentDTO student : list) {
			student.displayDetail();
		}
	}

	private void registrateStudent() throws Exception {
		System.out.println("- 등록 -");
		
		String name = getInput("이름 : ");
		String ssn = getInput("주민번호 : ");
		String phone = getInput("전화번호 : ");
		String address = getInput("주소 : ");
		
//		StudentDTO student = new StudentDTO(name, ssn, phone, address);
//		dao.setInsert(student);
		
		String command = "insert";
		String sql = "";
		sql += " into student (id_number, name, ssn, phone, address, created_date) values";
		sql += "(null,'" + name + "','" + ssn + "','" + phone + "','" + address + "',now())";
		
		dao.executeQuery(command, sql);
	}
	
	private String getInput(String str) {
		System.out.print(str);
		return sc.nextLine();
	}
}
