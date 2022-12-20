package org.lifecycle.methods;

import java.util.Objects;

public class Samosa {
    private double price;

    private double taste;

    public double getPrice() {
        return price;
    }

    public double getTaste() {
        return taste;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTaste(double taste) {
        this.taste = taste;
    }

    public Samosa(double price, double taste) {
        this.price = price;
        this.taste = taste;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samosa samosa = (Samosa) o;
        return Double.compare(samosa.getPrice(), getPrice()) == 0 && Double.compare(samosa.getTaste(), getTaste()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPrice(), getTaste());
    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                ", taste=" + taste +
                '}';
    }

    public void init(){
        System.out.println("Inside init method");
    }

    public void destroy(){
        System.out.println("Inside destroy method");
    }
}
