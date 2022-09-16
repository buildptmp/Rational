import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() throws Rational.Illegal {
        Rational a = new Rational(1,2);
        Rational b = new Rational(1,4);
        a.add(b);
        Assert.assertEquals(3, a.numerator);
        Assert.assertEquals(4, a.denominator);

    }
    @Test
    public void testSubtract() throws Rational.Illegal {
        Rational a = new Rational(1,2);
        Rational b = new Rational(2,2);
        Rational z = new Rational(3,4);

        a.subtract(b);
        Assert.assertEquals(-1, a.numerator);
        Assert.assertEquals(2, a.denominator);
        b.subtract(z);
        Assert.assertEquals(1, b.numerator);
        Assert.assertEquals(4, b.denominator);
    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational a = new Rational(1,2);
        Rational b = new Rational(2,2);
        Rational z = new Rational(3,4);

        a.multiply(b);
        Assert.assertEquals(1, a.numerator);
        Assert.assertEquals(2, a.denominator);
        b.multiply(z);
        Assert.assertEquals(3, b.numerator);
        Assert.assertEquals(4, b.denominator);

    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational a = new Rational(1,2);
        Rational b = new Rational(2,2);
        Rational z = new Rational(3,4);

        a.divide(b);
        Assert.assertEquals(1, a.numerator);
        Assert.assertEquals(2, a.denominator);
        b.divide(z);
        Assert.assertEquals(4, b.numerator);
        Assert.assertEquals(3, b.denominator);
        z.divide(a);
        Assert.assertEquals(3, z.numerator);
        Assert.assertEquals(2, z.denominator);
    }

    @Test
    public void equals() throws Rational.Illegal {
        Rational a = new Rational(1,2);
        Rational b = new Rational(2,2);
        Rational z = new Rational(4,4);
        boolean t1 = a.equals(b);
        Assert.assertEquals(false, t1);
        boolean t2 = b.equals(z);
        Assert.assertEquals(true, t2);
    }

    @Test
    public void compareTo() throws Rational.Illegal {
        Rational a = new Rational(1,2);
        Rational b = new Rational(2,2);
        Rational z = new Rational(4,4);

        Assert.assertEquals(-1,a.compareTo(b));
        Assert.assertEquals(-1,a.compareTo(z));
    }

    @Test
    public void itoString() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(2,2);
        Rational z = new Rational(3,4);

        Assert.assertEquals("1/2",x.toString());
        Assert.assertEquals("1/1",y.toString());
        Assert.assertEquals("3/4",z.toString());
    }


}
