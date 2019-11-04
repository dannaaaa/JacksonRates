package com.spartaglobal.DeserialiseRates;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;

public class RatesDesterialiser {
    public RatesDTO rateMapped;

    public RatesDesterialiser(String fileLocation) {
        ObjectMapper objectMapper = new ObjectMapper();
        
        try {
            rateMapped = objectMapper.readValue(new FileReader(fileLocation), RatesDTO.class);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}



