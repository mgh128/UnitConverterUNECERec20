package org.oliot.unit_converter.unit;

public class Temperature {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
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

	public static Double[] multipliers = { 1.0, 5 / 9.0, 1.0, 5 / 9.0 };
	public static Double[] offsets = { 0.0, 273.15 - 32 * 5 / 9.0, 273.15, 0.0 };

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

	public Temperature(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
