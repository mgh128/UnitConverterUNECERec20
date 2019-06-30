package org.oliot.unit_converter;

import org.json.JSONArray;
import org.json.JSONObject;
import org.oliot.unit_converter.unit.AbsorbedDose;
import org.oliot.unit_converter.unit.AbsorbedDoseRate;
import org.oliot.unit_converter.unit.Acceleration;
import org.oliot.unit_converter.unit.AmountOfSubstance;
import org.oliot.unit_converter.unit.Angle;
import org.oliot.unit_converter.unit.Area;
import org.oliot.unit_converter.unit.Capacitance;
import org.oliot.unit_converter.unit.Charge;
import org.oliot.unit_converter.unit.Conductance;
import org.oliot.unit_converter.unit.Current;
import org.oliot.unit_converter.unit.DensityHumidity;
import org.oliot.unit_converter.unit.DimensionlessConcentration;
import org.oliot.unit_converter.unit.EffectiveDose;
import org.oliot.unit_converter.unit.EffectiveDoseRate;
import org.oliot.unit_converter.unit.Energy;
import org.oliot.unit_converter.unit.Force;
import org.oliot.unit_converter.unit.Frequency;
import org.oliot.unit_converter.unit.Illuminance;
import org.oliot.unit_converter.unit.Inductance;
import org.oliot.unit_converter.unit.Length;
import org.oliot.unit_converter.unit.LuminousIntensity;
import org.oliot.unit_converter.unit.MagneticFlux;
import org.oliot.unit_converter.unit.MagneticFluxDensity;
import org.oliot.unit_converter.unit.MagneticVectorPotential;
import org.oliot.unit_converter.unit.Mass;
import org.oliot.unit_converter.unit.MolarConcentration;
import org.oliot.unit_converter.unit.MolarMass;
import org.oliot.unit_converter.unit.MolarThermodynamicEnergy;
import org.oliot.unit_converter.unit.MolarVolume;
import org.oliot.unit_converter.unit.Power;
import org.oliot.unit_converter.unit.Pressure;
import org.oliot.unit_converter.unit.RadioActivity;
import org.oliot.unit_converter.unit.Resistance;
import org.oliot.unit_converter.unit.SpecificVolume;
import org.oliot.unit_converter.unit.Speed;
import org.oliot.unit_converter.unit.Temperature;
import org.oliot.unit_converter.unit.Time;
import org.oliot.unit_converter.unit.Torque;
import org.oliot.unit_converter.unit.Voltage;
import org.oliot.unit_converter.unit.Volume;

/**
 * Copyright (C) 2019 Jaewook Byun
 *
 * This project is a Java implementation of UnitConverterUNECERec20 written in
 * Javascript (https://github.com/mgh128/UnitConverterUNECERec20)
 *
 * @author Jaewook Byun,
 * 
 *         Assistant Professor, Halla University
 * 
 *         Associate Research Director, Auto-ID Labs, KAIST
 * 
 *         jaewook.byun@halla.ac.kr, bjw0829@kaist.ac.kr
 */
public class UnitConverter<E> {

	/**
	 * converts the value of E input according to a given output unit
	 * 
	 * @param input, which has a value to be converted, E should be one of classes
	 *        in org.oliot.unit_converter.unit
	 * @param outputUnit, the given output unit, should be one of enum Type of E
	 * @return true if the conversion is successful
	 */
	public boolean convert(E input, Object outputUnit) {

		if (input instanceof AbsorbedDose) {
			AbsorbedDose inputObj = (AbsorbedDose) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = AbsorbedDose.multipliers[inputIdx];
			Double inputOffsets = AbsorbedDose.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof AbsorbedDose.Type) {
				AbsorbedDose.Type type = (AbsorbedDose.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = AbsorbedDose.multipliers[outputIdx];
				outputOffset = AbsorbedDose.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(AbsorbedDose.Type.values()[outputIdx]);
		} else if (input instanceof AbsorbedDoseRate) {
			AbsorbedDoseRate inputObj = (AbsorbedDoseRate) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = AbsorbedDoseRate.multipliers[inputIdx];
			Double inputOffsets = AbsorbedDoseRate.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof AbsorbedDoseRate.Type) {
				AbsorbedDoseRate.Type type = (AbsorbedDoseRate.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = AbsorbedDoseRate.multipliers[outputIdx];
				outputOffset = AbsorbedDoseRate.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(AbsorbedDoseRate.Type.values()[outputIdx]);
		} else if (input instanceof Acceleration) {
			Acceleration inputObj = (Acceleration) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Acceleration.multipliers[inputIdx];
			Double inputOffsets = Acceleration.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Acceleration.Type) {
				Acceleration.Type type = (Acceleration.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Acceleration.multipliers[outputIdx];
				outputOffset = Acceleration.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Acceleration.Type.values()[outputIdx]);
		} else if (input instanceof AmountOfSubstance) {
			AmountOfSubstance inputObj = (AmountOfSubstance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = AmountOfSubstance.multipliers[inputIdx];
			Double inputOffsets = AmountOfSubstance.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof AmountOfSubstance.Type) {
				AmountOfSubstance.Type type = (AmountOfSubstance.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = AmountOfSubstance.multipliers[outputIdx];
				outputOffset = AmountOfSubstance.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(AmountOfSubstance.Type.values()[outputIdx]);
		} else if (input instanceof Angle) {
			Angle inputObj = (Angle) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Angle.multipliers[inputIdx];
			Double inputOffsets = Angle.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Angle.Type) {
				Angle.Type type = (Angle.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Angle.multipliers[outputIdx];
				outputOffset = Angle.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Angle.Type.values()[outputIdx]);
		} else if (input instanceof Area) {
			Area inputObj = (Area) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Area.multipliers[inputIdx];
			Double inputOffsets = Area.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Area.Type) {
				Area.Type type = (Area.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Area.multipliers[outputIdx];
				outputOffset = Area.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Area.Type.values()[outputIdx]);
		} else if (input instanceof Capacitance) {
			Capacitance inputObj = (Capacitance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Capacitance.multipliers[inputIdx];
			Double inputOffsets = Capacitance.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Capacitance.Type) {
				Capacitance.Type type = (Capacitance.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Capacitance.multipliers[outputIdx];
				outputOffset = Capacitance.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Capacitance.Type.values()[outputIdx]);
		} else if (input instanceof Charge) {
			Charge inputObj = (Charge) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Charge.multipliers[inputIdx];
			Double inputOffsets = Charge.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Charge.Type) {
				Charge.Type type = (Charge.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Charge.multipliers[outputIdx];
				outputOffset = Charge.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Charge.Type.values()[outputIdx]);
		} else if (input instanceof Conductance) {
			Conductance inputObj = (Conductance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Conductance.multipliers[inputIdx];
			Double inputOffsets = Conductance.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Conductance.Type) {
				Conductance.Type type = (Conductance.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Conductance.multipliers[outputIdx];
				outputOffset = Conductance.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Conductance.Type.values()[outputIdx]);
		} else if (input instanceof Current) {
			Current inputObj = (Current) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Current.multipliers[inputIdx];
			Double inputOffsets = Current.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Current.Type) {
				Current.Type type = (Current.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Current.multipliers[outputIdx];
				outputOffset = Current.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Current.Type.values()[outputIdx]);
		} else if (input instanceof DensityHumidity) {
			DensityHumidity inputObj = (DensityHumidity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = DensityHumidity.multipliers[inputIdx];
			Double inputOffsets = DensityHumidity.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof DensityHumidity.Type) {
				DensityHumidity.Type type = (DensityHumidity.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = DensityHumidity.multipliers[outputIdx];
				outputOffset = DensityHumidity.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(DensityHumidity.Type.values()[outputIdx]);
		} else if (input instanceof DimensionlessConcentration) {
			DimensionlessConcentration inputObj = (DimensionlessConcentration) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = DimensionlessConcentration.multipliers[inputIdx];
			Double inputOffsets = DimensionlessConcentration.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof DimensionlessConcentration.Type) {
				DimensionlessConcentration.Type type = (DimensionlessConcentration.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = DimensionlessConcentration.multipliers[outputIdx];
				outputOffset = DimensionlessConcentration.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(DimensionlessConcentration.Type.values()[outputIdx]);
		} else if (input instanceof EffectiveDose) {
			EffectiveDose inputObj = (EffectiveDose) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = EffectiveDose.multipliers[inputIdx];
			Double inputOffsets = EffectiveDose.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof EffectiveDose.Type) {
				EffectiveDose.Type type = (EffectiveDose.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = EffectiveDose.multipliers[outputIdx];
				outputOffset = EffectiveDose.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(EffectiveDose.Type.values()[outputIdx]);
		} else if (input instanceof EffectiveDoseRate) {
			EffectiveDoseRate inputObj = (EffectiveDoseRate) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = EffectiveDoseRate.multipliers[inputIdx];
			Double inputOffsets = EffectiveDoseRate.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof EffectiveDoseRate.Type) {
				EffectiveDoseRate.Type type = (EffectiveDoseRate.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = EffectiveDoseRate.multipliers[outputIdx];
				outputOffset = EffectiveDoseRate.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(EffectiveDoseRate.Type.values()[outputIdx]);
		} else if (input instanceof Energy) {
			Energy inputObj = (Energy) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Energy.multipliers[inputIdx];
			Double inputOffsets = Energy.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Energy.Type) {
				Energy.Type type = (Energy.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Energy.multipliers[outputIdx];
				outputOffset = Energy.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Energy.Type.values()[outputIdx]);
		} else if (input instanceof Force) {
			Force inputObj = (Force) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Force.multipliers[inputIdx];
			Double inputOffsets = Force.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Force.Type) {
				Force.Type type = (Force.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Force.multipliers[outputIdx];
				outputOffset = Force.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Force.Type.values()[outputIdx]);
		} else if (input instanceof Frequency) {
			Frequency inputObj = (Frequency) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Frequency.multipliers[inputIdx];
			Double inputOffsets = Frequency.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Frequency.Type) {
				Frequency.Type type = (Frequency.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Frequency.multipliers[outputIdx];
				outputOffset = Frequency.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Frequency.Type.values()[outputIdx]);
		} else if (input instanceof Illuminance) {
			Illuminance inputObj = (Illuminance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Illuminance.multipliers[inputIdx];
			Double inputOffsets = Illuminance.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Illuminance.Type) {
				Illuminance.Type type = (Illuminance.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Illuminance.multipliers[outputIdx];
				outputOffset = Illuminance.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Illuminance.Type.values()[outputIdx]);
		} else if (input instanceof Inductance) {
			Inductance inputObj = (Inductance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Inductance.multipliers[inputIdx];
			Double inputOffsets = Inductance.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Inductance.Type) {
				Inductance.Type type = (Inductance.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Inductance.multipliers[outputIdx];
				outputOffset = Inductance.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Inductance.Type.values()[outputIdx]);
		} else if (input instanceof Length) {
			Length inputObj = (Length) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Length.multipliers[inputIdx];
			Double inputOffsets = Length.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Length.Type) {
				Length.Type type = (Length.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Length.multipliers[outputIdx];
				outputOffset = Length.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Length.Type.values()[outputIdx]);
		} else if (input instanceof LuminousIntensity) {
			LuminousIntensity inputObj = (LuminousIntensity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = LuminousIntensity.multipliers[inputIdx];
			Double inputOffsets = LuminousIntensity.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof LuminousIntensity.Type) {
				LuminousIntensity.Type type = (LuminousIntensity.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = LuminousIntensity.multipliers[outputIdx];
				outputOffset = LuminousIntensity.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(LuminousIntensity.Type.values()[outputIdx]);
		} else if (input instanceof MagneticFlux) {
			MagneticFlux inputObj = (MagneticFlux) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MagneticFlux.multipliers[inputIdx];
			Double inputOffsets = MagneticFlux.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof MagneticFlux.Type) {
				MagneticFlux.Type type = (MagneticFlux.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = MagneticFlux.multipliers[outputIdx];
				outputOffset = MagneticFlux.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(MagneticFlux.Type.values()[outputIdx]);
		} else if (input instanceof MagneticFluxDensity) {
			MagneticFluxDensity inputObj = (MagneticFluxDensity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MagneticFluxDensity.multipliers[inputIdx];
			Double inputOffsets = MagneticFluxDensity.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof MagneticFluxDensity.Type) {
				MagneticFluxDensity.Type type = (MagneticFluxDensity.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = MagneticFluxDensity.multipliers[outputIdx];
				outputOffset = MagneticFluxDensity.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(MagneticFluxDensity.Type.values()[outputIdx]);
		} else if (input instanceof MagneticVectorPotential) {
			MagneticVectorPotential inputObj = (MagneticVectorPotential) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MagneticVectorPotential.multipliers[inputIdx];
			Double inputOffsets = MagneticVectorPotential.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof MagneticVectorPotential.Type) {
				MagneticVectorPotential.Type type = (MagneticVectorPotential.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = MagneticVectorPotential.multipliers[outputIdx];
				outputOffset = MagneticVectorPotential.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(MagneticVectorPotential.Type.values()[outputIdx]);
		} else if (input instanceof Mass) {
			Mass inputObj = (Mass) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Mass.multipliers[inputIdx];
			Double inputOffsets = Mass.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Mass.Type) {
				Mass.Type type = (Mass.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Mass.multipliers[outputIdx];
				outputOffset = Mass.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Mass.Type.values()[outputIdx]);
		} else if (input instanceof MolarConcentration) {
			MolarConcentration inputObj = (MolarConcentration) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarConcentration.multipliers[inputIdx];
			Double inputOffsets = MolarConcentration.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof MolarConcentration.Type) {
				MolarConcentration.Type type = (MolarConcentration.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = MolarConcentration.multipliers[outputIdx];
				outputOffset = MolarConcentration.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(MolarConcentration.Type.values()[outputIdx]);
		} else if (input instanceof MolarMass) {
			MolarMass inputObj = (MolarMass) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarMass.multipliers[inputIdx];
			Double inputOffsets = MolarMass.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof MolarMass.Type) {
				MolarMass.Type type = (MolarMass.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = MolarMass.multipliers[outputIdx];
				outputOffset = MolarMass.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(MolarMass.Type.values()[outputIdx]);
		} else if (input instanceof MolarThermodynamicEnergy) {
			MolarThermodynamicEnergy inputObj = (MolarThermodynamicEnergy) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarThermodynamicEnergy.multipliers[inputIdx];
			Double inputOffsets = MolarThermodynamicEnergy.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof MolarThermodynamicEnergy.Type) {
				MolarThermodynamicEnergy.Type type = (MolarThermodynamicEnergy.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = MolarThermodynamicEnergy.multipliers[outputIdx];
				outputOffset = MolarThermodynamicEnergy.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(MolarThermodynamicEnergy.Type.values()[outputIdx]);
		} else if (input instanceof MolarVolume) {
			MolarVolume inputObj = (MolarVolume) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarVolume.multipliers[inputIdx];
			Double inputOffsets = MolarVolume.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof MolarVolume.Type) {
				MolarVolume.Type type = (MolarVolume.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = MolarVolume.multipliers[outputIdx];
				outputOffset = MolarVolume.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(MolarVolume.Type.values()[outputIdx]);
		} else if (input instanceof Power) {
			Power inputObj = (Power) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Power.multipliers[inputIdx];
			Double inputOffsets = Power.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Power.Type) {
				Power.Type type = (Power.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Power.multipliers[outputIdx];
				outputOffset = Power.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Power.Type.values()[outputIdx]);
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
		} else if (input instanceof RadioActivity) {
			RadioActivity inputObj = (RadioActivity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = RadioActivity.multipliers[inputIdx];
			Double inputOffsets = RadioActivity.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof RadioActivity.Type) {
				RadioActivity.Type type = (RadioActivity.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = RadioActivity.multipliers[outputIdx];
				outputOffset = RadioActivity.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(RadioActivity.Type.values()[outputIdx]);
		} else if (input instanceof Resistance) {
			Resistance inputObj = (Resistance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Resistance.multipliers[inputIdx];
			Double inputOffsets = Resistance.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Resistance.Type) {
				Resistance.Type type = (Resistance.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Resistance.multipliers[outputIdx];
				outputOffset = Resistance.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Resistance.Type.values()[outputIdx]);
		} else if (input instanceof SpecificVolume) {
			SpecificVolume inputObj = (SpecificVolume) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = SpecificVolume.multipliers[inputIdx];
			Double inputOffsets = SpecificVolume.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof SpecificVolume.Type) {
				SpecificVolume.Type type = (SpecificVolume.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = SpecificVolume.multipliers[outputIdx];
				outputOffset = SpecificVolume.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(SpecificVolume.Type.values()[outputIdx]);
		} else if (input instanceof Speed) {
			Speed inputObj = (Speed) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Speed.multipliers[inputIdx];
			Double inputOffsets = Speed.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Speed.Type) {
				Speed.Type type = (Speed.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Speed.multipliers[outputIdx];
				outputOffset = Speed.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Speed.Type.values()[outputIdx]);
		} else if (input instanceof Temperature) {
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
		} else if (input instanceof Time) {
			Time inputObj = (Time) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Time.multipliers[inputIdx];
			Double inputOffsets = Time.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Time.Type) {
				Time.Type type = (Time.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Time.multipliers[outputIdx];
				outputOffset = Time.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Time.Type.values()[outputIdx]);
		} else if (input instanceof Torque) {
			Torque inputObj = (Torque) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Torque.multipliers[inputIdx];
			Double inputOffsets = Torque.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Torque.Type) {
				Torque.Type type = (Torque.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Torque.multipliers[outputIdx];
				outputOffset = Torque.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Torque.Type.values()[outputIdx]);
		} else if (input instanceof Voltage) {
			Voltage inputObj = (Voltage) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Voltage.multipliers[inputIdx];
			Double inputOffsets = Voltage.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Voltage.Type) {
				Voltage.Type type = (Voltage.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Voltage.multipliers[outputIdx];
				outputOffset = Voltage.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Voltage.Type.values()[outputIdx]);
		} else if (input instanceof Volume) {
			Volume inputObj = (Volume) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Volume.multipliers[inputIdx];
			Double inputOffsets = Volume.offsets[inputIdx];
			int outputIdx = -1;
			Double outputMultiplier = null;
			Double outputOffset = null;
			if (outputUnit instanceof Volume.Type) {
				Volume.Type type = (Volume.Type) outputUnit;
				outputIdx = type.ordinal();
				outputMultiplier = Volume.multipliers[outputIdx];
				outputOffset = Volume.offsets[outputIdx];
			} else {
				return false;
			}
			inputObj.setValue((inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier);
			inputObj.setType(Volume.Type.values()[outputIdx]);
		} else {
			return false;
		}
		return true;
	}

	/**
	 * return all the possible conversion of input E
	 * 
	 * @param input,E should be one of classes in org.oliot.unit_converter.unit
	 * @return json-representation of the result
	 */
	public String convert(E input) {

		JSONArray result = new JSONArray();
		if (input instanceof AbsorbedDose) {
			AbsorbedDose inputObj = (AbsorbedDose) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = AbsorbedDose.multipliers[inputIdx];
			Double inputOffsets = AbsorbedDose.offsets[inputIdx];
			AbsorbedDose.Type[] types = AbsorbedDose.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				AbsorbedDose.Type type = types[i];
				outputMultiplier = AbsorbedDose.multipliers[i];
				outputOffset = AbsorbedDose.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof AbsorbedDoseRate) {
			AbsorbedDoseRate inputObj = (AbsorbedDoseRate) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = AbsorbedDoseRate.multipliers[inputIdx];
			Double inputOffsets = AbsorbedDoseRate.offsets[inputIdx];
			AbsorbedDoseRate.Type[] types = AbsorbedDoseRate.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				AbsorbedDoseRate.Type type = types[i];
				outputMultiplier = AbsorbedDoseRate.multipliers[i];
				outputOffset = AbsorbedDoseRate.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Acceleration) {
			Acceleration inputObj = (Acceleration) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Acceleration.multipliers[inputIdx];
			Double inputOffsets = Acceleration.offsets[inputIdx];
			Acceleration.Type[] types = Acceleration.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Acceleration.Type type = types[i];
				outputMultiplier = Acceleration.multipliers[i];
				outputOffset = Acceleration.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof AmountOfSubstance) {
			AmountOfSubstance inputObj = (AmountOfSubstance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = AmountOfSubstance.multipliers[inputIdx];
			Double inputOffsets = AmountOfSubstance.offsets[inputIdx];
			AmountOfSubstance.Type[] types = AmountOfSubstance.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				AmountOfSubstance.Type type = types[i];
				outputMultiplier = AbsorbedDose.multipliers[i];
				outputOffset = AbsorbedDose.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Angle) {
			Angle inputObj = (Angle) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Angle.multipliers[inputIdx];
			Double inputOffsets = Angle.offsets[inputIdx];
			Angle.Type[] types = Angle.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Angle.Type type = types[i];
				outputMultiplier = Angle.multipliers[i];
				outputOffset = Angle.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Area) {
			Area inputObj = (Area) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Area.multipliers[inputIdx];
			Double inputOffsets = Area.offsets[inputIdx];
			Area.Type[] types = Area.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Area.Type type = types[i];
				outputMultiplier = Area.multipliers[i];
				outputOffset = Area.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Capacitance) {
			Capacitance inputObj = (Capacitance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Capacitance.multipliers[inputIdx];
			Double inputOffsets = Capacitance.offsets[inputIdx];
			Capacitance.Type[] types = Capacitance.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Capacitance.Type type = types[i];
				outputMultiplier = Capacitance.multipliers[i];
				outputOffset = Capacitance.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Charge) {
			Charge inputObj = (Charge) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Charge.multipliers[inputIdx];
			Double inputOffsets = Charge.offsets[inputIdx];
			Charge.Type[] types = Charge.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Charge.Type type = types[i];
				outputMultiplier = Charge.multipliers[i];
				outputOffset = Charge.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Conductance) {
			Conductance inputObj = (Conductance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Conductance.multipliers[inputIdx];
			Double inputOffsets = Conductance.offsets[inputIdx];
			Conductance.Type[] types = Conductance.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Conductance.Type type = types[i];
				outputMultiplier = Conductance.multipliers[i];
				outputOffset = Conductance.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Current) {
			Current inputObj = (Current) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Current.multipliers[inputIdx];
			Double inputOffsets = Current.offsets[inputIdx];
			Current.Type[] types = Current.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Current.Type type = types[i];
				outputMultiplier = Current.multipliers[i];
				outputOffset = Current.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof DensityHumidity) {
			DensityHumidity inputObj = (DensityHumidity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = DensityHumidity.multipliers[inputIdx];
			Double inputOffsets = DensityHumidity.offsets[inputIdx];
			DensityHumidity.Type[] types = DensityHumidity.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				DensityHumidity.Type type = types[i];
				outputMultiplier = DensityHumidity.multipliers[i];
				outputOffset = DensityHumidity.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof DimensionlessConcentration) {
			DimensionlessConcentration inputObj = (DimensionlessConcentration) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = DimensionlessConcentration.multipliers[inputIdx];
			Double inputOffsets = DimensionlessConcentration.offsets[inputIdx];
			DimensionlessConcentration.Type[] types = DimensionlessConcentration.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				DimensionlessConcentration.Type type = types[i];
				outputMultiplier = DimensionlessConcentration.multipliers[i];
				outputOffset = DimensionlessConcentration.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof EffectiveDose) {
			EffectiveDose inputObj = (EffectiveDose) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = EffectiveDose.multipliers[inputIdx];
			Double inputOffsets = EffectiveDose.offsets[inputIdx];
			EffectiveDose.Type[] types = EffectiveDose.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				EffectiveDose.Type type = types[i];
				outputMultiplier = EffectiveDose.multipliers[i];
				outputOffset = EffectiveDose.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof EffectiveDoseRate) {
			EffectiveDoseRate inputObj = (EffectiveDoseRate) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = EffectiveDoseRate.multipliers[inputIdx];
			Double inputOffsets = EffectiveDoseRate.offsets[inputIdx];
			EffectiveDoseRate.Type[] types = EffectiveDoseRate.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				EffectiveDoseRate.Type type = types[i];
				outputMultiplier = EffectiveDoseRate.multipliers[i];
				outputOffset = EffectiveDoseRate.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Energy) {
			Energy inputObj = (Energy) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Energy.multipliers[inputIdx];
			Double inputOffsets = Energy.offsets[inputIdx];
			Energy.Type[] types = Energy.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Energy.Type type = types[i];
				outputMultiplier = Energy.multipliers[i];
				outputOffset = Energy.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Force) {
			Force inputObj = (Force) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Force.multipliers[inputIdx];
			Double inputOffsets = Force.offsets[inputIdx];
			Force.Type[] types = Force.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Force.Type type = types[i];
				outputMultiplier = Force.multipliers[i];
				outputOffset = Force.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Frequency) {
			Frequency inputObj = (Frequency) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Frequency.multipliers[inputIdx];
			Double inputOffsets = Frequency.offsets[inputIdx];
			Frequency.Type[] types = Frequency.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Frequency.Type type = types[i];
				outputMultiplier = Frequency.multipliers[i];
				outputOffset = Frequency.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Illuminance) {
			Illuminance inputObj = (Illuminance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Illuminance.multipliers[inputIdx];
			Double inputOffsets = Illuminance.offsets[inputIdx];
			Illuminance.Type[] types = Illuminance.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Illuminance.Type type = types[i];
				outputMultiplier = Illuminance.multipliers[i];
				outputOffset = Illuminance.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Inductance) {
			Inductance inputObj = (Inductance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Inductance.multipliers[inputIdx];
			Double inputOffsets = Inductance.offsets[inputIdx];
			Inductance.Type[] types = Inductance.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Inductance.Type type = types[i];
				outputMultiplier = Inductance.multipliers[i];
				outputOffset = Inductance.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Length) {
			Length inputObj = (Length) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Length.multipliers[inputIdx];
			Double inputOffsets = Length.offsets[inputIdx];
			Length.Type[] types = Length.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Length.Type type = types[i];
				outputMultiplier = Length.multipliers[i];
				outputOffset = Length.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof LuminousIntensity) {
			LuminousIntensity inputObj = (LuminousIntensity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = LuminousIntensity.multipliers[inputIdx];
			Double inputOffsets = LuminousIntensity.offsets[inputIdx];
			LuminousIntensity.Type[] types = LuminousIntensity.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				LuminousIntensity.Type type = types[i];
				outputMultiplier = LuminousIntensity.multipliers[i];
				outputOffset = LuminousIntensity.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof MagneticFlux) {
			MagneticFlux inputObj = (MagneticFlux) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MagneticFlux.multipliers[inputIdx];
			Double inputOffsets = MagneticFlux.offsets[inputIdx];
			MagneticFlux.Type[] types = MagneticFlux.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				MagneticFlux.Type type = types[i];
				outputMultiplier = MagneticFlux.multipliers[i];
				outputOffset = MagneticFlux.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof MagneticFluxDensity) {
			MagneticFluxDensity inputObj = (MagneticFluxDensity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MagneticFluxDensity.multipliers[inputIdx];
			Double inputOffsets = MagneticFluxDensity.offsets[inputIdx];
			MagneticFluxDensity.Type[] types = MagneticFluxDensity.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				MagneticFluxDensity.Type type = types[i];
				outputMultiplier = MagneticFluxDensity.multipliers[i];
				outputOffset = MagneticFluxDensity.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof MagneticVectorPotential) {
			MagneticVectorPotential inputObj = (MagneticVectorPotential) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MagneticVectorPotential.multipliers[inputIdx];
			Double inputOffsets = MagneticVectorPotential.offsets[inputIdx];
			MagneticVectorPotential.Type[] types = MagneticVectorPotential.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				MagneticVectorPotential.Type type = types[i];
				outputMultiplier = MagneticVectorPotential.multipliers[i];
				outputOffset = MagneticVectorPotential.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Mass) {
			Mass inputObj = (Mass) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Mass.multipliers[inputIdx];
			Double inputOffsets = Mass.offsets[inputIdx];
			Mass.Type[] types = Mass.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Mass.Type type = types[i];
				outputMultiplier = Mass.multipliers[i];
				outputOffset = Mass.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof MolarConcentration) {
			MolarConcentration inputObj = (MolarConcentration) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarConcentration.multipliers[inputIdx];
			Double inputOffsets = MolarConcentration.offsets[inputIdx];
			MolarConcentration.Type[] types = MolarConcentration.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				MolarConcentration.Type type = types[i];
				outputMultiplier = MolarConcentration.multipliers[i];
				outputOffset = MolarConcentration.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof MolarMass) {
			MolarMass inputObj = (MolarMass) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarMass.multipliers[inputIdx];
			Double inputOffsets = MolarMass.offsets[inputIdx];
			MolarMass.Type[] types = MolarMass.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				MolarMass.Type type = types[i];
				outputMultiplier = MolarMass.multipliers[i];
				outputOffset = MolarMass.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof MolarThermodynamicEnergy) {
			MolarThermodynamicEnergy inputObj = (MolarThermodynamicEnergy) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarThermodynamicEnergy.multipliers[inputIdx];
			Double inputOffsets = MolarThermodynamicEnergy.offsets[inputIdx];
			MolarThermodynamicEnergy.Type[] types = MolarThermodynamicEnergy.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				MolarThermodynamicEnergy.Type type = types[i];
				outputMultiplier = MolarThermodynamicEnergy.multipliers[i];
				outputOffset = MolarThermodynamicEnergy.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof MolarVolume) {
			MolarVolume inputObj = (MolarVolume) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = MolarVolume.multipliers[inputIdx];
			Double inputOffsets = MolarVolume.offsets[inputIdx];
			MolarVolume.Type[] types = MolarVolume.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				MolarVolume.Type type = types[i];
				outputMultiplier = MolarVolume.multipliers[i];
				outputOffset = MolarVolume.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Power) {
			Power inputObj = (Power) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Power.multipliers[inputIdx];
			Double inputOffsets = Power.offsets[inputIdx];
			Power.Type[] types = Power.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Power.Type type = types[i];
				outputMultiplier = Power.multipliers[i];
				outputOffset = Power.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Pressure) {
			Pressure inputObj = (Pressure) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Pressure.multipliers[inputIdx];
			Double inputOffsets = Pressure.offsets[inputIdx];
			Pressure.Type[] types = Pressure.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Pressure.Type type = types[i];
				outputMultiplier = Pressure.multipliers[i];
				outputOffset = Pressure.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof RadioActivity) {
			RadioActivity inputObj = (RadioActivity) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = RadioActivity.multipliers[inputIdx];
			Double inputOffsets = RadioActivity.offsets[inputIdx];
			RadioActivity.Type[] types = RadioActivity.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				RadioActivity.Type type = types[i];
				outputMultiplier = RadioActivity.multipliers[i];
				outputOffset = RadioActivity.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Resistance) {
			Resistance inputObj = (Resistance) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Resistance.multipliers[inputIdx];
			Double inputOffsets = Resistance.offsets[inputIdx];
			Resistance.Type[] types = Resistance.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Resistance.Type type = types[i];
				outputMultiplier = Resistance.multipliers[i];
				outputOffset = Resistance.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof SpecificVolume) {
			SpecificVolume inputObj = (SpecificVolume) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = SpecificVolume.multipliers[inputIdx];
			Double inputOffsets = SpecificVolume.offsets[inputIdx];
			SpecificVolume.Type[] types = SpecificVolume.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				SpecificVolume.Type type = types[i];
				outputMultiplier = SpecificVolume.multipliers[i];
				outputOffset = SpecificVolume.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Speed) {
			Speed inputObj = (Speed) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Speed.multipliers[inputIdx];
			Double inputOffsets = Speed.offsets[inputIdx];
			Speed.Type[] types = Speed.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Speed.Type type = types[i];
				outputMultiplier = Speed.multipliers[i];
				outputOffset = Speed.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Temperature) {
			Temperature inputObj = (Temperature) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Temperature.multipliers[inputIdx];
			Double inputOffsets = Temperature.offsets[inputIdx];
			Temperature.Type[] types = Temperature.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Temperature.Type type = types[i];
				outputMultiplier = Temperature.multipliers[i];
				outputOffset = Temperature.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Time) {
			Time inputObj = (Time) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Time.multipliers[inputIdx];
			Double inputOffsets = Time.offsets[inputIdx];
			Time.Type[] types = Time.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Time.Type type = types[i];
				outputMultiplier = Time.multipliers[i];
				outputOffset = Time.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Torque) {
			Torque inputObj = (Torque) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Torque.multipliers[inputIdx];
			Double inputOffsets = Torque.offsets[inputIdx];
			Torque.Type[] types = Torque.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Torque.Type type = types[i];
				outputMultiplier = Torque.multipliers[i];
				outputOffset = Torque.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Voltage) {
			Voltage inputObj = (Voltage) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Voltage.multipliers[inputIdx];
			Double inputOffsets = Voltage.offsets[inputIdx];
			Voltage.Type[] types = Voltage.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Voltage.Type type = types[i];
				outputMultiplier = Voltage.multipliers[i];
				outputOffset = Voltage.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else if (input instanceof Volume) {
			Volume inputObj = (Volume) input;
			int inputIdx = inputObj.getType().ordinal();
			Double inputMultiplier = Volume.multipliers[inputIdx];
			Double inputOffsets = Volume.offsets[inputIdx];
			Volume.Type[] types = Volume.Type.values();
			Double outputMultiplier = null;
			Double outputOffset = null;
			for (int i = 0; i < types.length; i++) {
				JSONObject obj = new JSONObject();
				Volume.Type type = types[i];
				outputMultiplier = Volume.multipliers[i];
				outputOffset = Volume.offsets[i];
				double val = (inputObj.getValue() * inputMultiplier + inputOffsets - outputOffset) / outputMultiplier;
				obj.put("rec20", type.toString()).put("name", type.getName()).put("symbol", type.getSymbol())
						.put("value", val);
				result.put(obj);
			}
		} else {
			return null;
		}
		return result.toString(1);
	}
}
