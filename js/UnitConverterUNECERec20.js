class UnitConverterUNECERec20 {
	
	// constructor sets up this.unitsData resource shared by multiple methods
	constructor() {

		this.unitsData=[
		{"rec20":"KEL","name":"kelvin","symbol":"K","multiplier":1,"offset":0,"type":"temperature"},
		{"rec20":"FAH","name":"degrees Fahrenheit","symbol":"°F","multiplier":5/9,"offset":273.15-32*5/9,"type":"temperature"},
		{"rec20":"CEL","name":"degrees Celsius","symbol":"°C","multiplier":1,"offset":273.15,"type":"temperature"},
		{"rec20":"A48","name":"degrees Rankine","symbol":"°R","multiplier":5/9,"offset":0,"type":"temperature"},
			
		{"rec20":"PAL","name":"pascal","symbol":"Pa","multiplier":1,"offset":0,"type":"pressure"},
		{"rec20":"H75","name":"decapascal","symbol":"daPa","multiplier":10,"offset":0,"type":"pressure"},
		{"rec20":"74","name":"millipascal","symbol":"mPa","multiplier":1.00E-03,"offset":0,"type":"pressure"},
		{"rec20":"A89","name":"gigapascal","symbol":"GPa","multiplier":1.00E+09,"offset":0,"type":"pressure"},
		{"rec20":"A97","name":"hectopascal","symbol":"hPa","multiplier":100,"offset":0,"type":"pressure"},
		{"rec20":"B96","name":"micropascal","symbol":"µPa","multiplier":1.00E-06,"offset":0,"type":"pressure"},
		{"rec20":"KPA","name":"kilopascal","symbol":"kPa","multiplier":1.00E+03,"offset":0,"type":"pressure"},
		{"rec20":"MPA","name":"megapascal","symbol":"MPa","multiplier":1.00E+06,"offset":0,"type":"pressure"},			
		{"rec20":"BAR","name":"bar","symbol":"bar","multiplier":100000,"offset":0,"type":"pressure"},
		{"rec20":"MBR","name":"millibar","symbol":"mbar","multiplier":100,"offset":0,"type":"pressure"},
		{"rec20":"C55","name":"newton per square metre","symbol":"N/m²","multiplier":1.00,"offset":0,"type":"pressure"},
		{"rec20":"C56","name":"newton per square millimetre","symbol":"N/mm²","multiplier":1000000.00,"offset":0,"type":"pressure"},
		{"rec20":"B40","name":"kilogram-force per square metre","symbol":"kgf/m²","multiplier":9.80665,"offset":0,"type":"pressure"},
		{"rec20":"UA","name":"torr","symbol":"Torr","multiplier":133.3224,"offset":0,"type":"pressure"},
		{"rec20":"80","name":"pound per square inch absolute","symbol":"lb/in²","multiplier":6897.112776,"offset":0,"type":"pressure"},
		{"rec20":"H78","name":"conventional centimetre of water","symbol":"cm H₂O","multiplier":98.0665,"offset":0,"type":"pressure"},
		{"rec20":"HP","name":"conventional millimetre of water","symbol":"mm H₂O","multiplier":9.80665,"offset":0,"type":"pressure"},
		{"rec20":"F79","name":"inch of mercury","symbol":"inHg","multiplier":33220.4859,"offset":0,"type":"pressure"},
		{"rec20":"F78","name":"inch of water","symbol":"inH₂O","multiplier":2443.56309,"offset":0,"type":"pressure"},
		{"rec20":"ATT","name":"technical atmosphere","symbol":"at","multiplier":98066.5,"offset":0,"type":"pressure"},			
		{"rec20":"ATM","name":"standard atmosphere","symbol":"atm","multiplier":101325,"offset":0,"type":"pressure"},
		{"rec20":"J89","name":"centimetres of mercury","symbol":"cm Hg","multiplier":1333.224,"offset":0,"type":"pressure"},
		{"rec20":"K24","name":"foot of water","symbol":"ft H₂O","multiplier":2989.067,"offset":0,"type":"pressure"},
		{"rec20":"K25","name":"foot of mercury","symbol":"ft Hg","multiplier":40636.66,"offset":0,"type":"pressure"},
		{"rec20":"K31","name":"gram-force per square centimetre","symbol":"gf/cm²","multiplier":98.0665,"offset":0,"type":"pressure"},
		{"rec20":"E42","name":"kilogram-force per square centimetre","symbol":"kgf/cm²","multiplier":98066.50,"offset":0,"type":"pressure"},
		{"rec20":"E41","name":"kilogram-force per square millimetre","symbol":"kgf·/mm²","multiplier":9806650.00,"offset":0,"type":"pressure"},
		{"rec20":"K85","name":"pound-force per square foot","symbol":"lbf/ft²","multiplier":47.88026,"offset":0,"type":"pressure"},
		{"rec20":"84","name":"kilopounds force per square inch","symbol":"klbf/in²","multiplier":6894757.00,"offset":0,"type":"pressure"},
		{"rec20":"N13","name":"centimetre of mercury (0 ºC)","symbol":"cmHg (0 ºC)","multiplier":1333.22,"offset":0,"type":"pressure"},
		{"rec20":"N14","name":"centimetre of water (4 ºC)","symbol":"cmH₂O (4 °C)","multiplier":98.0638,"offset":0,"type":"pressure"},
		{"rec20":"N15","name":"foot of water (39.2 ºF)","symbol":"ftH₂O (392 ºF)","multiplier":2988.98,"offset":0,"type":"pressure"},
		{"rec20":"N16","name":"inch of mercury (32 ºF)","symbol":"inHG (32 ºF)","multiplier":3386.38,"offset":0,"type":"pressure"},
		{"rec20":"N17","name":"inch of mercury (60 ºF)","symbol":"inHg (60 ºF)","multiplier":3376.85,"offset":0,"type":"pressure"},
		{"rec20":"N18","name":"inch of water (39.2 ºF)","symbol":"inH₂O (392 ºF)","multiplier":249.082,"offset":0,"type":"pressure"},
		{"rec20":"N19","name":"inch of water (60 ºF)","symbol":"inH₂O (60 ºF)","multiplier":248.84,"offset":0,"type":"pressure"},
		{"rec20":"N20","name":"kip per square inch","symbol":"ksi","multiplier":6894757.00,"offset":0,"type":"pressure"},
		{"rec20":"N21","name":"poundal per square foot","symbol":"pdl/ft²","multiplier":1.488164,"offset":0,"type":"pressure"},
		{"rec20":"N22","name":"ounce (avoirdupois) per square inch","symbol":"oz/in²","multiplier":431.0695485,"offset":0,"type":"pressure"},
		{"rec20":"N23","name":"conventional metre of water","symbol":"mH₂O","multiplier":9806.65,"offset":0,"type":"pressure"},
		{"rec20":"HN","name":"millimetres of mercury","symbol":"mm Hg","multiplier":13332.24,"offset":0,"type":"pressure"},
		{"rec20":"PS","name":"pound force per square inch","symbol":"psi","multiplier":6894.757,"offset":0,"type":"pressure"},

		{"rec20":"NEW","name":"newton","symbol":"N","multiplier":1,"offset":0,"type":"force"},
		{"rec20":"B47","name":"kilonewton","symbol":"kN","multiplier":1.00E+03,"offset":0,"type":"force"},
		{"rec20":"B73","name":"meganewton","symbol":"MN","multiplier":1.00E+06,"offset":0,"type":"force"},
		{"rec20":"B92","name":"micronewton","symbol":"µN","multiplier":1.00E-06,"offset":0,"type":"force"},
		{"rec20":"C20","name":"millinewton","symbol":"mN","multiplier":1.00E-03,"offset":0,"type":"force"},
		{"rec20":"DU","name":"dyne","symbol":"dyn","multiplier":1e-5,"offset":0,"type":"force"},
		{"rec20":"C78","name":"pound-force","symbol":"lbf","multiplier":4.448222,"offset":0,"type":"force"},
		{"rec20":"B37","name":"kilogram-force","symbol":"kgf","multiplier":9.80665,"offset":0,"type":"force"},
		{"rec20":"B51","name":"kilopond","symbol":"kp","multiplier":9.80665,"offset":0,"type":"force"},
		{"rec20":"L40","name":"ounce (avoirdupois)-force","symbol":"ozf","multiplier":0.2780139,"offset":0,"type":"force"},
		{"rec20":"L94","name":"ton-force (US short)","symbol":"ton.sh-force","multiplier":8.896443e3,"offset":0,"type":"force"},
		{"rec20":"M75","name":"kilopound-force","symbol":"kip","multiplier":4.448222e3,"offset":0,"type":"force"},
		{"rec20":"M76","name":"poundal","symbol":"pdl","multiplier":1.382550e-1,"offset":0,"type":"force"},
		{"rec20":"M77","name":"kilogram metre per second squared","symbol":"kg·m/s²","multiplier":1,"offset":0,"type":"force"},
		{"rec20":"M78","name":"pond","symbol":"p","multiplier":9.80665e-3,"offset":0,"type":"force"},

		{"rec20":"C81","name":"radian","symbol":"rad","multiplier":1,"offset":0,"type":"angle"},
		{"rec20":"C25","name":"milliradian","symbol":"mrad","multiplier":1.00E-03,"offset":0,"type":"angle"},
		{"rec20":"B97","name":"microradian","symbol":"µrad","multiplier":1.00E-06,"offset":0,"type":"angle"},
		{"rec20":"A91","name":"gon","symbol":"gon","multiplier":0.01570796327,"offset":0,"type":"angle"},
		{"rec20":"DD","name":"degree","symbol":"°","multiplier":0.01745329252,"offset":0,"type":"angle"},
		{"rec20":"D61","name":"minute","symbol":"'","multiplier":0.0002908882087,"offset":0,"type":"angle"},
		{"rec20":"D62","name":"second","symbol":"\"","multiplier":0.000004848136811,"offset":0,"type":"angle"},
		{"rec20":"M43","name":"mil","symbol":"mil","multiplier":0.0009817477042,"offset":0,"type":"angle"},
		{"rec20":"M44","name":"revolution","symbol":"rev","multiplier":6.283185307,"offset":0,"type":"angle"},
			
			
		{"rec20":"KGM","name":"kilogram","symbol":"kg","multiplier":1,"offset":0,"type":"mass"},
		{"rec20":"GRM","name":"gram","symbol":"g","multiplier":0.001,"offset":0,"type":"mass"},
		{"rec20":"ONZ","name":"ounce","symbol":"oz","multiplier":0.02834952,"offset":0,"type":"mass"},
		{"rec20":"LBR","name":"pound","symbol":"lb","multiplier":0.45359237,"offset":0,"type":"mass"},
		{"rec20":"MGM","name":"milligram","symbol":"mg","multiplier":0.000001,"offset":0,"type":"mass"},
		{"rec20":"MC","name":"microgram","symbol":"µg","multiplier":0.000000001,"offset":0,"type":"mass"},
		{"rec20":"STI","name":"stone (UK)","symbol":"st","multiplier":6.350293,"offset":0,"type":"mass"},
		{"rec20":"TNE","name":"tonne (metric ton)","symbol":"t","multiplier":1000,"offset":0,"type":"mass"},
			
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
			
		{"rec20":"HTZ","name":"hertz","symbol":"Hz","multiplier":1,"offset":0,"type":"frequency"},
		{"rec20":"KHZ","name":"kilohertz","symbol":"kHz","multiplier":1.00E+03,"offset":0,"type":"frequency"},
		{"rec20":"MHZ","name":"megahertz","symbol":"MHz","multiplier":1.00E+06,"offset":0,"type":"frequency"},
		{"rec20":"A86","name":"gigahertz","symbol":"GHz","multiplier":1.00E+09,"offset":0,"type":"frequency"},
		{"rec20":"D29","name":"terahertz","symbol":"THz","multiplier":1.00E+12,"offset":0,"type":"frequency"},

		{"rec20":"VLT","name":"volt","symbol":"V","multiplier":1,"offset":0,"type":"voltage"},
		{"rec20":"N99","name":"picovolt","symbol":"pV","multiplier":1.00E-12,"offset":0,"type":"voltage"},
		{"rec20":"2Z","name":"millivolt","symbol":"mV","multiplier":1.00E-03,"offset":0,"type":"voltage"},
		{"rec20":"B78","name":"megavolt","symbol":"MV","multiplier":1.00E+06,"offset":0,"type":"voltage"},
		{"rec20":"D82","name":"microvolt","symbol":"µV","multiplier":1.00E-06,"offset":0,"type":"voltage"},
		{"rec20":"KVT","name":"kilovolt","symbol":"kV","multiplier":1000,"offset":0,"type":"voltage"},

		{"rec20":"CDL","name":"candela","symbol":"cd","multiplier":1,"offset":0,"type":"luminous intensity"},
		{"rec20":"P33","name":"kilocandela","symbol":"kcd","multiplier":1.00E+03,"offset":0,"type":"luminous intensity"},
		{"rec20":"P34","name":"millicandela","symbol":"mcd","multiplier":1.00E-03,"offset":0,"type":"luminous intensity"},

		{"rec20":"C34","name":"mole","symbol":"mol","multiplier":1,"offset":0,"type":"amount of substance"},
		{"rec20":"B45","name":"kilomole","symbol":"kmol","multiplier":1.00E+03,"offset":0,"type":"amount of substance"},
		{"rec20":"C18","name":"millimole","symbol":"mmol","multiplier":1.00E-03,"offset":0,"type":"amount of substance"},
		{"rec20":"FH","name":"micromole","symbol":"µmol","multiplier":1.00E-06,"offset":0,"type":"amount of substance"},


			
			
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
