package exam29;

public class MemberDTO {

	private String id;
	private String password;
	private String memberName;
	private String phone;
	private String province;
	
	public MemberDTO(String id, String password, String memberName, String phone, String province) {
		this.id = id;
		this.password = password;
		this.memberName = memberName;
		this.phone = phone;
		this.province = province;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
	
	public void displaySimple() {
		String msg = id + "\t" + memberName;
		System.out.println(msg);
	}
	
	public void displayDetail() {
		String msg = id + " 회원의 상세정보 : " + memberName + "\t" + phone + "\t" + province;
		System.out.println(msg);
	}
}
