package org.oliot.unit_converter;

public class Area {

	public enum Type {

		MTK("square metre", "m²"), KMK("square kilometre", "km²"), H30("square micrometre (square micron)", "µm²"),
		DAA("decare", "daa"), CMK("square centimetre", "cm²"), DMK("square decimetre", "dm²"),
		H16("square decametre", "dam²"), H18("square hectometre", "hm²"), MMK("square millimetre", "mm²"),
		ARE("are", "a"), HAR("hectare", "ha"), INK("square inch", "in²"), FTK("square foot", "ft²"),
		YDK("square yard", "yd²"), MIK("square mile (statute mile)", "mi²"),
		M48("square mile (based on U.S. survey foot) ", "mi² (US survey)"), ACR("acre", "acre"),
		M47("circular mil ", "cmil");

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

	static Double[] multipliers = { 1.0, 1000000.0, 1.0E-12, 1000.0, 1.0E-4, 0.01, 100.0, 10000.0, 1.0E-6, 100.0,
			10000.0, 6.4516E-4, 0.09290304, 0.8361274, 2589988.0, 2589998.0, 4046.873, 5.067075E-10 };

	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0 };

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

	public Area(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
