import java.util.Random;

public class FileGenerator {

    private int length;
    private int width;


    public FileGenerator(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int[][] generate(){
        Info info = new Info();
        info.Inform();
        Random random = new Random();
        int[][] field = new int[length][width];

        for (int i = 0; i < 25; i ++) {
            int a = random.nextInt(0, length);
            int b = random.nextInt(0, width);

            if (field[a][b] == 1){
                i--;
            }
            else {
                field[a][b] = 1;
            }
            if (field[b][a] == 2){
                i--;
            }
            else {
                field[b][a] = 2;
            }
        }
        return field;
    }
}
