#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_algo_x_com_algorithm4j_MainActivity_stringFromJNI(
        JNIEnv* env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
