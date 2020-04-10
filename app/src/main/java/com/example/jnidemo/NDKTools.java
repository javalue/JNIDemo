package com.example.jnidemo;

/**
 * @author tong.xu
 * @date 2020/4/10.
 * description：
 */
public class NDKTools {

  static {
    System.loadLibrary("ndkdemotest-jni");
  }

  public static native String getStringFromNDK();
}
