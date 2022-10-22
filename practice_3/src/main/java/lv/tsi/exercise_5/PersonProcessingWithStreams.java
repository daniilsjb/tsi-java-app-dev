package lv.tsi.exercise_5;

import java.util.List;

class PersonProcessingWithStreams {

    public static void main(String[] args) {
        var persons = List.of(
            new Person("Max", 28),
            new Person("Peter", 22),
            new Person("Anna", 28),
            new Person("Lilianna", 16),
            new Person("Pamela", 13),
            new Person("David", 22)
        );

        var evaluator = new PersonEvaluator(persons);

        System.out.println("a. Names starting with 'P':");
        evaluator.findAndPrint(person -> person.getName().startsWith("P"));

        System.out.println();

        System.out.println("b. Names of people older than 18:");
        evaluator.findAndPrint(person -> person.getAge() > 18);

        System.out.println();

        System.out.println("c. Names grouped by age:");
        evaluator.groupAndPrint(Person::getAge);

        System.out.println();

        System.out.println("d. Average age:");
        System.out.println(evaluator.getAverageAge());
    }
}
