package org.clover;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorController{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("org.clover.ReflectTarget");
        Constructor[] conArray;
        Constructor con;
        System.out.println("获取所有的构造函数");
        conArray = clazz.getDeclaredConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }
        System.out.println("获取所有的公共构造函数");
        conArray = clazz.getConstructors();
        for (Constructor c : conArray) {
            System.out.println(c);
        }
        System.out.println("获取公有的有参构造,有两个参数的");
        con = clazz.getConstructor(String.class,int.class);
        System.out.println(con);
        System.out.println("获取所有私有的");
        con = clazz.getDeclaredConstructor(int.class);
        System.out.println(con);
        System.out.println("调用私有方法创建实例");
        con.setAccessible(true);
        ReflectTarget reflectTarget = (ReflectTarget) con.newInstance(1);
        System.out.println(reflectTarget);
    }
}
