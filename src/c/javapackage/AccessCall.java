package c.javapackage;

import c.javapackage.sub.AccessModifier;

/**
 * Created by Hyunjung on 2017. 10. 30..
 */
public class AccessCall {
    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.publicMethod();
        //accessModifier.protectedMethod();
        //accessModifier.packagePrivateMethod();
        //accessModifier.privateMethod();
    }
}
