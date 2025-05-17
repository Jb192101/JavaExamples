#include "JNI_test_nativeLib_Lib.h"

JNIEXPORT jint JNICALL Java_JNI_1test_nativeLib_Lib_sum(JNIEnv * env, jobject thisObject, jint a, jint b) {
    return a + b;
}