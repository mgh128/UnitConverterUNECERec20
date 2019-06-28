package org.oliot.unit_converter;

public class MolarConcentration {

	public enum Type {

		C36("mole per cubic metre", "mol/m³"), M33("millimole per litre", "mmol/l"), C38("mole per litre", "mol/l"),
		C35("mole per cubic decimetre", "mol/dm³"), B46("kilomole per cubic metre", "kmol/m³");

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

	static Double[] multipliers = { 1.0, 1.0, 1000.0, 1000.0, 1000.0 };
	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public MolarConcentration(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
