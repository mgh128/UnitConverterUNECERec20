package org.oliot.unit_converter.unit;

public class Inductance {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		_81("henry", "H"), C14("millihenry", "mH"), B90("microhenry", "µH"), C43("nanohenry", "nH"),
		C73("picohenry", "pH"), P24("kilohenry", "kH");

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

	public static Double[] multipliers = { 1.0, 0.001, 1.0E-6, 1.0E-9, 1.0E-12, 1000.0 };

	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Inductance(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
