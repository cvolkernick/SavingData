package com.example.admin.savingdata.model;

/**
 * Created by Admin on 3/28/2018.
 */

public class Person {
    String firstName;
    String lastName;
    String gender;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String gender) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }
}
