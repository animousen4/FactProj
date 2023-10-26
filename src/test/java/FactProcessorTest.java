import org.example.core.taskProcessor.containerTask.FactProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FactProcessorTest {
    @Test
    public void calculateFactorialZero() {
        FactProcessor factProcessor = new FactProcessor(BigInteger.valueOf(0));

        Assertions.assertEquals(
                new ArrayList<>(List.of(BigInteger.ONE)),
                factProcessor.calculate()
        );
    }

    @Test
    public void calculateFactorialOne() {
        FactProcessor factProcessor = new FactProcessor(BigInteger.valueOf(1));

        Assertions.assertEquals(
                new ArrayList<>(List.of(BigInteger.ONE)),
                factProcessor.calculate()
        );
    }

    @Test
    public void calculateFactorialTwo() {
        FactProcessor factProcessor = new FactProcessor(BigInteger.valueOf(2));

        Assertions.assertEquals(
                new ArrayList<>(Arrays.asList(BigInteger.ONE, BigInteger.TWO)),
                factProcessor.calculate()
        );
    }

    @Test
    public void calculateFactorialFive() {
        FactProcessor factProcessor = new FactProcessor(BigInteger.valueOf(5));

        Assertions.assertEquals(
                new ArrayList<>(
                        Arrays.asList(
                                BigInteger.ONE,
                                BigInteger.TWO,
                                BigInteger.valueOf(6),
                                BigInteger.valueOf(24),
                                BigInteger.valueOf(120)
                        )
                ),
                factProcessor.calculate()
        );
    }

    @Test
    public void calculateFactorialLessZeroException() {
        FactProcessor factProcessor = new FactProcessor(BigInteger.valueOf(-1));

        Assertions.assertThrows(AssertionError.class, factProcessor::calculate);
    }
}
