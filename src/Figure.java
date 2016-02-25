

public interface Figure {
//	private int base;
//	private int height;
//
//	public Figure(int base, int height){
//		setBase(base);
//		setHeight(height);
//	}
//
//	public void show(){
//		System.out.println("底辺の長さ:" + base);
//		System.out.println("高さ      :" + height);
//	}
//
//	public double getArea(){
//		return 0.0;
//	}
//
//	public void setBase(int base){
//		if(base > 0){
//			this.base = base;
//		}
//	}
//
//	public void setHeight(int height){
//		if(height > 0){
//			this.height = height;
//		}
//	}
//
//	public int getBase(){
//		return base;
//	}
//
//	public int getHeight(){
//		return height;
//	}

	public static final double PI = 3.14;
	public static final double HALF = 2.0;


	public abstract void show();
	public abstract double getArea();
	public abstract void draw();

}
