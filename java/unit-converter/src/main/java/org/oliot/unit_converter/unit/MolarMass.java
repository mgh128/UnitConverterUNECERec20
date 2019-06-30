package org.oliot.unit_converter.unit;

public class MolarMass {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		D74("kilogram per mole", "kg/mol"), A94("gram per mole", "g/mol");

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

	public static Double[] multipliers = { 1.0, 0.001 };
	public static Double[] offsets = { 0.0, 0.0 };

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

	public MolarMass(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
