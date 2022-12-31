package org.annotation.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("ssd")
public class SolidStateDrive {
    @Value("1000000000000")
    private long capacity;

    @Value("Toshiba")
    private String brandName;

    @Value("6000")
    private float price;

    @Override
    public String toString() {
        return "SolidStateDrive{" +
                "capacity=" + capacity +
                ", brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}
