package pe.mgh128.UnitConverterUNECERec20;

import pe.mgh128.UnitConverterUNECERec20.Temperature.Name;
import pe.mgh128.UnitConverterUNECERec20.Temperature.Rec20;
import pe.mgh128.UnitConverterUNECERec20.Temperature.Symbol;

public class UnitConverter<E> {

	public boolean convert(E input, Object outputUnit) {
		if (input instanceof Temperature) {
			Temperature inputObj = (Temperature) input;
			int inputIdx = inputObj.getName().ordinal();
			Double inputMultiplier = Temperature.multipliers[inputIdx];
			Double inputOffsets = Temperature.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Temperature.Rec20) {
				Temperature.Rec20 rec20 = (Temperature.Rec20) outputUnit;
				outputIdx = rec20.ordinal();
				outputMultiplier = Temperature.multipliers[outputIdx];
				outputOffset = Temperature.offsets[outputIdx];
			} else if (outputUnit instanceof Temperature.Name) {
				Temperature.Name name = (Temperature.Name) outputUnit;
				outputIdx = name.ordinal();
				outputMultiplier = Temperature.multipliers[outputIdx];
				outputOffset = Temperature.offsets[outputIdx];
			} else if (outputUnit instanceof Temperature.Symbol) {
				Temperature.Symbol symbol = (Temperature.Symbol) outputUnit;
				outputIdx = symbol.ordinal();
				outputMultiplier = Temperature.multipliers[outputIdx];
				outputOffset = Temperature.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setName(Name.values()[outputIdx]);
			inputObj.setSymbol(Symbol.values()[outputIdx]);
			inputObj.setRec20(Rec20.values()[outputIdx]);
		} else {
			return false;
		}
		return true;
		// (inputValue*multiplier+inputUnitObj.offset-outputUnitObj.offset)/outputUnitObj.multiplier
	}
	
	public static void main(String[] args) {
		
	}
}
