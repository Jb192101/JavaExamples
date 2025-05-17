package JNI_test;

import JNI_test.nativeLib.Lib;

public class testJNI {
    public static void main(String[] args) {
        System.out.println("Старт теста");
        Lib lib = new Lib();
        int c = lib.sum(1, 2);

        System.out.println("Сумма равна : " + c);
    }
}
