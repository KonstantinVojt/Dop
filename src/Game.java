import java.util.Scanner;

public class Game {

    private int[][] field;
    private int length;
    private int width;


    public Game(int[][] field) {
        this.field = field;
    }

    public Game(int[][] field, int length, int width) {
        this.field = field;
        this.length = length;
        this.width = width;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int one = 0;
        int points_1 = 0;
        int two = 0;
        int points_2 = 0;

        for (int i = 0; i < 10; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            if (first < length && second < width && first >= 0 && second >= 0) {
                int shoot = field[first][second];

                if (shoot == 0) {
                    System.out.println("Вы не попали");
                }
                if (shoot == 1){
                    System.out.println("Вы попали");
                    one += 1;
                    points_1 += 5;

                }
                if (shoot == 2){
                    System.out.println("Вы попали");
                    two += 1;
                    points_2 += 10;
                }
            }else {
                System.out.println("Не туда");
            }

        }
        int sum = points_1 + points_2;
        FielPrinter fielPrinter = new FielPrinter(field.length);
        fielPrinter.printField(field);
        System.out.println("Вы уничтожили кораблей: " + one + " с одной палубой и " + two + " с двумя палубами");
        System.out.println("Вы получли: " + sum + " очков");

    }
}
