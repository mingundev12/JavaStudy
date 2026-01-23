package exam29;

import java.util.*;

public class MemberManager {
	
	private Map<String, MemberDTO> memberList;
	private Scanner sc;
	private String menuStr;
	
	public MemberManager() {
		this.memberList = new HashMap<>();
		this.sc = new Scanner(System.in);
		this.menuStr = "";
	}
	
	public boolean menuIsZero() {
		return menuStr.equals("0");
	}
	
	public void chooseMenu() throws Exception {
		System.out.print("회원관리// 목록:1, 상세보기:2, 등록:3, 수정:4, 탈퇴:5, 종료:0/");
		menuStr = getStr();
		switch(menuStr) {
		case "0":
			programExitSequence();
			break;
		case "1":
			viewMemberList();
			break;
		case "2":
			viewMemberDetail();
			break;
		case "3":
			registerNewMember();
			break;
		case "4":
			editMemberInfo();
			break;
		case "5":
			cancelMemberShip();
			break;
		default :
			throwExceptionWrongInput();
		}
	}

	private void programExitSequence() {
		System.out.println("프로그램 종료");
	}

	private void viewMemberList() throws Exception{
		System.out.println("회원 목록");
		
		if(memberList.size() == 0) {
			throwExceptionThereNoMember();
		}
		
		for(String key : memberList.keySet()) {
			memberList.get(key).displaySimple();
		}
	}

	private void viewMemberDetail() throws Exception {
		System.out.println("회원 상세정보");
		
		if(memberList.size() == 0) {
			throwExceptionThereNoMember();
		}
		
		System.out.print("아이디 : ");
		String id = getStr();
		System.out.print("비밀번호 : ");
		String password = getStr();
		
		if(!memberList.containsKey(id) || !memberList.get(id).getPassword().equals(password)) {
			throwExceptionIncorrectMemberInfo();
		}
		
		memberList.get(id).displayDetail();
	}


	private void registerNewMember() {
		System.out.println("신규회원 가입");
		
		String id = "", password = "";
		while(true) {
			System.out.print("아이디 : ");
			id = getStr().toLowerCase();
			if (memberList.containsKey(id) || id.equals("")) {
				alarmDuplicatedMemberId();
			} else {
				break;
			}
		}
		while (true) {
			System.out.print("비밀번호 : ");
			password = getStr();
			System.out.print("비밀번호 확인 : ");
			String password_ = getStr();
			if (!password.equals(password_)) {
				alarmNotEqualPassword();
			} else {
				break;
			}
		}
		System.out.print("이름 : ");
		String memberName = getStr();
		System.out.print("전화번호 : ");
		String phone = getStr();
		System.out.print("주소(지역) : ");
		String province = getStr();
		
		memberList.put(id, new MemberDTO(id, password, memberName, phone, province));
		
		System.out.println("회원등록 완료");
	}

	private void editMemberInfo() throws Exception {
		System.out.println("회원정보 수정");
		
		if(memberList.size() == 0) {
			throwExceptionThereNoMember();
		}
		
		System.out.print("변경할 아이디 : ");
		String id = getStr();
		System.out.print("비밀번호 : ");
		String password = getStr();
		
		if(!memberList.containsKey(id) || !memberList.get(id).getPassword().equals(password)) {
			throwExceptionIncorrectMemberInfo();
		}
		System.out.print("변경할 전화번호 : ");
		String phone = getStr();
		memberList.get(id).setPhone(phone);
		System.out.print("변경할 주소(지역) : ");
		String province = getStr();
		memberList.get(id).setProvince(province);
		
		System.out.println("회원정보 수정 완료");
	}

	private void cancelMemberShip() throws Exception {
		System.out.println("회원 탈퇴");
		
		if(memberList.size() == 0) {
			throwExceptionThereNoMember();
		}
		
		System.out.print("아이디 : ");
		String id = getStr();
		System.out.print("비밀번호 : ");
		String password = getStr();
		
		if(!memberList.containsKey(id) || !memberList.get(id).getPassword().equals(password)) {
			throwExceptionIncorrectMemberInfo();
		}
		
		System.out.print("정말로 탈퇴하시겠습니까?(y/n)");
		String checkCancellation = getStr().toLowerCase();
		
		if(checkCancellation.equals("y")) {
			memberList.remove(id);
			System.out.println("회원탈퇴가 완료되었습니다.");
		}
		callMenuDisplay();
	}

	private String getStr() {
		return sc.nextLine().trim();
	}

	private void callMenuDisplay() {
		System.out.println("메뉴화면으로 돌아갑니다.");
	}

	private void alarmNotEqualPassword() {
		System.out.println("비밀번호가 일치하지 않습니다.");
	}
	
	private void alarmDuplicatedMemberId() {
		System.out.println("중복된 아이디가 존재합니다.");
	}

	private void throwExceptionWrongInput() throws Exception {
		throw new Exception("잘못된 접근입니다.");
	}
	
	private void throwExceptionThereNoMember() throws Exception {
		throw new Exception("회원정보가 존재하지 않습니다!");
	}

	private void throwExceptionIncorrectMemberInfo() throws Exception {
		throw new Exception("아이디 또는 비밀번호가 일치하지 않습니다.");
	}
}
