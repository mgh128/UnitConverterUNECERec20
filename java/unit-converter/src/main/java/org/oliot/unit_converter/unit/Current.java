package org.oliot.unit_converter.unit;

public class Current {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		AMP("ampere", "A"), B22("kiloampere", "kA"), H38("megaampere", "MA"), _4K("milliampere", "mA"),
		B84("microampere", "µA"), C39("nanoampere", "nA"), C70("picoampere", "pA"), N96("biot", "Bi"),
		N97("gilbert", "Gi");

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

	public static Double[] multipliers = { 1.0, 1000.0, 1000000.0, 0.001, 1.0E-6, 1.0E-9, 1.0E-12, 10.0, 0.7957747 };

	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Current(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
