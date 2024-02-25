package com.rojatech.ch02.collections.list;

import com.rojatech.ch09.others.ArraysUtil;

import java.util.*;
import java.util.stream.Collectors;

public class SortedListDemo2 {

    public static void main(String[] args) {
        List<String> strList = Arrays.asList("segment", "sub_category", "category", "segment", "super_category");
        System.out.println(strList.stream().sorted().collect(Collectors.toList()));

        //map of elements in required custom sorting order
        Map<String, Integer> orderMap = new HashMap<>();
        orderMap.put("super_category", 1);
        orderMap.put("category", 2);
        orderMap.put("sub_category", 3);
        orderMap.put("segment", 4);

        System.out.println(orderMap);

        strList.sort(Comparator.comparingInt(orderMap::get));
        System.out.println(strList);

    }
}
