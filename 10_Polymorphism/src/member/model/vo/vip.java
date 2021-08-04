package member.model.vo;

public class vip extends Member{
	
	

	
	
	
	public vip(String name, String grade, int point) {
		super(name,grade,point);
	}


	public vip() {
		
	}
	@Override
	public double getEjaPoint() {
		return (double)(super.getPoint() * 0.1);
	}

	@Override
	public int getPoint() {
		return super.getPoint();
	}
	@Override
	public String toString() {
		return super.getName() +" \t" + super.getGrade() +" \t" + super.getPoint() +" \t" + getEjaPoint() ;
				
	}
	
}
