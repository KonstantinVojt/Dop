package NewTask;

//import java.util.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Earthquake {

    public static void earthquake() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int magnitude = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();

        System.out.println("Вводите числа:");

        while (magnitude != -97) {
            magnitude = scanner.nextInt();
            list.add(magnitude);

            if (magnitude > 3) {
                count++;
            }
        }
        if (count >= 5) {
            System.out.println("Возможное землетрясение!");
            for (int i = 0; i <= list.size() - 1; i++) {
                int element = list.get(i);
                if (element > 3) {
                    answer.add(element);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println("Землетрясения нет!");
        }
    }
}
