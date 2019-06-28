package org.oliot.unit_converter;

public class Resistance {

	public enum Type {

		OHM("ohm", "Ω"), A87("gigaohm", "GΩ"), B75("megaohm", "MΩ"), H44("teraohm", "TΩ"), B49("kiloohm", "kΩ"),
		E45("milliohm", "mΩ"), B94("microohm", "µΩ"), P22("nanoohm", "nΩ");

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

	static Double[] multipliers = { 1.0, 1.0E9, 1000000.0, 1.0E12, 1000.0, 0.001, 1.0E-6, 1.0E-9 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Resistance(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
