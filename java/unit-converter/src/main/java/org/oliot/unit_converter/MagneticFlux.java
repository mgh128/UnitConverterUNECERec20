package org.oliot.unit_converter;

public class MagneticFlux {

	public enum Type {

		WEB("weber", "Wb"), C33("milliweber", "mWb"), P11("kiloweber", "kWb");

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

	static Double[] multipliers = { 1.0, 0.001, 1000.0 };

	static Double[] offsets = { 0.0, 0.0, 0.0 };

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

	public MagneticFlux(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
