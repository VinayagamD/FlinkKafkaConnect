package org.vinaylogics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesPerCategory{
    Date transactionDate;
    String category;
    Double totalSales;
}

