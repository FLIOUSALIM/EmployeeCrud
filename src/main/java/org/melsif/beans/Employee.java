package org.melsif.beans;

/**
 * Created by fliou on 15/09/17.
 */
public class Employee {

    private String matriculeRegistration;
    private String lastName;
    private String firstName;
    private String address;

    public Employee() {}

    public Employee(String matriculeRegistration, String lastName, String firstName, String address) {
        this.matriculeRegistration = matriculeRegistration;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
    }

    public String getMatriculeRegistration() {
        return matriculeRegistration;
    }

    public void setMatriculeRegistration(String matriculeRegistration) {
        this.matriculeRegistration = matriculeRegistration;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
