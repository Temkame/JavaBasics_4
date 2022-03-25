import java.io.*;
import java.util.Scanner;

/*
Минимум двух чисел

Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
 */
public class Task6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

//        InputStream inputStream = System.in;
//        Reader reader = new InputStreamReader(inputStream);
//        BufferedReader bufferedReader = new BufferedReader(reader);
//
//        String a = bufferedReader.readLine();
//        String b = bufferedReader.readLine();

        if (a < b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
