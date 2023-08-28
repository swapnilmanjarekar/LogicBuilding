package Oops.Encapsulation;

public class EncapsulationExp {
	
	private int empId;
	private String emppName;
	private double empSalary;
	
	public EncapsulationExp(int empId,String empName,double empSalary) {
		this.empId=empId;
		this.emppName=empName;
		this.empSalary=empSalary;
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmppName() {
		return emppName;
	}

	public void setEmppName(String emppName) {
		this.emppName = emppName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "EncapsulationExp [empId=" + empId + ", emppName=" + emppName + ", empSalary=" + empSalary + "]";
	}
	
	
	
	

}
