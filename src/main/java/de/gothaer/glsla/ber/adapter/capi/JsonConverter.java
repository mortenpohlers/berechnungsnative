package de.gothaer.glsla.ber.adapter.capi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import de.gothaer.glsla.oniondemo.domain.aggregates.BerechnungsErgebnis;
import de.gothaer.glsla.oniondemo.domain.aggregates.BerechnungsVorgabe;

public class JsonConverter {

    private static ObjectMapper objectMapper = new ObjectMapper();

    static {
        objectMapper.registerModule(new JavaTimeModule());
    }

    public static BerechnungsVorgabe unmarshall(String jsonData) throws Exception{
        return objectMapper.readValue(jsonData, BerechnungsVorgabe.class);
    }

    public static String marshall(BerechnungsErgebnis ergebnis) throws Exception{
        return objectMapper.writeValueAsString(ergebnis);
    }




}
