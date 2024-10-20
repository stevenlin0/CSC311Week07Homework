package org.example.javafxdb_sql_shellcode.models;

import javafx.beans.property.*;

// This person class stores information about a person, such as their ID, first name, last name, department, major, and course.
public class Person {

    // These variables automatically update the UI when their value changes.
    private final IntegerProperty id;
    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty dept;
    private final StringProperty major;
    private final StringProperty course;

    // This is the constructor. It sets up a new Person with the given id, first name, last name, department, major, and course.
    public Person(int id, String firstName, String lastName, String dept, String major, String course) {
        // This sets up the id, first name, last name, department, major, and course with the provided values.
        this.id = new SimpleIntegerProperty(id);
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);
        this.dept = new SimpleStringProperty(dept);
        this.major = new SimpleStringProperty(major);
        this.course = new SimpleStringProperty(course);
    }

    // These methods allow the program to access the id, first name, last name, and other details.
    public IntegerProperty idProperty() {
        return id;
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public StringProperty deptProperty() {
        return dept;
    }

    public StringProperty majorProperty() {
        return major;
    }

    public StringProperty courseProperty() {
        return course;
    }

    // These methods let you update the first name, last name, department, major, and course values.
    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public void setDept(String dept) {
        this.dept.set(dept);
    }

    public void setMajor(String major) {
        this.major.set(major);
    }

    public void setCourse(String course) {
        this.course.set(course);
    }
}