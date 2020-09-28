
public class helloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("khalid", 25);
		Person p2 = new Person("omar", 22);
		Person p3 = new Person("fahad", 29);
		
		Person[] people = {p1,p2,p3};
		
		
		for (Person person : people) {
			System.out.println(person.toString());
		}


		
	}

}
