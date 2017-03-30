package ex1;

/**
 * Created by Dendi on 3/28/2017.
 */
public class Main {
    public static void main(String[] args) {
        Cat cat1;
        cat1 = new Cat();
        cat1.name = "Murka";
        cat1.age = 3;
        Cat cat2;
        cat2 = new Cat();

        cat1.about();
        cat2.name = "Polak";
        cat2.age = 3;
        cat2.isMale = true;
        cat2.about();

        Cat cat3 = new Cat(3, "Pirat", true);
        Cat cat4 = new Cat(1, "Piкa", false);
        Cat cat5 = new Cat(5, "Lapot", true);
        cat3.about();
        cat3.about();
        cat3=cat4;
        cat3.about();
    }




}
