package com.microsoft.java.collection.iteration;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static com.microsoft.java.collection.iteration.Person.Sex.FEMALE;
import static com.microsoft.java.collection.iteration.Person.Sex.MALE;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final Sex sex;

    public Person(final String firstName, final String lastName, final int age, final Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public enum Sex { MALE, FEMALE }

    @Override
    public String toString() {
        return "Person { " + getFirstName() + " " + getLastName() + " " + getAge() + " " + getSex() + "}";
    }

    private static List<Person> getPeople() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ian", "Jones", 65, MALE));
        people.add(new Person("Sophie", "Ellis", 22, FEMALE));
        people.add(new Person("Henry", "Simons", 5, MALE));
        people.add(new Person("Pippa", "Burke", 3, FEMALE));
        people.add(new Person("David", "Jacobs", 33, MALE));
        people.add(new Person("Rebecca", "Beattie", 54, FEMALE));
        people.add(new Person("Sarah", "Marshall", 1, FEMALE));
        people.add(new Person("Simon", "Hall", 41, MALE));
        return people;
    }

    public static Iterable<Person> getPeopleIterable() {
        return getPeople();
    }

    public static Stream<Person> getPeopleStream() {
        return getPeople().stream();
    }
}
