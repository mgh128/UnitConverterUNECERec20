package org.oliot.unit_converter.unit;

public class Angle {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		C81("radian", "rad"), C25("milliradian", "mrad"), B97("microradian", "µrad"), A91("gon", "gon"),
		DD("degree", "º"), D61("minute", "'"), D62("second", "\""), M43("mil", "mil"), M44("revolution", "rev");

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

	public static Double[] multipliers = { 1.0, 0.001, 1.0E-6, 0.01570796327, 0.01745329252, 2.908882087E-4,
			4.848136811E-6, 9.817477042E-4, 6.283185307 };

	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Angle(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
