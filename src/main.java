//projek na Metody numeryczne
//Michał Zmarły
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) throws IOException {
        try {
        long lineCount = Files.lines(Paths.get("points.txt")).count();
        Point2D[] tab = new Point2D[(int) lineCount];

        for (int i = 0; i < tab.length-1; i++) {
            tab[i] = new Point2D();
        }
        File file = new File("points.txt");
        Scanner scan = new Scanner(file);
        Read.Read_File(tab,scan);
        Scanner scan1 = new Scanner(file);
        Interpolation.InterpolationLagrange(tab,tab.length-1,Read.Read_X(scan1));
}
       catch (FileNotFoundException e)
       {
           System.err.println("File does not exist");
       }
    }
}
