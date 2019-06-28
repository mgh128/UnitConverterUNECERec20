package org.oliot.unit_converter;

public class RadioActivity {

	public enum Type {

		CUR("curie", "Ci"), MCU("millicurie", "mCi"), M5("microcurie", "µCi"), _2R("kilocurie", "kCi"),
		BQL("becquerel", "Bq"), GBQ("gigabecquerel", "GBq"), _2Q("kilobecquerel", "kBq"), _4N("megabecquerel", "MBq"),
		H08("microbecquerel", "µBq");

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

	static Double[] multipliers = { 3.7E10, 3.7E7, 37000.0, 3.7E13, 1.0, 1.0E9, 1000.0, 1000000.0, 1.0E-6 };
	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public RadioActivity(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
