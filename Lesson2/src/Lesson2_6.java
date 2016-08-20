
//Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11

public class Lesson2_6 {

	public static void main(String[] args) {

	int x = 10;

	int a = 7;
	int b = 14;

	int diff1 = x - a;
	int diff2 = x - b;

	if (diff1 < 0) {
		diff1 = a - x;
		}

	if (diff2 < 0) {
		diff2 = b - x;
		}
	
	if (diff1 > diff2) {
		System.out.println("Число " + b + " ближайшее к числу " + x + " из двух заданных");
	} else {
		System.out.println("Число " + a + " ближайшее к числу " + x + " из двух заданных");
		}
	}
}
