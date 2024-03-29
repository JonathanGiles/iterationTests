package com.microsoft.java.collection.iteration;

import java.util.stream.Stream;

import static com.microsoft.java.collection.iteration.Person.getPeopleStream;

public class StreamTasks {

    // Task 1: Using the 'getPeople()' Stream, print the first names of the first 2 males to the console
    public void task1() {
        Stream<Person> people = getPeopleStream();

        System.out.println("end of task 1-----------------------------------------------\n");
    }

    // Task 2: Using the 'getPeople()' Stream, sort all the females from youngest to oldest,
    // and print their first name and age to the console
    public void task2() {
        Stream<Person> people = getPeopleStream();

        System.out.println("end of task 2-----------------------------------------------\n");
    }

    // Task 3: Using the 'getPeopleStream()' stream, print out the age and first name of the youngest person
    public void task3() {
        Stream<Person> people = getPeopleStream();

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

        System.out.println("end of extra task 1-----------------------------------------------\n");
    }

    // Extra task 2: Using the 'getPeopleStream()' stream, create a List containing all children under the age of 10 (inclusive),
    // sorted by age (youngest first) and sex (female first), and print this list to the console
    public void extraTask2() {
        Stream<Person> people = getPeopleStream();

        System.out.println("end of extra task 2-----------------------------------------------\n");
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
