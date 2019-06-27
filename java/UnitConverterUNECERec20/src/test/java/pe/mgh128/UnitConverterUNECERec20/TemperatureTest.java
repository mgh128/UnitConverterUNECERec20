package pe.mgh128.UnitConverterUNECERec20;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pe.mgh128.UnitConverterUNECERec20.Temperature.Rec20;

public class TemperatureTest {

	@Test
	public void test1() {
		Temperature t = new Temperature(Rec20.CEL, 100.0);
		new UnitConverter<Temperature>().convert(t, Temperature.Name.kelvin);
		assertEquals("TemperatureTest1", t.getValue().doubleValue(), 373.15, 0.0);
	}
}
