package org.oliot.unit_converter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.oliot.unit_converter.unit.Pressure;

public class PressureTest {

	@Test
	public void test1() {
		Pressure p = new Pressure(Pressure.Type.ATM, 100.0);
		new UnitConverter<Pressure>().convert(p, Pressure.Type._74);
		assertEquals("PressureTest1", p.getValue().doubleValue(), 1.01325E10, 0.0);
	}
}
