package gr.carcompany.models;

import lombok.AllArgsConstructor;
import lombok.Data;

abstract class Sale {
    private long id;
    private String dateOfSale;
    private String makeOfCar;
    private double price;
}
