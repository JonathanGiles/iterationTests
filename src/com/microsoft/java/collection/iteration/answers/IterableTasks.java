package com.microsoft.java.collection.iteration.answers;

import com.microsoft.java.collection.iteration.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static com.microsoft.java.collection.iteration.Person.Sex.FEMALE;
import static com.microsoft.java.collection.iteration.Person.Sex.MALE;
import static com.microsoft.java.collection.iteration.Person.getPeopleIterable;

public class IterableTasks {

    // Task 1: Using the 'getPeopleIterable()' iterable, print the first names of the first 2 males to the console
    public void task1() {
        Iterable<Person> people = getPeopleIterable();

        // Jonathan Example:
        int maleCount = 0;
        for (Person person : people) {
            if (person.getSex() == MALE) {
                System.out.println(person.getFirstName());
                maleCount++;
            }
            if (maleCount == 2) {
                break;
            }
        }
        System.out.println("end of task 1-----------------------------------------------\n");
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
        System.out.println("end of task 2-----------------------------------------------\n");
    }

    // Task 3: Using the 'getPeopleIterable()' iterable, print out the age and first name of the youngest person
    public void task3() {
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
        System.out.println("end of task 3-----------------------------------------------\n");
    }



    /******************************************************************************************************************
     *
     * Additional tasks
     * Only complete these if time is available, and for each one you complete, do the equivalent Stream task
     *
     ******************************************************************************************************************/

    // Extra Task 1: Using the 'getPeopleIterable()' iterable, sum up the age of all people,
    // printing the result to the console
    public void extraTask1() {
        Iterable<Person> people = getPeopleIterable();

        // Jonathan Example:
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        System.out.println("Age: " + totalAge);
        System.out.println("end of task3-----------------------------------------------\n");
    }

    // Extra task 2: Using the 'getPeopleIterable()' iterable, create a List containing all children under the age of 10 (inclusive),
    // sorted by age (youngest first) and sex (female first), and print this list to the console
    public void extraTask2() {
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
        client.extraTask1();
        client.extraTask2();
    }

}
