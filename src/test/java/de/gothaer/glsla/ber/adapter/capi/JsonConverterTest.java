package de.gothaer.glsla.ber.adapter.capi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonConverterTest {

    @Test
    public void testDesirilazation() throws Exception{
        var result = JsonConverter.unmarshall("{\"geburtsDatum\": \"1974-01-01\", \"zahlungAb\": \"2023-06-01\", \"wunschrente\": 150 }");
        System.out.println(result.toString());



    }


}