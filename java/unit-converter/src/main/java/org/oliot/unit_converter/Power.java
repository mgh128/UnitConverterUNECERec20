package org.oliot.unit_converter;

public class Power {

	public enum Type {

		WTT("watt", "W"), KWT("kilowatt", "kW"), MAW("megawatt", "MW"), A90("gigawatt", "GW"), C31("milliwatt", "mW"),
		D80("microwatt", "µW"), F80("water horse power", "water hp"), A63("erg per second", "erg/s"),
		A74("foot pound-force per second", "ft·lbf/s"), B39("kilogram-force metre per second", "kgf·m/s"),
		HJ("metric horse power", "metric hp"), A25("cheval vapeur", "CV"), BHP("brake horse power", "BHP"),
		K15("foot pound-force per hour", "ft·lbf/h"), K16("foot pound-force per minute", "ft·lbf/min"),
		K42("horsepower (boiler)", "boiler hp"), N12("Pferdestaerke", "PS");

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

	static Double[] multipliers = { 1.0, 1000.0, 1000000.0, 1.0E9, 0.001, 1.0E-6, 746.043, 1.0E-7, 1.355818, 9.80665,
			735.49875, 735.4988, 745.7, 3.766161E-4, 0.02259697, 9809.5, 735.4988 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Power(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
