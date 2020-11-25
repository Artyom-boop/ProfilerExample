import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        new Scanner(System.in).nextLine();
        new Sorter().readAndSort();
    }

    void readAndSort() {
        try {
            for (int i = 0; i < 1000; i++) {
                Path file = Paths.get("cities.csv");
                List<String> lines = Files.readAllLines(file);
                Collections.sort(lines);
                System.out.println(lines);
            }
        } catch (IOException e) {
            System.out.println("¯\\\\_(ツ)_/¯");
        }
    }
}
