package figure;

public class Circular implements Figure{
	private int radius;

	public Circular(int r){
		radius = r;
	}

	public void show(){
		System.out.println("半径" + getRadius());
		System.out.println("面積" + getArea());
	}

	public double getArea(){
		return radius * radius * PI;
	}

	public void setRadius(int r){
		if(r > 0){
			radius = r;
		}
	}

	public int getRadius(){
		return radius;
	}

	public void draw(){
		System.out.println("○");
	}
}
