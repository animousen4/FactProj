package org.example;

import org.example.core.taskProcessor.containerTask.FactProcessor;

import java.math.BigInteger;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FactProcessor processor = new FactProcessor(BigInteger.valueOf(2));
        ArrayList<BigInteger> res = processor.calculate();
        for (BigInteger re : res) {
            System.out.println(re);
        }
    }
}