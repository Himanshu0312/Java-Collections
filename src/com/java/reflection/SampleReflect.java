package com.java.reflection;

import java.lang.reflect.Method;

public class SampleReflect {

	public static void main(String args[]) throws Exception {
		Class<CubeSample> c = CubeSample.class;
		Object obj = c.newInstance();
		Method m = c.getDeclaredMethod("cube", new Class[] { int.class });
		m.setAccessible(true);
		m.invoke(obj, 4);
	}

}
