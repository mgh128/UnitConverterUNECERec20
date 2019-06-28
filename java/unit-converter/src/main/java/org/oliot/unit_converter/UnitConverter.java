package org.oliot.unit_converter;

public class UnitConverter<E> {

	public boolean convert(E input, Object outputUnit) {

		if (input instanceof Temperature) {
			Temperature inputObj = (Temperature) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Temperature.multipliers[inputIdx];
			Double inputOffsets = Temperature.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Temperature.Type) {
				Temperature.Type type = (Temperature.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Temperature.multipliers[outputIdx];
				outputOffset = Temperature.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Temperature.Type.values()[outputIdx]);
		} else if (input instanceof Pressure) {
			Pressure inputObj = (Pressure) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Pressure.multipliers[inputIdx];
			Double inputOffsets = Pressure.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Pressure.Type) {
				Pressure.Type type = (Pressure.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Pressure.multipliers[outputIdx];
				outputOffset = Pressure.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Pressure.Type.values()[outputIdx]);
		} else {
			return false;
		}
		return true;
	}
}
