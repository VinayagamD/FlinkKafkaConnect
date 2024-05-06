package org.vinaylogics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    /*
     {"transactionId": "691b9415-437a-4ff4-9808-83936a11acc6", 
     "productId": "product3", 
     "productName": "tablet", 
     "productCategory": "electronic", 
     "productPrice": 734.11, 
     "productQuantity": 2, 
     "productBrand": "apple", 
     "currency": "USD", 
     "customerId": "lhess", 
     "transactionDate": "2024-05-06T01:01:35.146618+0000", 
     "paymentMethod": "debit_card", 
     "totalAmount": 1468.22
     } 
     */
    private String transactionId;
    private String productId;
    private String productName;
    private String productCategory;
    private double productPrice;
    private int productQuantity;
    private String productBrand;
    private String currency;
    private String customerId;
    private Timestamp transactionDate;
    private String paymentMethod;
    private double totalAmount;

}
