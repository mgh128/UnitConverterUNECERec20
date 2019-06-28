package org.oliot.unit_converter;

public class Length {

	public enum Type {

		MTR("metre", "m"), A11("angstrom", "Å"), A71("femtometre", "fm"), C45("nanometre", "nm"),
		_4H("micrometre", "µm"), A12("astronomical unit", "ua"), DMT("decimetre", "dm"), CMT("centimetre", "cm"),
		MMT("millimetre", "mm"), INH("inch", "in"), FOT("foot", "ft"), YRD("yard", "yd"),
		NMI("nautical mile", "n mile"), A45("decametre", "dam"), HMT("hectometre", "hm"), KMT("kilometre", "km"),
		B57("light year", "ly"), AK("fathom", "fth"), M50("furlong", "fur"),
		M49("chain (based on US survey foot)", "ch (US survey)"), X1("Gunter's chain", "ch (UK)"),
		M51("foot (US survey)", "ft (US survey)");

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

	static Double[] multipliers = { 1.0, 1.0E-10, 1.0E-15, 1.0E-9, 1.0E-6, 1.4959787E11, 0.1, 0.01, 0.001, 0.0254,
			0.3048, 0.9144, 1852.0, 10.0, 100.0, 1000.0, 9.46073E15, 1.8288, 201.168, 20.11684, 20.1168, 0.3048006 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Length(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
