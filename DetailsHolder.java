package EmployeeManagementTask;

public class DetailsHolder { // POJO class contains only getter and setter
	private String empId;
	private String empName;
	private String empDept;
	private String contactNum;

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public String getContactNum() {
		return contactNum;
	}
}
