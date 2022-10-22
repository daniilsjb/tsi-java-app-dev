package lv.tsi.exercise_1_2_3_4;

import java.util.List;

class ListProcessingWithStreams {

    public static void main(String[] args) {
        var list = List.of("a1", "c3", "a2", "a3","b3", "b2", "c1", "c2","b1");

        System.out.println("[Exercise 1]");
        list.stream()
            .findFirst()
            .ifPresent(System.out::println);

        System.out.println();

        System.out.println("[Exercise 2]");
        list.stream()
            .map(String::toUpperCase)
            .forEach(System.out::println);

        System.out.println();

        System.out.println("[Exercise 3]");
        list.stream()
            .filter(it -> it.startsWith("b"))
            .forEach(System.out::println);

        System.out.println();

        System.out.println("[Exercise 4]");
        list.stream()
            .filter(it -> it.startsWith("c"))
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);
    }
}
