package br.ufal.ic.easy.test;

import org.junit.Test;
import org.junit.Assert;

public class MainTest {

    @Test
    public void evaluateSum() {
        int result = Main.sum(2, 4);

        Assert.assertEquals(6, result);
    }

}