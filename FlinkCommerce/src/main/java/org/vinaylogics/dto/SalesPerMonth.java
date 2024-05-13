package org.vinaylogics.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SalesPerMonth {
    Integer year;
    Integer month;
    Double totalSales;

}
