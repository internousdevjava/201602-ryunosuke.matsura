
public class ClassTest {
	public static void main(String[] args){
		Employee yamamoto = new Employee("山本  太郎", 2, 20);
		Employee matsuda = new Employee("松田  次郎", 4, 25);
		Employee yasuda = new Employee("安田  三郎", 28);
		Employee nanashi = new Employee();

		yamamoto.setName("山本  小太郎");
		yasuda.setYear(-1);



		yamamoto.display();
		matsuda.display();
		yasuda.display();
		nanashi.display();

	}
}
