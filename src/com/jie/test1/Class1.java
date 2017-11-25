package com.jie.test1;

import java.util.ArrayList;
import java.util.List;

public class Class1 {
    private String name;
    private String age;
//
//    public Class1(String name) {
//        this.name = name;
//    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        Class1 class1 = new Class1("fengjie");
//        Class1 class2 = new Class1("fengjie");
        Class1 class1 = new Class1();
        class1.setName("fengjie");
        class1.setAge("22");
        List<Class1> list1 = new ArrayList<>();
        list1.add(class1);
        Class1 class2 = new Class1();
        class2.setName("fengjie");
        class2.setAge("22");
        List<Class1> list2 = new ArrayList<>();
        list2.add(class2);
        System.out.println(list1.get(0).getName() == list2.get(0).getName() && list1.get(0).getAge() == list2.get(0).getAge());
    }
}
