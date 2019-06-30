package org.oliot.unit_converter.unit;

public class MagneticVectorPotential {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		D59("weber per metre", "Wb/m"), B56("kiloweber per metre", "kWb/m"), D60("weber per millimetre", "Wb/mm");

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

	public static Double[] multipliers = { 1.0, 1000.0, 1000.0 };

	public static Double[] offsets = { 0.0, 0.0, 0.0 };

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

	public MagneticVectorPotential(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
