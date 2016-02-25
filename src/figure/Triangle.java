package figure;

public class Triangle implements Figure{
	private int base;
	private int height;

	public Triangle(int b, int h){
		base = b;
		height = h;
	}

	public void show(){
		System.out.println("面積:" + getArea());
		System.out.println("底辺:" + getBase());
		System.out.println("高さ:" + getHeight());


	}

	public double getArea(){
		return (double)(base * height) / HALF;
	}

	public void setBase(int b){
		if(b > 0){
			base = b;
		}
	}

	public void setHeight(int h){
		if(h > 0){
			height = h;
		}
	}

	public int getBase(){
		return base;
	}

	public int getHeight(){
		return height;
	}

	public void draw(){
		System.out.println("△");
	}
}
//
//public class Triangle extends Figure{
//	private final double HALF = 2.0;
//
//	public Triangle(int b, int h){
//		super(b, h);
//		getBase();
//		getHeight();
//	}
//
//	public void show(){
//		super.show();
//		System.out.println("面積:" + (double)(getBase() * getHeight()) / HALF);
//	}
//
//	public double getArea(){
//		return super.getArea();
//	}
//
//}