package org.oliot.unit_converter.unit;

public class AbsorbedDose {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		A95("gray", "Gy"), C13("milligray", "mGy"), C80("rad", "rad"), A61("erg per gram", "J/kg");

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

	public static Double[] multipliers = { 1.0, 0.001, 0.01, 1.0E-4 };
	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0 };

	private Type type;
	private Double value;

	public static Type[] getRec20Types() {
		return Type.values();
	}

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

	public AbsorbedDose(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
