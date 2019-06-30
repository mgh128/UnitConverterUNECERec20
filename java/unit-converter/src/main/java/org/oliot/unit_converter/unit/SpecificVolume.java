package org.oliot.unit_converter.unit;

public class SpecificVolume {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		A39("cubic metre per kilogram", "m³/kg"), _22("decilitre per gram", "dl/g"), H83("litre per kilogram", "l/kg"),
		KX("millilitre per kilogram", "ml/kg"), N28("cubic decimetre per kilogram", "dm³/kg"),
		N29("cubic foot per pound", "ft³/lb"), N30("cubic inch per pound", "in³/lb");

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

	public static Double[] multipliers = { 1.0, 0.1, 0.001, 1.0E-6, 0.001, 0.06242796, 3.612728E-5 };

	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public SpecificVolume(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
