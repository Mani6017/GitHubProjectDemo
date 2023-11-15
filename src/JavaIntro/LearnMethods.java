package JavaIntro;

public class LearnMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = getRandomNums();
		myMethod("Random numbers ", number);
		int numbers = getRandomNums();
		myMethod("another random numbers ", numbers);
	}
	static void myMethod(String msg, int num) {
		System.out.println(msg + num);
	}
	static int getRandomNums() {
		return (int) ((Math.random()) * 101);
	}

}
