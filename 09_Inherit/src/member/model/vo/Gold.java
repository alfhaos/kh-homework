package member.model.vo;

public class Gold extends Member{
	
	
	
	public Gold(String name, String grade, int point) {
		super(name,grade,point);
	}

	@Override
	public double getEjaPoint() {
		return (double)(super.getPoint() * 0.05);
	}

	@Override
	public int getPoint() {
		return super.getPoint();
	}
	public Gold() {
		
	}
	
}
