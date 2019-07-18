package com.microsoft.java.collection.iteration;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.microsoft.java.collection.iteration.Person.Sex.FEMALE;
import static com.microsoft.java.collection.iteration.Person.Sex.MALE;

import static com.microsoft.java.collection.iteration.Person.getPeopleStream;

public class StreamTasks {

    // Task 1: Using the 'getPeople()' Stream, print all male person first names to the console
    public void task1() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        people.filter(person -> person.getSex() == MALE)
              .forEach(person -> System.out.println(person.getFirstName()));
        System.out.println("end of task1-----------------------------------------------\n");
    }

    // Task 2: Using the 'getPeople()' Stream, sort all the females from youngest to oldest,
    // and print their first name and age to the console
    public void task2() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        people.filter(person -> person.getSex() == FEMALE)
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(person -> System.out.println(person.getFirstName() + " - " + person.getAge()));

        System.out.println("end of task2-----------------------------------------------\n");
    }

    // Task 3: Using the 'getPeopleStream()' stream, sum up the age of all people,
    // printing the result to the console
    public void task3() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        int totalAge = people.mapToInt(Person::getAge).sum();
        System.out.println("Age: " + totalAge);
        System.out.println("end of task3-----------------------------------------------\n");
    }

    // Task 4: Using the 'getPeopleStream()' stream, print out the age and first name of the youngest person
    public void task4() {
        Stream<Person> people = getPeopleStream();

        // Jonathan Example:
        people.sorted(Comparator.comparing(Person::getAge))
              .findFirst()
              .ifPresent(youngestPerson -> System.out.println("Youngest person: " + youngestPerson.getFirstName() + " - " + youngestPerson.getAge()));
        System.out.println("end of task4-----------------------------------------------\n");
    }

    // Task 5: Using the 'getPeopleStream()' stream, create a List containing all children under the age of 10 (inclusive),
    // sorted by age (youngest first) and sex (female first), and print this list to the console
    public void task5() {
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
        client.task4();
        client.task5();
    }

}
