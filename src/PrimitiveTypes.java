/**
 * Created by Hyunjung on 2017. 10. 17..
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
        PrimitiveTypes types = new PrimitiveTypes();
        types.checkChar();
    }

    public void checkByte() {
        byte byteMin = -128;
        byte byteMax = 127;
        System.out.println("byteMin="+byteMin);
        System.out.println("byteMax="+byteMax);

        byteMin = (byte)(byteMin-1);
        byteMax = (byte)(byteMax+1);
        System.out.println("byteMin-1="+byteMin);
        System.out.println("byteMax+1="+byteMax);
    }

    public void checkOtherTypes() {
        short shortMax = 32767;
        int intMax = 2147483647;
        long longMax = 9223372036854775807L;

        shortMax = (short)(shortMax+1);
        System.out.println("shortMax+1="+shortMax);

        intMax = (int)(intMax+1);
        System.out.println("intMax+1="+intMax);

        longMax = (long)(longMax+1);
        System.out.println("longMax+1="+longMax);
    }

    public void checkChar() {
        char charMin = '\u0000';
        char charMax = '\uffff';
        System.out.println("charMin=["+charMin+"]");
        System.out.println("charMax=["+charMax+"]");

        int intValue = 'a';
        System.out.println("intValue=["+intValue+"]");
    }

    public void checkBoolean() {
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);
    }

    int intDefault1;
    public void defaultValues() {
        int intDefault2 = 0;
        System.out.println(intDefault1);
        System.out.println(intDefault2);
    }
}


