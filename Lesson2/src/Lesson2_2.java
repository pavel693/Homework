
//����� ����� 3� ����� ������������ � �����������

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
	System.out.println("������������ �����- " + max);
	System.out.println("����������� �����- " + min);
	}
}