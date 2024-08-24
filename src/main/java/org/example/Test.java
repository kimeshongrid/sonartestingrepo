package org.example;

import com.google.i18n.phonenumbers.NumberParseException;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) throws NumberParseException {

        List<Integer> input = Arrays.asList(2,3,2,7,3,2,10,8);
        final Map<Integer, Long> collect = input.stream().collect(Collectors.groupingBy(integer -> integer, Collectors.counting()));
        input.forEach(integer -> {if(collect.get(integer)>1){
            System.out.println(integer);
        }
        });

    }


}