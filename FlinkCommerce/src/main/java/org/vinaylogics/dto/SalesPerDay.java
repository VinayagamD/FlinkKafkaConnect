package org.vinaylogics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesPerDay {

    private Date transactionDate;
    private Double totalSales;

}
