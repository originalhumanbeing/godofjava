package c.inheritance;

/**
 * Created by Hyunjung on 2018. 1. 14..
 */
public class Animal {
    String name, kind, sex;
    int legCount;
    int iq;
    boolean hasWing;

    public Animal() {
        System.out.println("Animal");
    }

    public void move(int distance, String direction) {
        System.out.println("Animal moved "+distance+"steps to "+direction);
    }

    public void eat(String food) {
        System.out.println("Animal eat "+food);
    }

    public void play() {
        System.out.println("Play time!");
    }
}
