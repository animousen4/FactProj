import org.example.core.taskProcessor.containerTask.FactProcessor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.ArrayList;

public class FactProcessorTest {
    @Test
    public void calculateFactorial() {
        FactProcessor factProcessor = new FactProcessor(BigInteger.valueOf(1));
        ArrayList<BigInteger> expected = new ArrayList<BigInteger>();
        expected.add(BigInteger.valueOf(1));

        ArrayList<BigInteger> value = factProcessor.calculate();

        Assertions.assertEquals(expected, value);
    }
}
