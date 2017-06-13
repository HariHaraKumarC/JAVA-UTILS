package hari.app.java.utils.fitness;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by HariHaraKumar.C on 6/12/2017.
 */
public class BmiCalculatorTest{
    BmiCalculator bmiCalculator=new BmiCalculator();

    @Test
    public void testBmi(){
        bmiCalculator.setHeight(1.55);
        bmiCalculator.setWeight(63.0);
        bmiCalculator.calculateBMI();
        bmiCalculator.setCategory();
        System.out.println(bmiCalculator);
        Assert.assertTrue(bmiCalculator.getBmi() > 18.5 && bmiCalculator.getBmi() < 25 );
    }

}
