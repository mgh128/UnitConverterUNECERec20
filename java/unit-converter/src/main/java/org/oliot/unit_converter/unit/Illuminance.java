package org.oliot.unit_converter.unit;

public class Illuminance {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {
		B60("lumen per square metre", "lm/m²"), LUX("lux", "lx"), KLX("kilolux", "klx"),
		P25("lumen per square foot ", "lm/ft²"), P26("phot", "ph"), P27("footcandle", "ftc");

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

	public static Double[] multipliers = { 1.0, 1.0, 1000.0, 10.76391, 10000.0, 10.76391 };

	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Illuminance(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
