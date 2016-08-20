
//Найти среди 3х чисел максимальное и минимальное

public class Lesson2_2 {

	public static void main(String[] args) {
		
	int a = 30;
	int b = 20;
	int c = 10;
	
	int min = a;
	int max = b;

	if (a > b) {
		min = b;
		max = a;
		}
	if (c > max) {
		max = c;
		}
	if (c < min) {
		min = c;
		}
	System.out.println("Максимальное число- " + max);
	System.out.println("Минимальное число- " + min);
	}
}