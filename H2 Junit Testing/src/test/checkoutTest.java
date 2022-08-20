package src.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.main.Main;

public class checkoutTest {
    @Test

    public void subTotalIsValid() {
        assertEquals(19.2, Main.getSubTotal());
    }

    @Test

    public void isTaxIsValid() {
        assertEquals(2.496, Main.getTax(19.2));
    }

    @Test

    public void isTotalValid() {
        assertEquals(21.696, Main.Total());
    }

}
