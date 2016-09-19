package ua.od.hillel;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class BoardTest {
    Player playerFirst;
    Player playerSecond;

    Board board;

    @Before
    public void setUp() {
        playerFirst = new Player("Bob", 25, 'X');
        playerSecond = new Player("Mike", 35, 'O');
        board = new Board(playerFirst, playerSecond);
    }

    @Test
    public void makeMoveTest() {
        String makeMove = "01";
        boolean actualResult = board.makeMove(makeMove);
        assertThat(actualResult, is(true));
    }

    @Test
    public void gameFinishedTest() {
        board.makeMove("00");
        board.makeMove("20");
        board.makeMove("01");
        board.makeMove("21");
        board.makeMove("02");
        boolean actualResult = board.gameFinished();
        assertThat(actualResult, is(true));
    }

    @Test
    public void findWinnerTest() {
        board.makeMove("00");
        board.makeMove("10");
        board.makeMove("01");
        board.makeMove("11");
        board.makeMove("02");
        Player actualWinner = board.getWinner();
        assertThat(actualWinner, is(playerFirst));
    }
}
