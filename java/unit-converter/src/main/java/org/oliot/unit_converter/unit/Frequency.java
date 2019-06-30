package org.oliot.unit_converter.unit;

public class Frequency {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		HTZ("hertz", "Hz"), KHZ("kilohertz", "kHz"), MHZ("megahertz", "MHz"), A86("gigahertz", "GHz"),
		D29("terahertz", "THz");

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

	public static Double[] multipliers = { 1.0, 1000.0, 1000000.0, 1.0E9, 1.0E12 };

	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0 };

	public static Type[] getRec20Types() {
		return Type.values();
	}

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

	public Frequency(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
