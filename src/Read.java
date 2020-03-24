//projek na Metody numeryczne
//Michał Zmarły
import java.util.Scanner;
import java.util.StringTokenizer;

public class Read {
    public static void Read_File(Point2D[] tab, Scanner odczyt) {

        int i=0;
        StringTokenizer token;
        new StringTokenizer(odczyt.nextLine());
        while (odczyt.hasNextLine()) {
            token = new StringTokenizer(odczyt.nextLine(), ",");

            while (token.hasMoreElements()) {
                tab[i].x = Double.parseDouble(token.nextToken());
                tab[i].y = Double.parseDouble(token.nextToken());
                i++;
            }
        }
        odczyt.close();
    }
    public static int Read_X(Scanner odczyt)
    {
        StringTokenizer token;
        token = new StringTokenizer(odczyt.nextLine());
        int x= (int) Double.parseDouble(token.nextToken());
        return x;
    }
}
