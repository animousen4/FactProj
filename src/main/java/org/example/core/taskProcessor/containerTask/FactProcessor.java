package org.example.core.taskProcessor.containerTask;

import org.example.core.taskProcessor.TaskProcessor;

import java.awt.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FactProcessor implements TaskProcessor<ArrayList<BigInteger>> {
    private final BigInteger amount;
    private static final BigInteger incValue = BigInteger.valueOf(1);
    public FactProcessor(BigInteger amount) {
        this.amount = amount;
    }
    @Override
    public ArrayList<BigInteger> calculate() {
        assert BigInteger.ZERO.compareTo(amount) <= 0;

        BigInteger number = BigInteger.valueOf(1);
        ArrayList<BigInteger> result = new ArrayList<>(
                List.of(BigInteger.ONE)
        );

        for (BigInteger i = BigInteger.valueOf(2); amount.compareTo(i) >= 0; i = i.add(incValue)) {
            number = number.multiply(i);
            result.add(number);
        }

        return result;

    }


}
