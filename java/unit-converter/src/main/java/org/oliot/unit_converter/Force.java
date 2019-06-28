package org.oliot.unit_converter;

public class Force {

	public enum Type {

		NEW("newton", "N"), B47("kilonewton", "kN"), B73("meganewton", "MN"), B92("micronewton", "µN"),
		C20("millinewton", "mN"), DU("dyne", "dyn"), C78("pound-force", "lbf"), B37("kilogram-force", "kgf"),
		B51("kilopond", "kp"), L40("ounce (avoirdupois)-force", "ozf"), L94("ton-force (US short)", "ton.sh-force"),
		M75("kilopound-force", "kip"), M76("poundal", "pdl"), M77("kilogram metre per second squared", "kg·m/s²"),
		M78("pond", "p");

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

	static Double[] multipliers = { 1.0, 1000.0, 1000000.0, 1.0E-6, 0.001, 1.0E-5, 4.448222, 9.80665, 9.80665,
			0.2780139, 8896.443, 4448.222, 0.138255, 1.0, 0.00980665 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Force(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
