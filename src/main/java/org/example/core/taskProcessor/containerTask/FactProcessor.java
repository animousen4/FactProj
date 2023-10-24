package org.example.core.taskProcessor.containerTask;

import org.example.core.taskProcessor.TaskProcessor;

import java.awt.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

public class FactProcessor implements TaskProcessor<ArrayList<BigInteger>> {
     private final BigInteger amount;
    private static final BigInteger incValue = BigInteger.valueOf(1);
    public FactProcessor(BigInteger amount) {
        this.amount = amount;
    }
    @Override
    public ArrayList<BigInteger> calculate() {
        BigInteger number = BigInteger.valueOf(1);
        ArrayList<BigInteger> result = new ArrayList<BigInteger>();
        for (BigInteger i = BigInteger.valueOf(1); !amount.equals(i); i = i.add(incValue)) {
            number = number.multiply(i);
            result.add(number);
        }

        return result;

    }
}
