package org.oliot.unit_converter.unit;

public class Mass {

	/**
	 * 'Rec20 representation'('name', 'symbol')
	 */
	public enum Type {

		KGM("kilogram", "kg"), KTN("kilotonne", "kt"), LTN("ton (UK) or long ton (US)", "ton (UK)"),
		_2U("megagram", "Mg"), TNE("tonne (metric ton)", "t"), STN("ton (US) or short ton (UK/US)", "ton (US)"),
		DTN("decitonne", "dt"), STI("stone (UK)", "st"), LBR("pound", "lb"), HGM("hectogram", "hg"), ONZ("ounce", "oz"),
		DJ("decagram", "dag"), APZ("troy ounce or apothecary ounce", "tr oz"), GRM("gram", "g"), DG("decigram", "dg"),
		CGM("centigram", "cg"), MGM("milligram", "mg"), MC("microgram", "µg"), F13("slug", "slug"),
		CWI("hundred weight (UK)", "cwt (UK)"), CWA("hundred pound (cwt) / hundred weight (US)", "cwt (US)"),
		M86("pfund", "pfd");

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

	public static Double[] multipliers = { 1.0, 1000000.0, 1016.047, 1000.0, 1000.0, 907.1847, 100.0, 6.350293,
			0.45359237, 0.1, 0.02834952, 0.01, 0.003110348, 0.001, 1.0E-4, 1.0E-5, 1.0E-6, 1.0E-9, 14.5939, 50.8023,
			45.3592, 0.5 };

	public static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Mass(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
