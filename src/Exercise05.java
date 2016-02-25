
public class Exercise05 {
	public static void main(String[] args){
		Employee[] emp = new Employee[6];
		emp[0] = new Employee("矢沢  晃", 5, 28);
		emp[1] = new Employee("宮元  順子", 10, 33);
		emp[2] = new Employee("藤原  美和子", 3, 23);
		emp[3] = new Employee("土浦  巧", 25, 45);
		emp[4] = new Employee("野崎  りさ", 18, 38);
		emp[5] = new Employee("浅井  真治", 8, 31);

		for(int i = 0; i < emp.length; i++){
			emp[i].display();
		}

		Employee.showTotalNumber();
	}

}
