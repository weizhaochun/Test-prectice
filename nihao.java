package com.test;
import java.lang.reflect.Method;
import java.util.ArrayList;
public class nihao {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Method method = list.getClass().getMethod("add", Object.class);
        method.invoke(list, "Java反射机制实例。");
        System.out.println(list.getClass().getName());
        System.out.println(list.get(0));
    }
}