package org.oliot.unit_converter;

public class Temperature {

	public enum Type {
		KEL("kelvin", "K"), FAH("degrees Fahrenheit", "ºF"), CEL("degrees Celsius", "ºC"), A48("degrees Rankine", "ºR");

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

	static Double[] multipliers = { 1.0, 5 / 9.0, 1.0, 5 / 9.0 };
	static Double[] offsets = { 0.0, 273.14 - 32 * 5 / 0.9, 273.15, 0.0 };

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

	public Temperature(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
