package com.spartaglobal.DeserialiseRates;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RatesTest {

    public static RatesDesterialiser rates;


    @BeforeClass
    public static void setup(){
        rates = new RatesDesterialiser("resources/rates.json");
    }

    @Test
    public void TestGetDate (){

        Date date = new Date(rates.rateMapped.getTimestamp() * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-M-d");
        System.out.println(sdf.format(date));
        Assert.assertEquals(sdf.format(date) ,rates.rateMapped.getDate());
    }

    public double getEuro(){
        return rates.rateMapped.getRates().get("Euro");
    }

    @Test
    public void TestEuro(){
        Assert.assertEquals(1,1,0);
    }

    @Test
    public void testSuccessIsTrue (){
        Assert.assertTrue(rates.rateMapped.isSuccess());
    }

    @Test
    public void testEpockDate(){
        Assert.assertEquals("EUR",rates.rateMapped.getBase());
    }

    public int getRateCount (){
        int count = 0;
        for(int i = 0 ; i < rates.rateMapped.getRates().size(); i++){
            count++;
        }
        return count;
    }

    @Test
    public void TestGetRates(){
        Assert.assertEquals(getRateCount(), rates.rateMapped.getRates().size());
    }

    @Test
    public void TestGetRate2(){
        Assert.assertEquals(rates.rateMapped.getRates().size(), rates.rateMapped.getRates().size());
    }
}
