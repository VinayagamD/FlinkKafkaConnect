package org.vinaylogics.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.vinaylogics.dto.Transaction;


public class JsonUtil {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static String convertTransactionToJson(Transaction transaction) {
        try {
            return MAPPER.writeValueAsString(transaction);
        }catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
