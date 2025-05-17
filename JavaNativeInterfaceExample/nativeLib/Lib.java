package JNI_test.nativeLib;

public class Lib {
    static {
        System.loadLibrary("testLib");
    }

    public native int sum(int a, int b);
}
