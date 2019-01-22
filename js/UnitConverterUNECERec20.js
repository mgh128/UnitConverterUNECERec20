class UnitConverterUNECERec20 {
	
	// constructor sets up this.unitsData resource shared by multiple methods
	constructor() {

		this.unitsData=[
		{"rec20":"KEL","name":"kelvin","symbol":"K","multiplier":1,"offset":0,"type":"temperature"},
		{"rec20":"FAH","name":"degrees Fahrenheit","symbol":"°F","multiplier":5/9,"offset":273.15-32*5/9,"type":"temperature"},
		{"rec20":"CEL","name":"degrees Celsius","symbol":"°C","multiplier":1,"offset":273.15,"type":"temperature"},
		{"rec20":"A48","name":"degrees Rankine","symbol":"°R","multiplier":5/9,"offset":0,"type":"temperature"},
		{"rec20":"PAL","name":"pascal","symbol":"Pa","multiplier":1,"offset":0,"type":"pressure"},
		{"rec20":"BAR","name":"bar","symbol":"bar","multiplier":100000,"offset":0,"type":"pressure"},
		{"rec20":"MBR","name":"millibar","symbol":"mbar","multiplier":100,"offset":0,"type":"pressure"},
		{"rec20":"ATM","name":"standard atmosphere","symbol":"atm","multiplier":101325,"offset":0,"type":"pressure"},
		{"rec20":"J89","name":"centimetres of mercury","symbol":"cm Hg","multiplier":1333224,"offset":0,"type":"pressure"},
		{"rec20":"HN","name":"millimetres of mercury","symbol":"mm Hg","multiplier":133322.4,"offset":0,"type":"pressure"},
		{"rec20":"PS","name":"pound force per square inch","symbol":"psi","multiplier":6894.757,"offset":0,"type":"pressure"},
		{"rec20":"KGM","name":"kilogram","symbol":"kg","multiplier":1,"offset":0,"type":"mass"},
		{"rec20":"GRM","name":"gram","symbol":"g","multiplier":0.001,"offset":0,"type":"mass"},
		{"rec20":"ONZ","name":"ounce","symbol":"oz","multiplier":0.02834952,"offset":0,"type":"mass"},
		{"rec20":"LBR","name":"pound","symbol":"lb","multiplier":0.45359237,"offset":0,"type":"mass"},
		{"rec20":"MGM","name":"milligram","symbol":"mg","multiplier":0.000001,"offset":0,"type":"mass"},
		{"rec20":"MC","name":"microgram","symbol":"µg","multiplier":0.000000001,"offset":0,"type":"mass"},
		{"rec20":"STI","name":"stone (UK)","symbol":"st","multiplier":6.350293,"offset":0,"type":"mass"},
		{"rec20":"JOU","name":"joule","symbol":"J","multiplier":1,"offset":0,"type":"energy"},
		{"rec20":"A53","name":"electronvolt","symbol":"eV","multiplier":1.602176487E-19,"offset":0,"type":"energy"},
		{"rec20":"D60","name":"calorie (international table)","symbol":"cal(IT)","multiplier":4.1868,"offset":0,"type":"energy"},
		{"rec20":"J75","name":"calorie (mean)","symbol":"cal","multiplier":4.19002,"offset":0,"type":"energy"},
		{"rec20":"E14","name":"kilocalorie (international table)","symbol":"kcal(IT)","multiplier":4186.8,"offset":0,"type":"energy"},
		{"rec20":"K51","name":"kilocalorie (mean)","symbol":"kcal","multiplier":4190.02,"offset":0,"type":"energy"},
		{"rec20":"K53","name":"kilocalorie (thermochemical)","symbol":"kcal(TH)","multiplier":4184,"offset":0,"type":"energy"},
		{"rec20":"BTU","name":"British thermal unit (international table)","symbol":"Btu(IT)","multiplier":1055.056,"offset":0,"type":"energy"},
		{"rec20":"J37","name":"British thermal unit (mean)","symbol":"Btu","multiplier":1055.87,"offset":0,"type":"energy"},
		{"rec20":"N71","name":"therm (EC)","symbol":"thm(EC)","multiplier":1.05506E8,"offset":0,"type":"energy"},
		{"rec20":"N72","name":"therm (US)","symbol":"thm(US)","multiplier":1.054804E8,"offset":0,"type":"energy"},
		{"rec20":"J55","name":"watt second","symbol":"Ws","multiplier":1,"offset":0,"type":"energy"},
		{"rec20":"MTR","name":"metre","symbol":"m","multiplier":1,"offset":0,"type":"length"},
		{"rec20":"A11","name":"angstrom","symbol":"Å","multiplier":1E-10,"offset":0,"type":"length"},
		{"rec20":"A71","name":"femtometre","symbol":"fm","multiplier":1E-15,"offset":0,"type":"length"},
		{"rec20":"C45","name":"nanometre","symbol":"nm","multiplier":1E-9,"offset":0,"type":"length"},
		{"rec20":"4H","name":"micrometre","symbol":"µm","multiplier":1E-6,"offset":0,"type":"length"},
		{"rec20":"A12","name":"astronomical unit","symbol":"ua","multiplier":1.49597870E11,"offset":0,"type":"length"},
		{"rec20":"DMT","name":"decimetre","symbol":"dm","multiplier":0.1,"offset":0,"type":"length"},
		{"rec20":"CMT","name":"centimetre","symbol":"cm","multiplier":0.01,"offset":0,"type":"length"},
		{"rec20":"MMT","name":"millimetre","symbol":"mm","multiplier":0.001,"offset":0,"type":"length"},
		{"rec20":"INH","name":"inch","symbol":"in","multiplier":0.0254,"offset":0,"type":"length"},
		{"rec20":"FOT","name":"foot","symbol":"ft","multiplier":0.3048,"offset":0,"type":"length"},
		{"rec20":"YRD","name":"yard","symbol":"yd","multiplier":0.9144,"offset":0,"type":"length"},
		{"rec20":"NMI","name":"nautical mile","symbol":"n mile","multiplier":1852,"offset":0,"type":"length"},
		{"rec20":"A45","name":"decametre","symbol":"dam","multiplier":10,"offset":0,"type":"length"},
		{"rec20":"HMT","name":"hectometre","symbol":"hm","multiplier":100,"offset":0,"type":"length"},
		{"rec20":"KMT","name":"kilometre","symbol":"km","multiplier":1000,"offset":0,"type":"length"},
		{"rec20":"B57","name":"light year","symbol":"ly","multiplier":9.46073E15,"offset":0,"type":"length"},
		{"rec20":"AK","name":"fathom","symbol":"fth","multiplier":1.8288,"offset":0,"type":"length"},
		{"rec20":"M50","name":"furlong","symbol":"fur","multiplier":201.168,"offset":0,"type":"length"},
		{"rec20":"M49","name":"chain (based on US survey foot)","symbol":"ch (US survey)","multiplier":20.11684,"offset":0,"type":"length"},
		{"rec20":"X1","name":"Gunter's chain","symbol":"ch (UK)","multiplier":20.1168,"offset":0,"type":"length"},
		{"rec20":"M51","name":"foot (US survey)","symbol":"ft (US survey)","multiplier":0.3048006,"offset":0,"type":"length"},
		{"rec20":"KMH","name":"kilometres per hour","symbol":"km/h","multiplier":0.277777778,"offset":0,"type":"speed"},
		{"rec20":"MTS","name":"metres per second","symbol":"m/s","multiplier":1,"offset":0,"type":"speed"},
		{"rec20":"HM","name":"miles per hour","symbol":"mile/h","multiplier":0.44704,"offset":0,"type":"speed"},
		{"rec20":"M57","name":"miles per minute","symbol":"mi/min","multiplier":26.8224,"offset":0,"type":"speed"},
		{"rec20":"M58","name":"miles per second","symbol":"mi/s","multiplier":1609.344,"offset":0,"type":"speed"},
		{"rec20":"KNT","name":"knot","symbol":"kn","multiplier":0.514444,"offset":0,"type":"speed"},
		{"rec20":"M62","name":"kilometres per second","symbol":"km/s","multiplier":1000,"offset":0,"type":"speed"},
		{"rec20":"H49","name":"centimetres per hour","symbol":"cm/h","multiplier":0.277777778E-6,"offset":0,"type":"speed"},
		{"rec20":"2M","name":"centimetres per second","symbol":"cm/s","multiplier":0.01,"offset":0,"type":"speed"},
		{"rec20":"K14","name":"foot per hour","symbol":"ft/h","multiplier":8.466667E-5,"offset":0,"type":"speed"},
		{"rec20":"FR","name":"foot per minute","symbol":"ft/min","multiplier":5.08E-3,"offset":0,"type":"speed"},
		{"rec20":"FS","name":"foot per second","symbol":"ft/s","multiplier":0.3048,"offset":0,"type":"speed"},
		{"rec20":"M63","name":"inch per minute","symbol":"in/min","multiplier":4.233333E-4,"offset":0,"type":"speed"},
		{"rec20":"IU","name":"inch per second","symbol":"in/s","multiplier":0.0254,"offset":0,"type":"speed"},
		{"rec20":"M61","name":"inch per year","symbol":"in/y","multiplier":8.048774E-10,"offset":0,"type":"speed"},
		{"rec20":"2X","name":"metre per minute","symbol":"m/min","multiplier":1/60,"offset":0,"type":"speed"},
		];
	}



	byType(type) {
		return function(element) {
			return element.type === type;
		}
	}



	byUnitCode(type) {
		return function(element) {
			return element.rec20 === type;
		}
	}



	byKeyword(keyword) {
		var lk = keyword.toLowerCase();
		return function(element) {
			return ((element.rec20 === keyword) || (element.name.toLowerCase().indexOf(lk) > -1) || (element.symbol.toLowerCase().indexOf(lk) > -1));
		}
	}



	keywordMatch(keyword) {
		return this.unitsData.filter(this.byKeyword(keyword));
	}



	multiconvert(inputObj) {
		var inputUnitCode=Object.keys(inputObj)[0];
		var inputValue=Object.values(inputObj)[0];
		var inputUnitObj=this.unitsData.filter(this.byUnitCode(inputUnitCode))[0];
		var inputType=inputUnitObj.type;
		var outputCandidates=this.unitsData.filter(this.byType(inputType));
		var rv={};
		for (var i in outputCandidates) {
			var candidate=outputCandidates[i];
			rv[candidate.rec20]=(inputValue*inputUnitObj.multiplier+inputUnitObj.offset-candidate.offset)/candidate.multiplier;
		}
		return rv;
	}



	convert(inputObj,outputUnit) {
		var inputUnitCode=Object.keys(inputObj)[0];
		var inputValue=Object.values(inputObj)[0];
		var inputUnitObj=this.unitsData.filter(this.byUnitCode(inputUnitCode))[0];
		var outputUnitObj=this.unitsData.filter(this.byUnitCode(outputUnit))[0];	
		var outputValue=(inputValue*inputUnitObj.multiplier+inputUnitObj.offset-outputUnitObj.offset)/outputUnitObj.multiplier;
		return outputValue;	
	}



	relatedUnits(unitCode) {
		var inputUnitObj=this.unitsData.filter(this.byUnitCode(unitCode));
		var inputUnitType=inputUnitObj[0].type;
		var relatedUnitObj=this.unitsData.filter(this.byType(inputUnitType));
		var rv=[];
		for (var i in relatedUnitObj) {
			rv.push(relatedUnitObj[i].rec20);
		}
		return rv.sort();
	}

}
