
//����� ��������� � 10 �� 2� �������� �����. ��������, ����� ����� 8 � 11 ��������� � ������ 11

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
		System.out.println("����� " + b + " ��������� � ����� " + x + " �� ���� ��������");
	} else {
		System.out.println("����� " + a + " ��������� � ����� " + x + " �� ���� ��������");
		}
	}
}
