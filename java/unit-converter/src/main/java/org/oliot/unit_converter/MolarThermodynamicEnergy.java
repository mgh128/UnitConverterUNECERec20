package org.oliot.unit_converter;

public class MolarThermodynamicEnergy {

	public enum Type {

		B15("joule per mole", "J/mol"), B44("kilojoule per mole", "kJ/mol");

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

	static Double[] multipliers = { 1.0, 1000.0 };
	static Double[] offsets = { 0.0, 0.0 };

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

	public MolarThermodynamicEnergy(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
