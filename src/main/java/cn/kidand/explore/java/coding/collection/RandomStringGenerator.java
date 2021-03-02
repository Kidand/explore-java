package cn.kidand.explore.java.coding.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * ██╗  ██╗██╗██████╗  █████╗ ███╗   ██╗██████╗
 * ██║ ██╔╝██║██╔══██╗██╔══██╗████╗  ██║██╔══██╗
 * █████╔╝ ██║██║  ██║███████║██╔██╗ ██║██║  ██║
 * ██╔═██╗ ██║██║  ██║██╔══██║██║╚██╗██║██║  ██║
 * ██║  ██╗██║██████╔╝██║  ██║██║ ╚████║██████╔╝
 * ╚═╝  ╚═╝╚═╝╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝
 *
 * @description: RandomStringGenerator 随机字符串序列生成器
 * @author: Kidand
 * @date: 2021/3/2 14:28
 * Copyright © 2019 by Kidand.
 */
public class RandomStringGenerator<T> implements Iterable<T> {

    private final List<T> list;

    public RandomStringGenerator(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public T next() {
                return list.get((int) (list.size() * Math.random()));
            }
        };
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("List", "Tree", "Array");
        RandomStringGenerator<String> gen = new RandomStringGenerator<>(list);

        for (String s : gen) {
            System.out.println(s);
        }

//        Iterator<String> it = gen.iterator();
//        for (int i = 0; i < 100; i++) {
//            System.out.println(it.next());
//        }
        ArrayList<String> arr = new ArrayList<>();
        arr.add("123");
        String[] stringArr = arr.toArray(new String[0]);
        // Method Reference :: (Java 11)
        // Lazy evaluation 惰性求值
        String[] stringArr1 = arr.toArray(String[]::new);
    }
}
