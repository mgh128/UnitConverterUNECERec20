package org.oliot.unit_converter.unit;

public class MolarVolume {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		A40("cubic metre per mole", "m³/mol"), A37("cubic decimetre per mole", "dm³/mol"),
		A36("cubic centimetre per mole", "cm³/mol"), B58("litre per mole", "l/mol");

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

	public static Double[] multipliers = { 1.0, 0.001, 1.0E-6, 0.001 };
	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0 };

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

	public MolarVolume(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
