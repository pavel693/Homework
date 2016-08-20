//ƒаны 2 числа, определить делитс€ ли первое число на второе без остатка

public class Lesson2_5 {

	public static void main(String[] args) {

	int a = 24;
	int b = 9;
	int result = a / b; 

	if (a % b == 0) {
		System.out.println("„исло " + a + " делитс€ без остатка на " + b + " и результат этой операции равен " + result);
	} else {
		System.out.println("„исло " + a + " не делитс€ без остатка на " + b);			
		}

	}
}