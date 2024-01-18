package lv.rvt;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import rvt.Money;



public class MoneyTest {

    @Test
    public void testPlusMethod(){
        Money money1 = new Money(1, 85);
        Money money2 = new Money(2, 90);
        Money result1 = money1.plus(money2);
        
        assertEquals(4, result1.euros());
        assertEquals(75, result1.cents());
    }
    @Test
    public void testminusMethod(){
        Money money1 = new Money(1, 85);
        Money money2 = new Money(2, 90);
        Money result1 = money1.minus(money2);
        
        assertEquals(0, result1.euros());
        assertEquals(0, result1.cents());
    }
    @Test
    public void testlessMethod(){
        Money money1 = new Money(1, 85);
        Money money2 = new Money(2, 90);
        Money result1 = money1.minus(money2);
        
        assertEquals(false, result1.less(money2));
    }




}
