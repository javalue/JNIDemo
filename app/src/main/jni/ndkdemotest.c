//
// Created by xutong on 2020/4/10.
//
#include "com_example_jnidemo_NDKTools.h"

JNIEXPORT jstring JNICALL Java_com_example_jnidemo_NDKTools_getStringFromNDK
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"Hellow World，NDK的第一行代码");
  }
