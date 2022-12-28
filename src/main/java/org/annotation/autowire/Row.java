package org.annotation.autowire;

import java.util.Arrays;

public class Row {
    private String[] data;

    public Row() {}

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Row{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
