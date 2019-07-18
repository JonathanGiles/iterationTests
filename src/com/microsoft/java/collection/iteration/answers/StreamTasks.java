package com.microsoft.java.collection.iteration.answers;

import com.microsoft.java.collection.iteration.Person;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.microsoft.java.collection.iteration.Person.Sex.FEMALE;
import static com.microsoft.java.collection.iteration.Person.Sex.MALE;
import static com.microsoft.java.collection.iteration.Person.getPeopleStream;

public class StreamTasks {

    // Task 1: Using the 'getPeople()' Stream, print the first names of the first 2 males to the console
    public void task1() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        people.filter(person -> person.getSex() == MALE)
              .limit(2)
              .forEach(person -> System.out.println(person.getFirstName()));

        System.out.println("end of task 1-----------------------------------------------\n");
    }

    // Task 2: Using the 'getPeople()' Stream, sort all the females from youngest to oldest,
    // and print their first name and age to the console
    public void task2() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        people.filter(person -> person.getSex() == FEMALE)
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(person -> System.out.println(person.getFirstName() + " - " + person.getAge()));

        System.out.println("end of task 2-----------------------------------------------\n");
    }

    // Task 3: Using the 'getPeopleStream()' stream, print out the age and first name of the youngest person
    public void task3() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        people.sorted(Comparator.comparing(Person::getAge))
              .findFirst()
              .ifPresent(youngestPerson -> System.out.println("Youngest person: " + youngestPerson.getFirstName() + " - " + youngestPerson.getAge()));

        System.out.println("end of task 3-----------------------------------------------\n");
    }


    /******************************************************************************************************************
     *
     * Additional tasks
     * Only complete these if time is available, and for each one you complete, do the equivalent Iterable task
     *
     ******************************************************************************************************************/

    // Extra task 1: Using the 'getPeopleStream()' stream, sum up the age of all people,
    // printing the result to the console
    public void extraTask1() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        int totalAge = people.mapToInt(Person::getAge).sum();
        System.out.println("Age: " + totalAge);

        System.out.println("end of task3-----------------------------------------------\n");
    }

    // Extra task 2: Using the 'getPeopleStream()' stream, create a List containing all children under the age of 10 (inclusive),
    // sorted by age (youngest first) and sex (female first), and print this list to the console
    public void extraTask2() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        List<Person> children = people
                                        .filter(person -> person.getAge() <= 10)
                                        .sorted(Comparator.comparing(Person::getSex))
                                        .sorted(Comparator.comparingInt(Person::getAge))
                                        .collect(Collectors.toList());
        System.out.println(children);

        System.out.println("end of task4-----------------------------------------------\n");
    }

    public static void main(String[] args) {
        StreamTasks client = new StreamTasks();
        client.task1();
        client.task2();
        client.task3();
        client.extraTask1();
        client.extraTask2();
    }

}
