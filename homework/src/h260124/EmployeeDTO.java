package h260124;

public class EmployeeDTO {

	private String employeeName; // 이름
	private String companyName; // 소속 회사명
	private int age; // 나이
	private String hopeProvince; // 희망지역
	private String hopeTask; // 희망업무
	
	public EmployeeDTO(String employeeName, String companyName, int age, String hopeProvince, String hopeTask) {
		this.employeeName = employeeName;
		this.companyName = companyName;
		this.age = age;
		this.hopeProvince = hopeProvince;
		this.hopeTask = hopeTask;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHopeProvince() {
		return hopeProvince;
	}

	public void setHopeProvince(String hopeProvince) {
		this.hopeProvince = hopeProvince;
	}

	public String getHopeTask() {
		return hopeTask;
	}

	public void setHopeTask(String hopeTask) {
		this.hopeTask = hopeTask;
	}
	
}
