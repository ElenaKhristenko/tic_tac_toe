import ua.com.sourceit.ranju.IBoard;
import ua.com.sourceit.ranju.IPlayer;

import java.util.Scanner;

/**
 * Created by Elena on 21.04.2014.
 */
import java.util.Scanner;

import static ua.com.sourceit.ranju.IBoard.BOARD_SIZE;

class Game implements IPlayer {
    public static String nought;
    public static char[][] cell;
//ne ponimau, kak sleduet pravilno realizovat method void setBoard(IBoard board)
//imenno s takim parametrom, i potom kak etot method vizvat v main(),
//kakoy parametr emu peredat??????
    public void setBoard(IBoard board) {
        System.out.println("!");

        cell = new char[5][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[ " + cell[i][j] + " ]");
            }
            System.out.println();
        }
    }

    ///////////////////////////////////
    public void setPlayerFigure(IBoard.Figure figure) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'O' or 'X' ...");
        nought = sc.next();
        if (nought.equals(figure.X.toString())) {
            System.out.println(nought + "X");
        } else if (nought.equals(figure.O.toString())) {
            System.out.println(nought + "O");
        } else {
            System.out.println("Game error!");
            return;
        }
        System.out.println(nought + "final");
        //             sc.close();
    }

    public static String typeOfFigure() {
        return nought;
    }

    //////////////////////////////////
    public void takeTurn() {
        int x, y;
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter y (1...4): ");
        y = reader.nextInt() - 1;
        System.out.println("Enter x (1...5): ");
        x = reader.nextInt() - 1;
        while (x < 0 || x > 4 || y < 0 || y > 3 || cell[x][y] == typeOfFigure().charAt(0)) {
            System.out.println("Incorrect input! Enter y (1...4): ");
            y = reader.nextInt() - 1;
            System.out.println("Incorrect input! Enter x (1...5): ");
            x = reader.nextInt() - 1;
        }
        cell[x][y] = typeOfFigure().charAt(0);
        //              reader.close();
        System.out.println(nought.charAt(0) + " char");
    }

    public static void main(String[] args) {
        System.out.println("Hello!");
        Game game = new Game();
//        ((IPlayer) game).setBoard(IBoard board);?????
        ((IPlayer) game).setPlayerFigure(IBoard.Figure.EMPTY);//????kakoy parametr nuzhno peredat
       //dlya vizova methoda???
        ((IPlayer) game).takeTurn();
    }
}
