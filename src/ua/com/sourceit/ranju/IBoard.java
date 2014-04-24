package ua.com.sourceit.ranju;

/**
 * Created by Elena on 21.04.2014.
 */
public interface IBoard {

    /**
     * Enum which represents possible field values
     */
    public enum Figure{
        X,
        O,
        EMPTY;
    }
    /**
     * Board size for square field
     */
    public static final int BOARD_SIZE = 20;

    public Figure getCellValue(int x, int y);

}
