package pe.mgh128.UnitConverterUNECERec20;

public class Temperature {

	public enum Rec20 {
		KEL, FAH, CEL, A48
	}

	public enum Name {
		kelvin, degreesFahrenheit, Celsius, Rankine
	}

	public enum Symbol {
		K, ºF, ºC, ºR
	}

	static Double[] multipliers = { 1.0, 5 / 9.0, 1.0, 5 / 9.0 };
	static Double[] offsets = { 0.0, 273.14 - 32 * 5 / 0.9, 273.15, 0.0 };

	private Rec20 rec20;
	private Name name;
	private Symbol symbol;
	private Double value;

	public Rec20 getRec20() {
		return rec20;
	}

	public void setRec20(Rec20 rec20) {
		this.rec20 = rec20;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public Symbol getSymbol() {
		return symbol;
	}

	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Temperature(Rec20 rec20, Double value) {
		this.rec20 = rec20;
		this.name = Name.values()[rec20.ordinal()];
		this.symbol = Symbol.values()[rec20.ordinal()];
		this.value = value;
	}

	public Temperature(Name name, Double value) {
		this.rec20 = Rec20.values()[name.ordinal()];
		this.name = name;
		this.symbol = Symbol.values()[name.ordinal()];
		this.value = value;
	}

	public Temperature(Symbol symbol, Double value) {
		this.rec20 = Rec20.values()[symbol.ordinal()];
		this.name = Name.values()[symbol.ordinal()];
		this.symbol = symbol;
		this.value = value;
	}
}
