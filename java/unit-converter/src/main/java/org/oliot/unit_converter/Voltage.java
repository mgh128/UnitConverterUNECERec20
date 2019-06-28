package org.oliot.unit_converter;

public class Voltage {

	public enum Type {

		VLT("volt", "V"), N99("picovolt", "pV"), _2Z("millivolt", "mV"), B78("megavolt", "MV"), D82("microvolt", "µV"),
		KVT("kilovolt", "kV");

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

	static Double[] multipliers = { 1.0, 1.0E-12, 0.001, 1000000.0, 1.0E-6, 1000.0 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Voltage(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
