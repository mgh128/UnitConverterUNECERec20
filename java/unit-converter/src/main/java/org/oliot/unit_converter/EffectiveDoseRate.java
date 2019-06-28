package org.oliot.unit_converter;

public class EffectiveDoseRate {

	public enum Type {

		P65("sievert per second", "Sv/s"), P66("millisievert per second", "mSv/s"),
		P67("microsievert per second", "µSv/s"), P68("nanosievert per second", "nSv/s"), P69("rem per second", "rem/s"),
		P70("sievert per hour", "Sv/h"), P71("millisievert per hour", "mSv/h"), P72("microsievert per hour", "µSv/h"),
		P73("nanosievert per hour", "nSv/h"), P74("sievert per minute", "Sv/min"),
		P75("millisievert per minute", "mSv/min"), P76("microsievert per minute", "µSv/min"),
		P77("nanosievert per minute", "nSv/min");

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

	static Double[] multipliers = { 1.0, 0.001, 1.0E-6, 1.0E-9, 0.01, 2.77778E-4, 2.77777778E-8, 2.77777778E-11,
			2.77777778E-14, 0.016666, 1.666666667E-5, 1.666666667E-8, 1.666666667E-11 };
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

	public EffectiveDoseRate(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
