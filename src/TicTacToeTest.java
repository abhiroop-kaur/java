
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }
// testing for correct row length
    @Test
    void rowsInTest1() {
        int[][] array1={{1,2},{3,5},{88,0},{6,6}};
        assertEquals(4,TicTacToe.rowsIn(array1));
    }
// testing for correct row length
    @Test
    void rowsInTest2() {
        int[][] array1={};
        assertEquals(0,TicTacToe.rowsIn(array1));
    }

//testing for correct column length
    @Test
    void columnInTest1() {
        int[][] array1={};
        assertEquals(4,TicTacToe.columnsIn(array1));
    }
//testing for correct column length
    @Test
    void columnsInTest2() {
        int[][] array1={{1,2,3}};
        assertEquals(3,TicTacToe.columnsIn(array1));
    }
// testing if playing index is empty
    @Test
    void canPlayTest1() {
    int[][] array1={{1,2},{0,0},{88,0},{6,6}};
        assertTrue(TicTacToe.canPlay(array1, 1, 1));
    }
//testing if playing index is empty
    @Test
    void canPlayTest2() {
        int[][] array1={{1,2},{0,0},{88,10},{6,6}};
        assertFalse(TicTacToe.canPlay(array1, 2, 1));
    }

// testing for playing at the given index
    @Test
    void play1() {
        int[][] array1={{0,0},{0,0},{0,0},{0,0}};
        int[][] array2={{0,0},{0,0},{0,1},{0,0}};
        TicTacToe.play(array1,2,1,TicTacToe.X);
        assertArrayEquals(array2,array1);
    }
//testing for playing at the given index
    @Test
    void play2() {
        int[][] array1={{0,0},{0,0},{0,0},{0,0}};
        int[][] array2={{0,0},{0,0},{0,0},{2,0}};
        TicTacToe.play(array1,3,0,TicTacToe.O);
        assertArrayEquals(array2,array1);
    }
// testing if the board is full case- false
    @Test
    void full1() {
        int[][] array1={{0,0},{0,0},{0,0},{0,0}};
        assertFalse(TicTacToe.full(array1));
    }

//testing if the board is full case- true
    @Test
    void full2() {
    int[][] array1={{1,2,1},{2,1,1}};
    assertTrue(TicTacToe.full(array1));
}

// testing to create a board
    @Test
    void createBoard() {
        int[][] array1=TicTacToe.createBoard(3,3);
        int[][] array2={{0,0,0},{0,0,0},{0,0,0}};
        assertArrayEquals(array2,array1);
    }
// testing to create a board
    @Test
    void createBoard2() {
        int[][] array1=TicTacToe.createBoard(3,4);
        int[][] array2={{0,0,0,0},{0,0,0,0},{0,0,0,0}};
        assertArrayEquals(array2,array1);
    }
// testing for win in row case-true
    @Test
    void winInRow1() {
        int[][] array2={{2,2,2},{2,2,2},{2,2,1}};
        assertEquals(true,TicTacToe.winInRow(array2,1,TicTacToe.O));
    }
// testing for win in row case-false
    @Test
    void winInRow2() {
        int[][] array2={{1,1,0},{2,0,2},{2,2,1}};
        assertEquals(false,TicTacToe.winInRow(array2,1,TicTacToe.X));
    }
// testing for win in column case-false
    @Test
    void winInColumn() {
            int[][] array2={{1,1,0},{2,0,2},{2,2,1}};
            assertEquals(false,TicTacToe.winInColumn(array2,1,TicTacToe.X));
    }
// testing for win in column case-false
    @Test
    void winInColumn2() {
        int[][] array2={{1,1,1},{2,0,2},{2,2,2}};
        assertEquals(false,TicTacToe.winInColumn(array2,2,TicTacToe.X));
    }
// testing for win in column case-true
    @Test
    void winInColumn3() {
        int[][] array2={{1,1,1},{2,1,1},{2,1,1}};
        assertEquals(true,TicTacToe.winInColumn(array2,2,TicTacToe.X));
    }


//testing for win in BS diagonal case-true
    @Test
    void winInDiagonalBS() {
        int[][] array2={{1,1,1},{2,1,2},{2,2,1}};
        assertEquals(true,TicTacToe.winInDiagonalBS(array2,TicTacToe.X));
    }
//testing for win in BS diagonal case-false
    @Test
    void winInDiagonalBS2() {
        int[][] array2={{1,1,0},{2,0,2},{2,2,1}};
        assertEquals(false,TicTacToe.winInDiagonalBS(array2,TicTacToe.X));
    }

//testing for win in BS diagonal case-true
    @Test void winInDiagonalFS() {
        int[][] array2={{1,1,1},{2,1,2},{1,2,1}};
        assertEquals(true,TicTacToe.winInDiagonalFS(array2,TicTacToe.X));
    }
//testing for win in BS diagonal case-true
    @Test void winInDiagonalFS2() {
        int[][] array2={{1,1,1},{2,1,2},{1,2,1}};
        assertEquals(true,TicTacToe.winInDiagonalFS(array2,TicTacToe.O));
    }
    // testing for hint
    @Test
    void hint() {
        int[][] array2={{1,1,0},{2,0,2},{2,2,1}};
        int[] array1=TicTacToe.hint(array2,TicTacToe.X);

    }
    //
    @Test
    void factorial() {

    }
}