package org.oliot.unit_converter;

public class AbsorbedDoseRate {

	public enum Type {

		P54("miligray per second", "mGy/s"), P55("microgray per second", "µGy/s"), P56("nanogray per second", "nGy/s"),
		P57("gray per minute", "Gy/min"), P58("milligray per minute", "mGy/min"),
		P59("microgray per minute", "µGy/min"), P60("nanogray per minute", "nGy/min"), P61("gray per hour", "Gy/h"),
		P62("milligray per hour", "mGy/h"), P63("microgray per hour", "µGy/h"), P64("nanogray per hour", "nGy/h");

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

	static Double[] multipliers = { 0.001, 1.0E-6, 1.0E-9, 0.0166667, 1.66667E-5, 1.66667E-8, 1.66667E-11, 2.77778E-4,
			2.77778E-7, 2.77778E-10, 2.77778E-13 };
	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public AbsorbedDoseRate(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
