# Car Sales Management System

This Java application manages customer and car sales data for both individual and corporate customers. It utilizes the Builder Design Pattern for creating customer and sale objects, providing a flexible and readable approach to object construction.

## Features

### Customers
- **Customer:** Represents a general customer with a name, address, phone number, and a list of sales.
- **CorporateCustomer:** Inherits from Customer and adds fields for contact name and contact phone, tailored for corporate clients.

### Sales
- **Sale:** An abstract class representing a generic sale, with fields for date, manufacturer, and price. Includes an abstract method to get the model year.
- **NewCarSale:** Extends `Sale`, representing a sale of a new car. It overrides the `getModelYear` method to calculate the model year based on the sale date.
- **UsedCarSale:** Extends `Sale`, representing a sale of a used car. It includes additional fields for model year and condition description.

### Database
- **CustomerSalesDB:** Manages a list of customers and their associated sales. Provides methods to add new customers, add new sales to existing customers, and retrieve customer and sales information.

### Upcoming Additions
- **Service Package:** The `service` package will be introduced to provide business logic and operations related to customers and sales. This will help in decoupling the core logic from data models and improve the application's maintainability and scalability. The following classes will be added:
  - **CustomerService:** Handles operations related to customers such as adding, updating, and retrieving customer data.
  - **SaleService:** Manages sale-related operations such as adding new sales, calculating total sales, and retrieving sales information.

## Usage

To run the application, execute the `Main` class which initializes the `CustomerSalesDB`, creates instances of `Customer` and `CorporateCustomer`, and adds various `Sale` objects. The program outputs customer and sales details along with the total sales amount for each customer.
