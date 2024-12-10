package io.github.highway;

import java.util.ArrayList;
import java.util.List;

public class SimpleArray {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(50);

        for (Integer integer : list) {
            System.out.println(integer);
        }
//        for(int i = 0; i < list.size(); i++){
//            System.out.println(list.get(i));
//        }

    }
}
