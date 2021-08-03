package member.model.vo;

public class Silver extends Member {

	
	public Silver(String name, String grade, int point) {
		super(name,grade,point);
		
	}
	
	public Silver() {
	}
	
	@Override
	public double getEjaPoint() {
		return (double)(super.getPoint() * 0.02);
	}

	@Override
	public int getPoint() {
		return super.getPoint();
	}
	
	
	
}
