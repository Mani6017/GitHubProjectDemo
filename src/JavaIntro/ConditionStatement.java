package JavaIntro;


public class ConditionStatement {
	int time = 26;
	public void userMethod() {
		
	
		if (time < 24) {
			System.out.println("Good Day");
		}else if (time < 22) {
			System.out.println("Good evening");
		}else {
			System.out.println("Good night");
		}
		
	}

	public static void main(String[] args) {
     ConditionStatement stat = new ConditionStatement();
     stat.userMethod();
     
     // if- else statement
     // if- else statement
     int time = 23;
     String str = time > 21 ? "good day" : "good evening";
     System.out.println(str);
     
     // instead of writing many if - else statement, we can use switch statement
     
     int day = 4;
	switch(day) {
	case 1:
		System.out.println("Monday");
	case 2:
		System.out.println("tuesday");
	case 3:
		System.out.println("wednesday");
	case 4:
		System.out.println("thursday");
		break;
	case 5:
		System.out.println("friday");
		break;
	case 6:
		System.out.println("saturday");
		break;
	case 7:
		System.out.println("sunday");
		break;
     }
	}

}
