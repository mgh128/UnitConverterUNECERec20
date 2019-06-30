package org.oliot.unit_converter.unit;

public class Conductance {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		SIE("siemens", "S"), B53("kilosiemens", "kS"), C27("millisiemens", "mS"), B99("microsiemens", "µS"),
		N92("picosiemens", "pS"), NQ("mho", "mho"), NR("micromho", "µmho");

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

	public static Double[] multipliers = { 1.0, 1000.0, 0.001, 1.0E-6, 1.0E-12, 1.0, 1.0E-6 };

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

	public Conductance(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
