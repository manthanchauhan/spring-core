package org.spring.core;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Student() {
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getName(), student.getName()) && Objects.equals(getAddress(), student.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress());
    }
}
