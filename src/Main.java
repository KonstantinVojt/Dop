import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Какой длины вы хотите игру");
        int length = scanner.nextInt();

        System.out.println("Какой ширины вы хотите игру");
        int width = scanner.nextInt();

        FileGenerator fileGenerator = new FileGenerator(length, width);
        int[][] field = fileGenerator.generate();

//        FielPrinter fieldViewer = new FielPrinter(10);
//        fieldViewer.printField(field);


        Game game = new Game(field, length, width);
        System.out.println("Готово");
        System.out.println("Можите играть");
        game.start();

    }
}