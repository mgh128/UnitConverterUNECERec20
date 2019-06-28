package org.oliot.unit_converter;

public class Time {

	public enum Type {

		SEC("second", "s"), MIN("minute", "min"), HUR("hour", "h"), DAY("day", "d"), B52("kilosecond", "ks"),
		C26("millisecond", "ms"), H70("picosecond", "ps"), B98("microsecond", "µs"), C47("nanosecond", "ns"),
		WEE("week", "wk"), MON("month", "mo"), ANN("year", "y"), D42("tropical year", "y (tropical)"),
		L95("common year", "y (365 days)"), L96("sidereal year", "y (sidereal)"), M56("shake", "shake");

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

	static Double[] multipliers = { 1.0, 60.0, 3600.0, 86400.0, 1000.0, 0.001, 1.0E-12, 1.0E-6, 1.0E-9, 604800.0,
			2629800.0, 3.15576E7, 3.1556925E7, 3.1536E7, 3.155815E7, 1.0E-8 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Time(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
