package org.clover;

import java.lang.reflect.Field;

public class FieldController {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = Class.forName("org.clover.ReflectTarget");
        System.out.println("获取所有字段");//获取不到父类任何字段
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("获取所有的公有的字段");//可以获取父类公有字段
        fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("获取特定的字段");
        Field field = clazz.getField("name");
        System.out.println(field);
        System.out.println("给指定对象的字段赋值");
        ReflectTarget reflectTarget = new ReflectTarget();
        field.set(reflectTarget,"tom");
        System.out.println(reflectTarget.name);
        System.out.println("获取单个私有字段");
        field = clazz.getDeclaredField("targetInfo");
        field.setAccessible(true);
        field.set(reflectTarget,"age=30");
        System.out.println(reflectTarget);
    }
}
