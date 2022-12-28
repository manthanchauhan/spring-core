package org.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Spreadsheet {
    private String name;

    private Row data;

    public Spreadsheet() {}

    @Autowired
    public Spreadsheet(String name, Row data) {
        this.name = name;
        this.data = data;
    }

    @Override
    public String toString() {
        return "Spreadsheet{" +
                "name='" + name + '\'' +
                ", data=" + data +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setData(Row data) {
        this.data = data;
    }
}
