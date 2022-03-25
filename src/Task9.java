import java.util.Scanner;

/*
Сравнить имена

Ввести с клавиатуры два имени, и если имена одинаковые, вывести сообщение «Имена идентичны».
Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
 */
public class Task9 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Имена идентичны");
        } else if (a.length() == b.length()) {
            System.out.println("Длины имен равны");
        }
    }
}
