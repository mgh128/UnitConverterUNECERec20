package org.oliot.unit_converter;

public class Energy {

	public enum Type {

		JOU("joule", "J"), KJO("kilojoule", "kJ"), A68("exajoule", "EJ"), C68("petajoule", "PJ"),
		D30("terajoule", "TJ"), GV("gigajoule", "GJ"), _3B("megajoule", "MJ"), C15("millijoule", "mJ"),
		A70("femtojoule", "fJ"), A13("attojoule", "aJ"), WHR("watt hour", "W·h"), MWH("megawatt hour", "MW·h"),
		KWH("kilowatt hour", "kW·h"), GWH("gigawatt hour", "GW·h"), D32("terawatt hour", "TW·h"),
		A53("electronvolt", "eV"), B71("megaelectronvolt", "MeV"), A85("gigaelectronvolt", "GeV"),
		B29("kiloelectronvolt", "keV"), A57("erg", "erg"), _85("foot pound-force", "ft·lbf"),
		B38("kilogram-force metre", "kgf·m"), N46("foot poundal", "ft·pdl"), N47("inch poundal", "in·pdl"),
		D60("calorie (international table)", "cal(IT)"), J75("calorie (mean)", "cal"),
		E14("kilocalorie (international table)", "kcal(IT)"), K51("kilocalorie (mean)", "kcal"),
		K53("kilocalorie (thermochemical)", "kcal(TH)"), BTU("British thermal unit (international table)", "Btu(IT)"),
		J37("British thermal unit (mean)", "Btu"), N71("therm (EC)", "thm(EC)"), N72("therm (US)", "thm(US)"),
		J55("watt second", "Ws");

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

	static Double[] multipliers = { 1.0, 1000.0, 1.0E18, 1.0E15, 1.0E12, 1.0E9, 1000000.0, 0.001, 1.0E-15, 1.0E-18,
			3600.0, 3.6E9, 3600000.0, 3.6E12, 3.6E15, 1.602176487E-19, 1.602176487E-13, 1.602176487E-10,
			1.602176487E-16, 1.0E-7, 1.355818, 9.80665, 0.04214011, 0.003511677, 4.1868, 4.19002, 4186.8, 4190.02,
			4184.0, 1055.056, 1055.87, 1.05506E8, 1.054804E8, 1.0 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };

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

	public Energy(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
