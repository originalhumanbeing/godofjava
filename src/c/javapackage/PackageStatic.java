package c.javapackage;
import static c.javapackage.sub.SubStatic.*;

/**
 * Created by Hyunjung on 2017. 10. 30..
 */

public class PackageStatic {
    public static void main(String[] args) {
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}
