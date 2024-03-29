package com.microsoft.java.collection.iteration;

import static com.microsoft.java.collection.iteration.Person.getPeopleIterable;

public class IterableTasks {

    // Task 1: Using the 'getPeopleIterable()' iterable, print the first names of the first 2 males to the console
    public void task1() {
        Iterable<Person> people = getPeopleIterable();

        System.out.println("end of task 1-----------------------------------------------\n");
    }

    // Task 2: Using the 'getPeopleIterable()' iterable, sort all the females from youngest to oldest,
    // and print their first name and age to the console
    public void task2() {
        Iterable<Person> people = getPeopleIterable();

        System.out.println("end of task 2-----------------------------------------------\n");
    }

    // Task 3: Using the 'getPeopleIterable()' iterable, print out the age and first name of the youngest person
    public void task3() {
        Iterable<Person> people = getPeopleIterable();

        System.out.println("end of task 3-----------------------------------------------\n");
    }



    /******************************************************************************************************************
     *
     * Additional tasks
     * Only complete these if time is available, and for each one you complete, do the equivalent Stream task
     *
     ******************************************************************************************************************/

    // Extra task 1: Using the 'getPeopleIterable()' iterable, sum up the age of all people,
    // printing the result to the console
    public void extraTask1() {
        Iterable<Person> people = getPeopleIterable();

        System.out.println("end of task3-----------------------------------------------\n");
    }

    // Extra task 2: Using the 'getPeopleIterable()' iterable, create a List containing all children under the age of 10 (inclusive),
    // sorted by age (youngest first) and sex (female first), and print this list to the console
    public void extraTask2() {
        Iterable<Person> people = getPeopleIterable();

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
