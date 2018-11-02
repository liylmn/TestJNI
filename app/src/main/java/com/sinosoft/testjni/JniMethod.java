package com.sinosoft.testjni;

public class JniMethod {

static {

System.loadLibrary("JniMethod");

}

public static native String getNativeString(String s);

}