package exam30;

import java.sql.Date;

public class StudentDTO {

	private int idNumber;
	private String name;
	private String ssn;
	private String phone;
	private String address;
	private Date createdDate;
	
	public StudentDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public StudentDTO(String name, String ssn, String phone, String address) {
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		this.address = address;
	}

	public StudentDTO(int idNumber, String name, String ssn, String phone, String address, Date createdDate) {
		this.idNumber = idNumber;
		this.name = name;
		this.ssn = ssn;
		this.phone = phone;
		this.address = address;
		this.createdDate = createdDate;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public void displaySimple() {
		String str = idNumber + "\t" + name + "\t" + phone + "\t" + address;
		System.out.println(str);
	}

	public void displayDetail() {
		String str = idNumber + "\t" + name + "\t" + ssn + "\t" + phone + "\t" + address + "\t" + createdDate;
		System.out.println(str);
	}
}
