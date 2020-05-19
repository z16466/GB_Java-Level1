package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    //  \u007C vertical line
    //  \u005F underscore character
    //  \u00AF macron character
    //  \u00A4 currency sign
    //  \u00D8 O Letter with stroke
    //  \u00B7 Middle dot

    /**
     * 1. Initialize field 3x7
     * 2. Specify players' sign
     * 3. Keyboard handling (hometask achievement)
     * 4. Move handling (hometask achievement)
     * 5. Check win
     * 6. Move handling (coordinates)
     * 7. Put value on field
     */
    public static final int SIZE = 4;
    public static final char BORDER_LINE = '\u007C'; //'|'
    public static final char DOT_EMPTY = '\u00B7'; //'•'

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            init();
            System.out.println("Повторить игру? да - 1, нет - 0");
        } while (scanner.nextInt() == 1);
    }

    static void init() {
        //---TODO Разбить данную функцию на более на несколько мелких

        char[] signs = rollPlayingSign();
        char humanSign = signs[0];
        char computerSign = signs[1];

        char[][] fieldValues = getFieldValues();

        String currentPlayer = "Computer";
        char currentPlayerSign = computerSign;

        if (humanSign == 'X') {
            currentPlayer = "Human";
            currentPlayerSign = humanSign;

            drawPlayingField(fieldValues);
        }

        boolean isWin = false;
        boolean isNoneWon;

        do {
            int[] coordinates = move(currentPlayer);
            boolean isPlotted;

            do {
                isNoneWon = checkPlotted(fieldValues);
                if (!isNoneWon) break; //Выход из цикла при полном заполнении поля

                isPlotted = putValueOnField(fieldValues, coordinates, currentPlayerSign);
                if (!isPlotted) {
                    coordinates = move(currentPlayer);
                    isPlotted = putValueOnField(fieldValues, coordinates, currentPlayerSign);
                }
            } while (!isPlotted);

            if (!isNoneWon) break; //Выход из цикла при полном заполнении поля

            //clearField();
            drawPlayingField(fieldValues);

            isWin = checkWin(fieldValues);
            if (!isWin) {
                currentPlayer = switchPlayer(currentPlayer);
                currentPlayerSign = switchPlayerSign(currentPlayerSign);
            }
        } while (!isWin);

        if (isWin) {
            System.out.printf("Congrats Mr. %s!!! You are winner.\n", currentPlayer);
        } else {
            System.out.println("None of the players won.");
        }
    }

    static String switchPlayer(String currentUser) {
        return currentUser.equals("Human") ? "Computer" : "Human";
    }

    static char switchPlayerSign(char currentPlayerSign) {
        return currentPlayerSign == 'X' ? 'O' : 'X';
    }

    static void clearField() {
        for (int i = 0; i < 50; i++) {
            System.out.println("\b");
        }
    }

    /**
     * @param fieldValues Игровое поле
     * @param coordinates Координаты
     * @param playerSign Знак игрока
     * @return if value added true otherwise false
     */
    static boolean putValueOnField(char[][] fieldValues, int[] coordinates, char playerSign) {
        if (fieldValues[coordinates[0]][coordinates[1]] == DOT_EMPTY) {
            fieldValues[coordinates[0]][coordinates[1]] = playerSign;
            System.out.printf("Value plotted on coordinates [x: %s, y: %s].\n", coordinates[0] + 1, coordinates[1] + 1);
            return true;
        }
        System.out.println("Value already plotted. Please choose other coordinates.");
        return false;
    }

    //Проверка на наличие пустых клеток
    static boolean checkPlotted(char[][] fieldValues) {
        for (int i = 0; i < SIZE; i++) {
            for (char value: fieldValues[i]) {
                if (value == DOT_EMPTY) {
                    return true;
                }
            }
        }
        return false;
    }

    //Выбор метода хода игрока
    static int[] move(String currentPlayer) {
        if (currentPlayer.equals("Human")) {
            return movePlayer();
        }
        return moveComputer();
    }

    /**
     * @return array of coordinates where first item is X, secondary is Y
     */
    //Ход человека
    //Сделал зависимым от заданной размерности
    static int[] movePlayer() {
        /*+++TODO Сделать проверку на ввод недопустимых координат по [X, Y],
              вывести ошибку и дать возможность выбрать еще раз*/
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.printf("Input X coordinate from 1 to %d: ", SIZE);
            x = scanner.nextInt();
            checkInput(x);
        } while (x <= 0 || x > SIZE);
        do {
            System.out.printf("Input Y coordinate from 1 to %d: ", SIZE);
            y = scanner.nextInt();
            checkInput(y);
        } while (y <= 0 || y > SIZE);
        return new int[]{x - 1, y - 1};
    }

    //Проверка правильности ввода данных
    static void checkInput(int n) {
        if (n <= 0 || n > SIZE) {
            System.out.println("You entered an invalid number");
        }
    }

    /**
     * @return array of coordinates where first item is X, secondary is Y
     */
    //Ход игрока
    //Сделал зависимым от заданной размерности
    static int[] moveComputer() {
        Random random = new Random();
        int x = random.nextInt(SIZE);
        int y = random.nextInt(SIZE);
        return new int[]{x, y};
    }

    //Проверка на выигрыш
    //Сделал зависимым от заданной размерности
    static boolean checkWin(char[][] fieldValues) {
        // Horizontal
        for (int i = 0; i < SIZE; i++) {
            if (fieldValues[i][0] != DOT_EMPTY) {
                for (int j = 0; j < (SIZE - 1); j++) {
                    if (fieldValues[i][j] != fieldValues[i][j + 1]) {
                        break;
                    } else if (j == SIZE - 2) return true;
                }
            }
        }

        //+++TODO Сделать проверку победы в вертикальной плоскости
        //Vertical
        for (int i = 0; i < SIZE; i++) {
            if (fieldValues[0][i] != DOT_EMPTY) {
                for (int j = 0; j < (SIZE - 1); j++) {
                    if (fieldValues[j][i] != fieldValues[j + 1][i]) {
                        break;
                    } else if (j == SIZE - 2) return true;
                }
            }
        }

        //+++TODO Сделать проверку победы по диагоналям
        //Diagonal
        if (fieldValues[0][0] != DOT_EMPTY) {
            for (int i = 0; i < (SIZE - 1); i++) {
                if (fieldValues[i][i] != fieldValues[i + 1][i + 1]) {
                    break;
                } else if (i == SIZE - 2) return true;
            }
        }
        if (fieldValues[0][SIZE - 1] != DOT_EMPTY) {
            for (int i = 0; i < (SIZE - 1); i++) {
                if (fieldValues[i][(SIZE - 1) - i] != fieldValues[i + 1][(SIZE - 2) - i]) {
                    break;
                } else if (i == SIZE - 2) return true;
            }
        }
        return false;
    }

    //Подготовка/очистка игрового поля
    //Сделал зависимым от заданной размерности
    static char[][] getFieldValues() {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
        return field;
    }

    //Выбор чем ходит первый игрок
    static char[] rollPlayingSign() {
        char[] signs = new char[2];

        System.out.println("Choosing X or O ...");
        switch (new Random().nextInt(2)) {
            case 0: {
                signs[0] = 'O';
                signs[1] = 'X';
                System.out.println("Your sign: O");
                break;
            }
            case 1: {
                signs[0] = 'X';
                signs[1] = 'O';
                System.out.println("Your sign: X");
                break;
            }
            default: {
                System.out.println("Something went wrong. Unknown sign rather than [X, O]");
                System.exit(-1);
            }
        }
        return signs;
    }

    //Вывод игрового поля
    //Сделал зависимым от заданной размерности
    static void drawPlayingField(char[][] fieldValues) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.printf("%s%s", BORDER_LINE, fieldValues[i][j]);
            }
            System.out.println(BORDER_LINE);
        }
    }
}