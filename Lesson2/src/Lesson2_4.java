//�������� ���������, ������� ��������, �������� �� ����� ������ ��� ��������

public class Lesson2_4 {

	public static void main(String[] args) {

	float a = 13;
	float b = 20;
	
	float result1 = a / 2;
	int result2 = (int) a / 2;

	if (result1 == result2) {
		System.out.println("����� " + a + " ������");
	} else {
		System.out.println("����� " + a + " �� ������");
		}
	
	result1 = b / 2;
	result2 = (int) b / 2;

	if (result1 == result2) {
		System.out.println("����� " + b + " ������");
	} else {
		System.out.println("����� " + b + " �� ������");
		}
	
	}
}

/*

// ���� ������� � ����� � ���������, �������� �� ����� ���������� ��� ��� ))

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