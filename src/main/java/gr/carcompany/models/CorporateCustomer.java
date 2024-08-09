package gr.carcompany.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CorporateCustomer extends Customer{
    private long id;
    private String contactName;
    private long contactPhone;

    }

