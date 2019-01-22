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
		{"rec20":"STI","name":"stone (UK)","symbol":"st","multiplier":6.350293,"offset":0,"type":"mass"}



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
