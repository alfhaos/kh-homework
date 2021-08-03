package kh.java.Inherit.shape;

/**
 * 
 * Circle은 하나의 Shape(도형)이다.		- is a 상속관계(일반화 관계)
 * 
 * Circle은 중심점 Point을 가지고 있다.   - has a 포함관계
 * 
 *
 */
public class Circle extends Shape{
	
	private Point center;
	private int r;
	
	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}
	
	
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	@Override
	public void draw() {
		System.out.printf("중심점이 (%d, %d)이고, 반지름이 %d인 원을 그린다.\n",center.getX(),center.getY(),r);
		
	}
	
}
