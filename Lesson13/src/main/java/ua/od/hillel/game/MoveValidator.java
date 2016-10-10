package ua.od.hillel.game;

public class MoveValidator {

    final String MESSAGE1 = "You have one more chance to do a right turn, you should enter two digit from 0 to 2 without space";
    final String MESSAGE2 = "You have one more chance to do a right turn, you should choose free field on the board";

    public boolean validateMove(String move) {
        if (move.length() > 2) {
            System.out.println(MESSAGE1);
            return false;
        }
        int i = move.charAt(0) - '0';
        int j = move.charAt(1) - '0';

        if (i > 2) {
            System.out.println(MESSAGE2);
            return false;
        }
        if (j > 2) {
            System.out.println(MESSAGE2);
            return false;
        }
        return true;
    }

    public boolean validateMove(char boardChar) {
        if (boardChar != ' ') {
            System.out.println(MESSAGE2);
            return false;
        }
        return true;
    }
}