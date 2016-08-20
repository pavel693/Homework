
// Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа

public class Lesson2_3 {

	public static void main(String[] args) {

	int a = 15;
	int b = 20;
	int c = 15;
	int min1 = a;
	
	if (b < a) {
		min1 = b;
		}

	if (c < min1) {
		min1 = c;
		}

	if (a == min1) {
		System.out.println("Minimal number a- " + a);
		}

	if (b == min1) {
		System.out.println("Minimal number b- " + b);
		}

	if (c == min1) {
		System.out.println("Minimal number c- " + c);
		}
	}
}