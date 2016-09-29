package ua.od.hillel.game;

public class MoveValidator {

    public boolean validateMove(String move, char boardChar) {
        if (move.length() > 2) {
            System.out.println("You have one more chance to do a right turn, you should enter two digit from 0 to 2 without space ");
            return false;
        }
        int i = move.charAt(0) - '0';
        int j = move.charAt(1) - '0';

        if (i > 2) {
            System.out.println("You have one more chance to do a right turn, you should choose free field on the board");
            return false;
        }
        if (j > 2) {
            System.out.println("You have one more chance to do a right turn, you should choose free field on the board");
            return false;
        }
        if (boardChar != ' ') {
            System.out.println("You have one more chance to do a right turn, you should choose free field on the board");
            return false;
        }
        return true;
    }
}