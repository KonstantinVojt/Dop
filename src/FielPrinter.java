import java.util.Arrays;

public class FielPrinter {

    private int length;


    public FielPrinter(int length) {
        this.length = length;
    }

    public void printField(int[][] field){
        for (int i = 0; i < length; i++){
            System.out.println(Arrays.toString(field[i]));
        }
    }

}
