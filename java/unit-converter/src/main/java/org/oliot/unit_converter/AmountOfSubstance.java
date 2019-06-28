package org.oliot.unit_converter;

public class AmountOfSubstance {

	public enum Type {

		C34("mole", "mol"), B45("kilomole", "kmol"), C18("millimole", "mmol"), FH("micromole", "µmol");

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

	static Double[] multipliers = { 1.0, 1000.0, 0.001, 1.0E-6 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0 };

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

	public AmountOfSubstance(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
