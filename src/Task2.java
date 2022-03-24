/*
Реализовать метод addNewCat, чтобы при его вызове
(т.е. добавлении нового кота), количество котов увеличивалось на 1.
За количество котов отвечает переменная catsCount.
 */
public class Task2 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat.addNewCat();
    }
}
class Cat {
    private static int catsCount = 0;
    public static void addNewCat()
    {
        Cat.catsCount += 1;
    }
}