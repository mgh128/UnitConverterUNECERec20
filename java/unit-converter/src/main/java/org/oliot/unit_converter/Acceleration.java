package org.oliot.unit_converter;

public class Acceleration {

	public enum Type {

		MSK("metre per second squared", "m/s²"), A76("gal", "Gal"), C11("milligal", "mGal"),
		M38("kilometre per second squared", "km/s²"), M39("centimetre per second squared", "cm/s²"),
		M41("millimetre per second squared", "mm/s²"), A73("foot per second squared", "ft/s²"),
		IV("inch per second squared", "in/s²"), K40("standard acceleration of free fall", "gn"),
		M40("yard per second squared", "yd/s²"), M42("mile (statute mile) per second squared", "mi/s²");

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

	static Double[] multipliers = { 1.0, 0.01, 1.0E-5, 1000.0, 0.01, 0.001, 0.3048, 0.0254, 9.80665, 0.9144, 1609.344 };

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

	public Acceleration(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
