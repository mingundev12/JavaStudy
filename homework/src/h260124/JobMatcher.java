package h260124;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JobMatcher {
	
	List<CompanyDTO> companyList; // 회사 리스트
	List<EmployeeDTO> employeeList; // 직장인 리스트
	Scanner sc; // 키보드 입력
	String menuStr; // 입력받은 메뉴

//	생성자
	public JobMatcher() {
		companyList = new ArrayList<>();
		employeeList = new ArrayList<>();
		sc = new Scanner(System.in);
		menuStr = "";
		/* 초기 테스트용 데이터 (AI를 이용한 생성) */
		companyList.add(new CompanyDTO("넥스트코드","서울","AI"));
		companyList.add(new CompanyDTO("그린에너지텍","대전","태양광"));
		companyList.add(new CompanyDTO("블루웨이브","부산","보안"));
		companyList.add(new CompanyDTO("스마트물류","경기","드론"));
		companyList.add(new CompanyDTO("메타디자인","제주","가상현실"));
		companyList.add(new CompanyDTO("화이트실드","서울","보안"));
		companyList.add(new CompanyDTO("가디언네트웍스","서울","보안"));
		companyList.add(new CompanyDTO("사이버트러스트","경기","보안"));
		
		employeeList.add(new EmployeeDTO("김도윤","넥스트코드",30,"경기","보안"));
		employeeList.add(new EmployeeDTO("이서아","그린에너지텍",25,"제주","방산"));
		employeeList.add(new EmployeeDTO("박지후","스마트물류",22,"서울","AI"));
		employeeList.add(new EmployeeDTO("최민준","그린에너지텍",35,"대전","드론"));
		employeeList.add(new EmployeeDTO("정하윤","블루웨이브",28,"부산","가상현실"));
		/*  */
	}
	
//	선택한 메뉴에 따라 알맞는 메서드를 호출하는 메서드
	public void selectMenu() {

		System.out.print("메뉴 선택(1:매칭, 2:회사조회, 3:정보수정, 4:종료)");
		menuStr = sc.nextLine();
		
		switch(menuStr) {
		case "1":
			matching();
			break;
		case "2":
			checkCompanyInfo();
			break;
		case "3":
			editEmployeeInfo();
			break;
		case "4":
			System.out.println("==프로그램 종료==");
			break;
		default :
			System.out.println("올바른 메뉴를 입력해주세요!");
			return;
		}
	}

	//	프로그램을 종료하기 위해 메뉴 선택에서 4를 입력했는지 여부를 보내는 메서드 
	public boolean isExit() {
		return menuStr.equals("4");
	}
	
//	입력받은 이름의 직장인이 희망하는 업무로 채용하는 회사명을 출력
	private void matching() {
		System.out.println("- 매칭 -");
		
		System.out.print("직장인 이름 : ");
		String employeeName = sc.nextLine();
		
		EmployeeDTO employee = searchEmployeeByName(employeeName);
		if (employee != null) {
			System.out.println("희망업무 기준 추천회사를 검색합니다.");
			matchCompanyByTask(employee.getHopeTask());
		} else {
			System.out.println("이직희망 등록중인 사용자명과 일치하지 않습니다!");
		}
	}

//	입력받은 회사명으로 회사의 지역, 채용업무를 출력
	private void checkCompanyInfo() {
		System.out.println("- 회사조회 -");
		
		System.out.print("회사명 : ");
		String companyName = sc.nextLine();
		
		CompanyDTO company = searchCompanyByName(companyName);
		
		System.out.println(company.toString());
	}

//	입력받은 이름에 해당하는 직장인의 정보 수정
	private void editEmployeeInfo() {
		System.out.println("- 정보수정 -");
		
		System.out.print("직장인 이름 : ");
		String employeeName = sc.nextLine();
		
		EmployeeDTO employee = searchEmployeeByName(employeeName);
		
		if (employee != null) {
			System.out.print("수정할 회사명 : ");
			String companyName = sc.nextLine();
			employee.setCompanyName(companyName);
			System.out.print("수정할 나이 : ");
			String age_ = sc.nextLine();
			int age = Integer.parseInt(age_);
			employee.setAge(age);
			System.out.print("수정할 희망지역 : ");
			String hopeProvince = sc.nextLine();
			employee.setHopeProvince(hopeProvince);
			System.out.print("수정할 희망업무 : ");
			String hopeTask = sc.nextLine();
			employee.setHopeTask(hopeTask);
		} else {
			System.out.println("이직희망 등록중인 사용자명과 일치하지 않습니다!");
		}
		
	}

//	회사명으로 리스트에 있는 회사 검색
	private CompanyDTO searchCompanyByName(String companyName) {
		for (CompanyDTO company : companyList) {
			if (company.getCompanyName().equals(companyName)) {
				return company;
			}
		}
		return null;
	}

//	직장인 이름으로 직장인 검색
	private EmployeeDTO searchEmployeeByName(String employeeName) {
		for (EmployeeDTO employee : employeeList) {
			if (employee.getEmployeeName().equals(employeeName)) {
				return employee;
			}
		}
		return null;
	}
	
//	희망업무와 일치하는 채용업무의 회사 목록 출력
	private void matchCompanyByTask(String task) {
		int matchCount = 0;
		String msg = "검색 결과 : ";
		for (CompanyDTO company : companyList) {
			if (company.getTask().equals(task)) {
				msg += company.getCompanyName() + ", ";
				matchCount++;
			}
		}
		if (matchCount == 0) {
			msg += "희망업무와 일치하는 회사가 존재하지 않습니다.....";
		}
		System.out.println(msg.substring(0, msg.length() - 2));
	}
}
