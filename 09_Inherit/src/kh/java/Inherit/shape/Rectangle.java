package kh.java.Inherit.shape;

public class Rectangle extends Shape {

	private static final int max = 4;
	private Point[] points = new Point[max];
	
	private int width;
	private int height;

	public Rectangle() {
		super();
	}
	
	
	public Rectangle(Point[] points, int width, int height) {
		super();
		this.points = points;
		this.width = width;
		this.height = height;
		
	}


	@Override
	public void draw() {
		System.out.printf("네 꼭지점이 (%d,%d),(%d,%d),(%d,%d),(%d,%d)이고"
				+ ", 너비가 %d, 높이가 %d인 사각형을 그린다.\n",points[0].getX(),points[0].getY(),points[1].getX(),
				points[1].getY(),points[2].getX(),points[2].getY(),points[3].getX(),points[3].getY(),width,height);
	}
	
	@Override
	public double getArea() {
		return width * height;
	}
	@Override
	public String toString() {
		return  "points = [(" + points[0].getX() + ", "+ points[0].getY() + "), (" +
				points[1].getX() +", " + points[1].getY() + "), (" + points[2].getX() + ", " + points[2].getY()
				+ "), (" + points[3].getX() + ", " + points[3].getY() + ")], width=" +width+", height="+height;
	}

	public Point[] getPoints() {
		return points;
	}


	public void setPoints(Point[] points) {
		this.points = points;
	}


	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	
}
