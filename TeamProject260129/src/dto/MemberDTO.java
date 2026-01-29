package dto;

public class MemberDTO {
	private int id;
	private String name;
	private String birth;
	private String phone;
	private String email;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public MemberDTO() {
		// TODO Auto-generated constructor stub
	}

	public MemberDTO(int id, String name, String birth, String phone, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.birth = birth;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "MemberDTO [id=" + id + ", name=" + name + ", birth=" + birth + ", phone=" + phone + ", email=" + email
				+ "]";
	}

}
