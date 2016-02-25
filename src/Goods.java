
public class Goods {
	String name;
	int cost;
	static double rate;

	public Goods(String n, int c){
		this.name = n;
		this.cost = c;
	}

	public Goods(String n){
		this(n, 0);
	}

	String getName(){
		return name;
	}

	static double getRate(){
		return rate;
	}

	int getCost(){
		return cost;
	}

	int getPrice(int cost){
		double price;
		price = cost * (1 + rate);
		return (int)price;
	}

	void setName(String n){
		this.name = n;
	}

	void setCost(int c){
		this.cost = c;
	}

	static void setRate(double r){
		rate = r;
	}

	void show(){
		System.out.println("商品名    :" + name);
		System.out.println("税抜き価格:" + cost);
		System.out.println("税率      :" + rate);
		System.out.println("税込価格  :" + getPrice(cost));

	}

}
