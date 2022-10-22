package lv.tsi.exercise_5;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.*;

class PersonEvaluator {

    private final List<Person> persons;

    public PersonEvaluator(List<Person> persons) {
        this.persons = persons;
    }

    public void findAndPrint(Predicate<? super Person> predicate) {
        persons.stream()
            .filter(predicate)
            .map(Person::getName)
            .forEach(System.out::println);
    }

    public <K> void groupAndPrint(Function<? super Person, ? extends K> classifier) {
        persons.stream()
            .collect(groupingBy(classifier, mapping(Person::getName, joining(", ", "[", "]"))))
            .forEach((age, names) -> System.out.println("Age " + age + ": " + names));
    }

    public double getAverageAge() {
        return persons.stream()
            .mapToDouble(Person::getAge)
            .average()
            .orElse(0.0);
    }
}
