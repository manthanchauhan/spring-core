package org.spring.core;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String address;
    private Integer[] marks;
    private Course[] courses;

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

    public Integer[] getMarks() {
        return this.marks;
    }

    public Course[] getCourses(){
        return this.courses;
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

    public void setMarks(Integer[] marks) {
        this.marks = marks;
    }

    public void setCourses(Course[] courses){
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", marks='" + Arrays.toString(marks) + '\'' +
                ", courses='" + Arrays.toString(this.courses) + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getName(), student.getName()) && Objects.equals(getAddress(), student.getAddress()) && Arrays.equals(this.getMarks(), student.getMarks()) && Arrays.equals(this.getCourses(), student.getCourses());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), Arrays.hashCode(this.getMarks()), Arrays.hashCode(this.getCourses()));
    }
}
