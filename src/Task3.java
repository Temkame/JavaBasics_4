/*
Реализовать метод setCatsCount так, чтобы с его
помощью можно было устанавливать значение переменной
catsCount равное переданному параметру.
 */
public class Task3 {
    public static void main(String[] args) {

    }
}

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat count= new Cat();
        count.catsCount=catsCount;
    }
}


