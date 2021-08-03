package member.model.vo;

public class vvip extends Member {
	
	
	
	
	public vvip(String name, String grade, int point) {
		super(name,grade,point);
		
	}

	public vvip() {
		
	}
	@Override
	public double getEjaPoint() {
		return (double)(super.getPoint() * 0.15);
	}

	@Override
	public int getPoint() {
		return super.getPoint();
	}
	
}
