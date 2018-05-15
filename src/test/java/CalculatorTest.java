import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(1, 2);
    }

    @Test
    public void hasNumber1(){
        assertEquals(1, calculator.getNumber1());
    }

    @Test
    public void hasNumber2(){
        assertEquals(2, calculator.getNumber2());
    }

    @Test
    public void addNumbers(){
        assertEquals(3, calculator.add());
    }

    @Test
    public void subtractNumbers(){
        assertEquals(-1, calculator.subtract());
    }

    @Test
    public void multiplyNumbers(){
        assertEquals(2, calculator.multiply());
    }

    @Test
    public void divideNumbers(){
        assertEquals(0.5, calculator.divide(), 0.1);
    }




}
