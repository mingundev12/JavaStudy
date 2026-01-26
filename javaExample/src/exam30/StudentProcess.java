package exam30;

import java.util.List;
import java.util.Scanner;

public class StudentProcess {
	
	private Scanner sc;
	private String menu;
	private boolean programExit;
	private StudentDAO dao;
	List<StudentDTO> list;
	
	public StudentProcess(Scanner sc) throws Exception{
		this.sc = sc;
		this.menu = "";
		this.programExit = false;
		this.dao = new StudentDAO();
	}

	private void setProgramExit() throws Exception {
		programExit = !programExit;
		dao.dbClose();
		System.out.println("- 프로그램 종료 -");
	}
	
	public boolean getProgramExit() {
		return programExit;
	}

	public void selectMenu() throws Exception {
		menu = getInput("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제, 기타:종료)");
		switch(menu) {
		case "1":
			viewList();
			break;
		case "2":
			viewDetail();
			break;
		case "3":
			insertNew();
			break;
		case "4":
			update();
			break;
		case "5":
			delete();
			break;
		default :
			setProgramExit();
		}
	}
	
	private void viewList() throws Exception {
		System.out.println("- 목록 -");
		
		String command = "select";
		String sql = " * from student order by id_number desc";
		
		dao.execute(command, sql);
		
		this.list = dao.getList();
		
		displaySimple();
	}
	
	private void viewDetail() throws Exception {
		System.out.println("- 상세보기 -");
		
		String name = getInput("상세보기할 학생 이름 : ");
		
		String command = "select";
		String sql = " * from student where name = '" 
					+name +"'";
		dao.execute(command, sql);
		
		this.list = dao.getList();
		
		displayDetail();
	}

	private void insertNew() throws Exception {
		System.out.println("- 등록 -");
		
		String name = getInput("이름 : ");
		String ssn = getInput("주민번호 : ");
		String phone = getInput("전화번호 : ");
		String address = getInput("주소 : ");
		
		String command = "insert";
		String sql = "";
		sql += " into student (id_number, name, ssn, phone, address, created_date) values";
		sql += "(null,'" + name + "','" + ssn + "','" + phone + "','" + address + "',now())";
		
		dao.execute(command, sql);
	}

	private void update() throws Exception{
		System.out.println("- 수정 -");
		
		String name = getInput("수정할 학생 이름 : ");
		String phone = getInput("수정할 전화번호 : ");
		String address = getInput("수정할 주소 : ");
		
		String command = "update";
		String sql = " student set phone = '" + phone +
				"', address = '" + address + "' where " +
				"name = '" + name + "'";
		
		dao.execute(command, sql);
	}

	private void delete() throws Exception{
		System.out.println("- 삭제 -");
		
		String name = getInput("삭제할 학생 이름 : ");
		String reminder = getInput("정말로 삭제하시겠습니까?(y/n)");
		if(!reminder.toLowerCase().equals("y")) {
			System.out.println("메뉴로 돌아갑니다");
			return;
		}
		
		String command = "delete";
		String sql = " from student where " +
				"name = '" + name + "'";
		
		dao.execute(command, sql);
	}
	
	private void displaySimple() {
		System.out.println("학번\t이름\t전화번호\t\t주소");
		for(StudentDTO student : list) {
			student.displaySimple();
		}
	}
	
	private void displayDetail() {
		System.out.println("학번\t이름\t주민번호\t\t전화번호\t\t주소\t등록일");
		for(StudentDTO student : list) {
			student.displayDetail();
		}
	}
	
	private String getInput(String str) {
		System.out.print(str);
		return sc.nextLine();
	}
}
