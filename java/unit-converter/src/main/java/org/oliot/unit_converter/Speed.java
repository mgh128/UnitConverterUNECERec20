package org.oliot.unit_converter;

public class Speed {

	public enum Type {

		KMH("kilometres per hour", "km/h"), MTS("metres per second", "m/s"), HM("miles per hour", "mile/h"),
		M57("miles per minute", "mi/min"), M58("miles per second", "mi/s"), KNT("knot", "kn"),
		M62("kilometres per second", "km/s"), H49("centimetres per hour", "cm/h"),
		_2M("centimetres per second", "cm/s"), K14("foot per hour", "ft/h"), FR("foot per minute", "ft/min"),
		FS("foot per second", "ft/s"), M63("inch per minute", "in/min"), IU("inch per second", "in/s"),
		M61("inch per year", "in/y"), _2X("metre per minute", "m/min");

		private final String name;
		private final String symbol;

		private Type(String name, String symbol) {
			this.name = name;
			this.symbol = symbol;
		}

		public String getName() {
			return name;
		}

		public String getSymbol() {
			return symbol;
		}
	}

	static Double[] multipliers = { 0.277777778, 1.0, 0.44704, 26.8224, 1609.344, 0.514444, 1000.0, 2.77777778E-7, 0.01,
			8.466667E-5, 0.00508, 0.3048, 4.233333E-4, 0.0254, 8.048774E-10, 0.016666667 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

	private Type type;
	private Double value;

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Speed(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
