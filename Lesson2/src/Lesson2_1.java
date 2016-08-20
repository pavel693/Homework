
//Найти минимальное из 3х чисел

public class Lesson2_1 {

	public static void main(String[] args) {
		
	int a = 10;
	int b = 15;
	int c = 5;
	int min = a;

	if (b < a) {
		min = b;
		}
	if (c < min) {
		min = c;
		}
	System.out.println("Минимально число- " + min);
	}
}