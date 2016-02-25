


public class Student {
	private String name;
	private int kokugo;
	private int sansu;

	public Student(String name,int kokugo, int sansu){
		this.name = name;
		this.kokugo = kokugo;
		this.sansu = sansu;
	}

	public Student(String name){
		this(name, 0, 0);
	}

	public String getName(){
		return name;
	}

	public int getKokugo(){
		return kokugo;
	}

	public int getSansu(){
		return sansu;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setKokugo(int kokugo){
		this.kokugo = kokugo;
	}

	public void setSansu(int sansu){
		this.sansu = sansu;
	}

	public void show(){
		System.out.println("氏名:" + name);
		System.out.println("国語:" + kokugo);
		System.out.println("算数:" + sansu);
		System.out.println("合計点:" + (kokugo + sansu));
	}
}
