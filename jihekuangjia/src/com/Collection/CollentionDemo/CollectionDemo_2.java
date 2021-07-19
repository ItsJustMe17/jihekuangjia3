package com.Collection.CollentionDemo;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo_2 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<String>();
        //布尔值boolean add(E o)  添加元素
        c.add("hello");
        c.add("world");
        c.add("java");

        //布尔值boolean remove(Object o) 从集合中移除指定的元素
//        c.remove("world");

        //void clear() 清空集合中的元素
//        c.clear();

        //布尔值boolean contains(Object o) 判断集合中是否存在指定的元素
//        System.out.println(c.contains("java"));//输出true
//        System.out.println(c.contains("javaee")); //输出false

        //布尔值boolean isEmpty()判断集合是否为空
//        System.out.println(c.isEmpty());//输出false

        System.out.println(c);
    }
}
