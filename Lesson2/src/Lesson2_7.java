
//����������, ������� ����� ������ ������ �������� �� �������� ����� ����,
// ���� ��������, ��� �� 1 ���� �� ��������� 40 ���. ������, ���� ������� ������
// � ��� ������ 5 ����, �� ������� ������ 20 ���, � ���� ������ 7 ����, �� ������ �������� 50 ���.
//������� ������ ��� ����� ����� ��������� ������ ����������� � ����, ��������, ��� ��������� ������:
//int days = 18;
//int pricePerDay = 40;

public class Lesson2_7 {

	final static int FIVE_DAYS_DISC = 20;
	final static int SEVEN_DAYS_DISC = 50;

	public static void main(String[] args) {

	int days = 18;
	int pricePerDay = 40;
	
	int five = 5;
	int seven = 7;

//	int fiveDaysDisc = 20;
//	int sevenDaysDisc = 50;

	int totalPrice;

	if(days < five) {
		totalPrice = days * pricePerDay;
	} else {
		if(five <= days && days < seven) {
			totalPrice = days * pricePerDay - FIVE_DAYS_DISC;
		} else {
			totalPrice = days * pricePerDay - SEVEN_DAYS_DISC;
			}
		}

	System.out.println("����� ����� �� ���������� �������� " + totalPrice + "���");

	}
}
