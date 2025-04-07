package org.clover;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnotationParser {
    //解析类注解
    public static void parseTypeAnnotations() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("org.clover.CloverCourse");
        //获取的是class的注解而不是class内部成员变量或者方法的注解
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            CourseInfoAnnotation courseInfoAnnotation = (CourseInfoAnnotation) annotation;
            System.out.println(courseInfoAnnotation.name());
            System.out.println(courseInfoAnnotation.courseTag());
        }
    }

    //解析成员注解
    public static void parseFieldAnnotations() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("org.clover.CloverCourse");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            boolean flag = field.isAnnotationPresent(PersonInfoAnnotation.class);
            if (flag) {
                PersonInfoAnnotation personInfoAnnotation = field.getAnnotation(PersonInfoAnnotation.class);
                System.out.println(personInfoAnnotation.name());
                System.out.println(personInfoAnnotation.age());
                System.out.println(personInfoAnnotation.gender());
                for(String language : personInfoAnnotation.languages()) {
                    System.out.println(language);
                }
            }
        }
    }

    //解析方法的注解
    public static void parseMethodAnnotations() throws ClassNotFoundException {
        Class<?> clazz = Class.forName("org.clover.CloverCourse");
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            boolean flag = method.isAnnotationPresent(CourseInfoAnnotation.class);
            if (flag) {
                CourseInfoAnnotation courseInfoAnnotation = method.getAnnotation(CourseInfoAnnotation.class);
                System.out.println(courseInfoAnnotation.name());
                System.out.println(courseInfoAnnotation.courseTag());
            }
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        parseTypeAnnotations();
        parseFieldAnnotations();
        parseMethodAnnotations();
    }
}
