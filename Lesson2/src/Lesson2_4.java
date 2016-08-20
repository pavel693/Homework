//Написать программу, которая проверит, является ли число четным или нечетным

public class Lesson2_4 {

	public static void main(String[] args) {

	float a = 13;
	float b = 20;
	
	float result1 = a / 2;
	int result2 = (int) a / 2;

	if (result1 == result2) {
		System.out.println("Число " + a + " четное");
	} else {
		System.out.println("Число " + a + " не четное");
		}
	
	result1 = b / 2;
	result2 = (int) b / 2;

	if (result1 == result2) {
		System.out.println("Число " + b + " четное");
	} else {
		System.out.println("Число " + b + " не четное");
		}
	
	}
}

/*

// этот вариант я нашел в интернете, наверное он более правильный чем мой ))

public class ifEven {
	
	public static void main(String[] args) {

	int c = 9;

	if ( (c % 2) == 0) {
		System.out.println("Number " + c + " is even");
	} else {
		System.out.println("Number " + c + " is not even");
		}
	}
}
*/