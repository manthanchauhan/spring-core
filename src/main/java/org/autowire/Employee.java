package org.autowire;

public class Employee {
    private Person person;

    private String role;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "person=" + person.toString() +
                ",role=" + role +
                '}';
    }

    public Employee(Person person2, String role) {
        this.person = person2;
        this.role = role;
    }

    public Employee(){}
}
