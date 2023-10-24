package org.example;

import org.example.core.taskProcessor.containerTask.FactProcessor;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FactProcessor processor = new FactProcessor(BigInteger.valueOf(10));
        ArrayList<BigInteger> res = processor.calculate();
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}