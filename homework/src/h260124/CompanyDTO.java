package h260124;

public class CompanyDTO {

	private String companyName; // 회사명
	private String province; // 지역
	private String task; // 채용 업무

	public CompanyDTO(String companyName, String province, String task) {
		this.companyName = companyName;
		this.province = province;
		this.task = task;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}
	
	@Override
	public String toString() {
		return "[회사명 : " + companyName + 
				", 지역 : " + province + 
				", 채용업무 : " + task + "]";
	}
}
