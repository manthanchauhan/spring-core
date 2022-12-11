package org.spring.core;

public class Course {
    private String name;

    Course(String name){
        this.name = name;
    }

    Course(){}

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Course course = (Course) o;
//        return Objects.equals(getName(), course.getName());
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getName());
//    }
}
