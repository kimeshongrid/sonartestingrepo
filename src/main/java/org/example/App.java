package org.example;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.info.GraphLayout;
import org.openjdk.jol.vm.VM;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
        int x = 10;
        int y = 20;

        // Long method
        longMethod(x, y);

        // Cyclomatic complexity
        if (x > y) {
            System.out.println("x is greater than y");
        } else if (x == y) {
            System.out.println("x is equal to y");
        } else {
            System.out.println("x is less than y");

        }

        // Duplicated code
        String str1 = "Hello";
        String str2 = "World";
        System.out.println(str1 + " " + str2);
        System.out.println(str1 + " " + str2);
    }
    // Long method
    public static void longMethod(int a, int b) {
        // Do a lot of things here
        for (int i = 0; i < 1000; i++) {
            // ...
        }
    }
}
