package org.oliot.unit_converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TemperatureTest {

	@Test
	public void test1() {
		Temperature t = new Temperature(Temperature.Type.CEL, 100.0);
		new UnitConverter<Temperature>().convert(t, Temperature.Type.KEL);
		assertEquals("TemperatureTest1", t.getValue().doubleValue(), 373.15, 0.0);
	}
}
