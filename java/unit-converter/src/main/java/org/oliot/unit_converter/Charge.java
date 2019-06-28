package org.oliot.unit_converter;

public class Charge {

	public enum Type {

		COU("coulomb", "C"), A8("ampere second", "A·s"), AMH("ampere hour", "A·h"),
		TAH("kiloampere hour (thousand ampere hour)", "kA·h"), D77("megacoulomb", "MC"), D86("millicoulomb", "mC"),
		B26("kilocoulomb", "kC"), B86("microcoulomb", "µC"), C40("nanocoulomb", "nC"), C71("picocoulomb", "pC"),
		E09("milliampere hour", "mA·h"), N95("ampere minute", "A·min"), N94("franklin", "Fr");

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

	static Double[] multipliers = { 1.0, 1.0, 3600.0, 3600000.0, 1000000.0, 0.001, 1000.0, 1.0E-6, 1.0E-9, 1.0E-12, 3.6,
			60.0, 3.335641E-10 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Charge(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
