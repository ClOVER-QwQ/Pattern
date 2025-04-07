package org.clover;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodController {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz = Class.forName("org.clover.ReflectTarget");
        System.out.println("获取所有的方法");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("获取所有的公有的方法");
        methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println("获取单个");
        Method method = clazz.getMethod("show1", int.class);
        System.out.println(method);
        System.out.println("调用某个对象的该方法");
        ReflectTarget reflectTarget = (ReflectTarget) clazz.getDeclaredConstructor().newInstance();
        method.invoke(reflectTarget,1);
        System.out.println("调用带返回值的");
        method = clazz.getDeclaredMethod("show4", int.class);
        System.out.println(method);
        method.setAccessible(true);
        int index = (int) method.invoke(reflectTarget,4);
        System.out.println(index);
    }
}
