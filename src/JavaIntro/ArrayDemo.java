package JavaIntro;



public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"BMW", "Mazda", "Toyota", "Chevoralet"};
		System.out.println("cars lenght " + cars.length);
		System.out.println(" get particular element " + cars[0]);
		
		// change an element
		cars[0] = "Honda";
		System.out.println(cars[0]);
		/*for (int i = 0; i < cars.length; i++){
			System.out.println(cars[i]);
		}
		int i = 0;
		while (i < cars.length) {
			System.out.println(cars[i]);
			i++;
		}*/
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		int i = 0;
		do {
			System.out.println(cars[i]);
			i++;
		}
		while(i < cars.length);

	}

}
