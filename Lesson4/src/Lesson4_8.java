
public class Lesson4_8 {

    public static void main(String[] args) {

        int ticketNum = 100000;
        int firstPartNum;
        int secondPartNum;
        int counter =0;


        while (ticketNum <= 999999) {

            int a = ticketNum / 1000;
            int b = ticketNum % 1000;
            firstPartNum = 0;
            secondPartNum = 0;

            while (a > 0) {
                int a1 = a % 10;
                a = a / 10;
                firstPartNum = firstPartNum + a1;
                }

            while (b > 0) {
                int b1 = b % 10;
                b = b / 10;
                secondPartNum = secondPartNum + b1;
                }

            if (firstPartNum == secondPartNum) {
                System.out.println(ticketNum);
                counter++;
            }

            ticketNum++;
        }
        System.out.println("Number of lucky tickets is " + counter);
    }
}
