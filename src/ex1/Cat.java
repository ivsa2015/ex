package ex1;

/**
 * Created by Dendi on 3/24/2017.
 */
public class Cat {
    // поля - хар-ки - свойства - состояние
    int age;
    String name;
    boolean isMale;
    double weight;
    Tail tail; //композиция
    Talisman talisman; //агрегация

        void voice(){
        System.out.println("miau");

    }
    void sleep(){
        System.out.println("hrrr");

    }


    public void about() {
        String s = "Cat{" +
                "age=" + age +
                ", name=" + name +
                ", isMale=" + isMale +
                ", weight=" + weight +
                ", tail=" + tail +
                ", talisman=" + talisman +
                '}';
        System.out.println(s);
    }
        Cat(){
        System.out.println("pustoi k-k");
    }


    public Cat(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }
}

