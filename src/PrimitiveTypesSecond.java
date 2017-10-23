/**
 * Created by Hyunjung on 2017. 10. 17..
 */
public class PrimitiveTypesSecond {
    int intDefault1;
    byte byteDefault;
    short shortDefault;
    long longDefault;
    float floatDefault;
    double doubleDefault;
    char charDefault;
    boolean booleanDefault;

    public static void main(String [] args) {
        PrimitiveTypesSecond second = new PrimitiveTypesSecond();
        second.defaultValues();
    }

    // 모든 기본값은 0, boolean = false;
    public void defaultValues() {
        System.out.println("byteDefault="+byteDefault);
        System.out.println("shortDefault="+shortDefault);
        System.out.println("intDefault1="+intDefault1);
        System.out.println("longDefault="+longDefault);
        System.out.println("floatDefault="+floatDefault);
        System.out.println("doubleDefault="+doubleDefault);
        System.out.println("charDefault="+charDefault);
        System.out.println("booleanDefault="+booleanDefault);
    }
}
