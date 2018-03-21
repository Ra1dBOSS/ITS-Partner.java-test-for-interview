package net.itspartner.test.n4;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void findTheBiggestNumberTest() {
        //arrange
        Main main = new Main();
        int[] a = {1, 3, 6 , -1, 12, 4, 5};
        int correctRes = 12;

        //act
        int res = main.findTheBiggestNumber(a);

        //assert
        assertEquals(correctRes, res);
    }
}