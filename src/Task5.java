/*
Написать код, который бы подсчитывал количество
созданных котов (count) и на экран выдавалось правильно их количество.
 */
public class Task5 {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Cat.count++;
        Cat cat2 = new Cat();
        Cat.count++;
        System.out.println("Cats count is " + Cat.count);

    }
}
class Cat {
    static int count = 0;
}

