package member.model.vo;

public class vvip {
	
	
	private String name;
	private String grade;
	private int point;
	
	
	
	
	
	
	public vvip(String name, String grade, int point) {
		super();
		this.name = name;
		this.grade = grade;
		this.point = point;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}



	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	public int getNormalPoint() {
		return point;
	}
	public double getPoint() {
		return point * 0.15;
	}


	public void setPoint(int point) {
		this.point = point;
	}


	public vvip() {
		
	}
	
}
