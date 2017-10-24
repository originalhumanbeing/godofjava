/**
 * Created by Hyunjung on 2017. 10. 24..
 */
public class ReferenceStatic {
    static String name = "min";
    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }

    public static void staticMethod() {
        System.out.println("This is a StaticMethod");
    }

    public static void staticMethodCallVariable() {
        System.out.println(name);
    }
}
