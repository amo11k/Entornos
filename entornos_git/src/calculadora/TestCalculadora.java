package calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCalculadora {
	Calculadora c1;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		c1=new Calculadora();
	}

	@Test
	public void test() {
		assertEquals(c1.suma(2,3), 5, 0);
		assertEquals(c1.resta(3,2), 1, 0);
		assertEquals(c1.divide(10,5), 2, 0);
		assertEquals(c1.multiplica(2,3), 6, 0);
		assertEquals(c1.potencia(5,2), 25, 0);
		
	}

}
