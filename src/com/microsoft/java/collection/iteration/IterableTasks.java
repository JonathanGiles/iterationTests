package com.microsoft.java.collection.iteration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.microsoft.java.collection.iteration.Person.Sex.*;
import static com.microsoft.java.collection.iteration.Person.getPeopleIterable;
import static com.microsoft.java.collection.iteration.Person.getPeopleStream;

public class IterableTasks {

    // Task 1: Using the 'getPeopleIterable()' iterable, print all male person first names to the console
    public void task1() {
        Iterable<Person> people = getPeopleIterable();

        // Jonathan Example:
        for (Person person : people) {
            if (person.getSex() == MALE) {
                System.out.println(person.getFirstName());
            }
        }
        System.out.println("end of task1-----------------------------------------------\n");
    }

    // Task 2: Using the 'getPeopleIterable()' iterable, sort all the females from youngest to oldest,
    // and print their first name and age to the console
    public void task2() {
        Iterable<Person> people = getPeopleIterable();

        // Jonathan Example:
        List<Person> peopleList = new ArrayList<>();
        for (Person person : people) {
            peopleList.add(person);
        }
        Collections.sort(peopleList, Comparator.comparing(Person::getAge));
        for (Person person : peopleList) {
            if (person.getSex() == FEMALE) {
                System.out.println(person.getFirstName() + " - " + person.getAge());
            }
        }
        System.out.println("end of task2-----------------------------------------------\n");
    }

    // Task 3: Using the 'getPeopleIterable()' iterable, sum up the age of all people,
    // printing the result to the console
    public void task3() {
        Iterable<Person> people = getPeopleIterable();

        // Jonathan Example:
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        System.out.println("Age: " + totalAge);
        System.out.println("end of task3-----------------------------------------------\n");
    }

    // Task 4: Using the 'getPeopleIterable()' iterable, print out the age and first name of the youngest person
    public void task4() {
        Iterable<Person> people = getPeopleIterable();

        // Jonathan Example:
        Person youngestPerson = null;
        for (Person person : people) {
            if (youngestPerson == null) {
                youngestPerson = person;
            } else {
                if (person.getAge() < youngestPerson.getAge()) {
                    youngestPerson = person;
                }
            }
        }
        System.out.println("Youngest person: " + youngestPerson.getFirstName() + " - " + youngestPerson.getAge());
        System.out.println("end of task4-----------------------------------------------\n");
    }

    // Task 5: Using the 'getPeopleIterable()' iterable, create a List containing all children under the age of 10 (inclusive),
    // sorted by age (youngest first) and sex (female first), and print this list to the console
    public void task5() {
        Iterable<Person> people = getPeopleIterable();

        // Jonathan Example:
        List<Person> children = new ArrayList<>();
        for (Person person : people) {
            if (person.getAge() <= 10) {
                children.add(person);
            }
        }
        Collections.sort(children, Comparator.comparing(Person::getSex));
        Collections.sort(children, Comparator.comparingInt(Person::getAge));

        System.out.println(children);

        System.out.println("end of task4-----------------------------------------------\n");
    }

    public static void main(String[] args) {
        IterableTasks client = new IterableTasks();
        client.task1();
        client.task2();
        client.task3();
        client.task4();
        client.task5();
    }

}
