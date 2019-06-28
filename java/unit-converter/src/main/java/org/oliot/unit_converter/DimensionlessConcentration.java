package org.oliot.unit_converter;

public class DimensionlessConcentration {

	public enum Type {

		P1("percent", "%"), _59("part per million", "ppm"), _61("part per billion (US)", "ppm"),
		_60("percent weight", "wt%"), E40("part per hundred thousand", "ppht"), NX("part per thousand, per mille", "‰"),
		GK("gram per kilogram", "g/kg"), NA("milligram per kilogram", "mg/kg"), J33("microgram per kilogram", "µg/kg"),
		L32("nanogram per kilogram", "ng/kg"), M29("kilogram per kilogram", "kg/kg"), K62("litre per litre", "l/l"),
		L19("millilitre per litre", "ml/l"), J36("microlitre per litre", "µl/l"),
		H60("cubic metre per cubic metre", "m³/m³"), H65("millilitre per cubic metre", "ml/m³"),
		J87("cubic centimetre per cubic metre", "cm³/m³"), L21("cubic millimetre per cubic metre", "mm³/m³"),
		J91("cubic decimetre per cubic metre", "dm³/m³");

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

	static Double[] multipliers = { 0.01, 1.0E-6, 1.0E-9, 0.01, 1.0E-5, 0.001, 0.001, 1.0E-6, 1.0E-9, 1.0E-12, 1.0, 1.0,
			0.001, 1.0E-6, 1.0, 1.0E-6, 1.0E-6, 1.0E-9, 0.001 };
	static Double[] offsets = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
			0.0, 0.0 };

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

	public DimensionlessConcentration(Type type, Double value) {
		this.type = type;
		this.value = value;
	}
}
