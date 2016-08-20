
//ѕосчитайте, сколько будет стоить аренда квартиры за заданное число дней,
// если известно, что за 1 день ее стоимость 40 грн. ѕричем, если съемщик прожил
// в ней больше 5 дней, он получит скидку 20 грн, а если больше 7 дней, то скидка составит 50 грн.
//¬ходные данные дл€ задач можно указывать просто переменными в коде, например, дл€ последней задачи:
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

	System.out.println("—умма денег за проживание составит " + totalPrice + "грн");

	}
}
