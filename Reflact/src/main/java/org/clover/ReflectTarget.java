package org.clover;

public class ReflectTarget {
    //--------构造函数--------
    //默认的(包可见)有参构造函数
    ReflectTarget(String str){
        System.out.println("default "+str);
    }
    ReflectTarget(){
        System.out.println("default constructor");
    }
    //公有的
    public ReflectTarget(Object obj){
    }
    public ReflectTarget(String str,int i){}
    //受保护的
    private ReflectTarget(int j){
        System.out.println("序号 " + j);
    }
    public static void main(String[] args) throws ClassNotFoundException {
        //第一种方式获取(类的实例化)
        ReflectTarget reflectTarget = new ReflectTarget();
        Class reflectTargetClass1 = reflectTarget.getClass();
        System.out.println("1st "+reflectTargetClass1.getName());
        //第二种方式获取
        Class reflectTargetClass2 = ReflectTarget.class;
        System.out.println("2nd "+reflectTargetClass2.getName());
        //第三种方式获取
        Class reflectTargetClass3 = Class.forName("org.clover.ReflectTarget");
        System.out.println("3rd "+reflectTargetClass3.getName());
        //判断是否是同一个
        if (reflectTargetClass1!=reflectTargetClass2||reflectTargetClass2!=reflectTargetClass3||reflectTargetClass1!=reflectTargetClass3) {
            System.out.println("false");
        }else {
            System.out.println("true");
        }
    }
}
