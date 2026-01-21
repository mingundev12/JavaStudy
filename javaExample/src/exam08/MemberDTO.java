package exam08;

import java.sql.Date;

public class MemberDTO {

	private int no;
	private String id;
	private String password;
	private String name;
	private String phone;
	private Date createdDate;

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(int no, String id, String password, String name, String phone, Date createdDate) {
		this.no = no;
		this.id = id;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.createdDate = createdDate;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

//	@Override
//	public String toString() {
//		return "MemberDTO [no=" + no + ", id=" + id + ", name=" + name + ", phone=" + phone + ", createdDate="
//				+ createdDate + "]";
//	}

	
}
