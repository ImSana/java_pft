package ru.stqa.pfr.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Sana on 16.03.2019.
 */
public class SquareTests {
  @Test
  public void testArea() {
    Square s = new Square(5);
    Assert.assertEquals(s.area(), 25.0);
  }
}
