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

		{"rec20":"JOU","name":"joule","symbol":"J","multiplier":1,"offset":0,"type":"energy"},
		{"rec20":"KJO","name":"kilojoule","symbol":"kJ","multiplier":1e3,"offset":0,"type":"energy"},
		{"rec20":"A68","name":"exajoule","symbol":"EJ","multiplier":1e18,"offset":0,"type":"energy"},
		{"rec20":"C68","name":"petajoule","symbol":"PJ","multiplier":1e15,"offset":0,"type":"energy"},
		{"rec20":"D30","name":"terajoule","symbol":"TJ","multiplier":1e12,"offset":0,"type":"energy"},
		{"rec20":"GV","name":"gigajoule","symbol":"GJ","multiplier":1e9,"offset":0,"type":"energy"},
		{"rec20":"3B","name":"megajoule","symbol":"MJ","multiplier":1e6,"offset":0,"type":"energy"},
		{"rec20":"C15","name":"millijoule","symbol":"mJ","multiplier":1e-3,"offset":0,"type":"energy"},
		{"rec20":"A70","name":"femtojoule","symbol":"fJ","multiplier":1e-15,"offset":0,"type":"energy"},
		{"rec20":"A13","name":"attojoule","symbol":"aJ","multiplier":1e-18,"offset":0,"type":"energy"},
		{"rec20":"WHR","name":"watt hour","symbol":"W·h","multiplier":3600,"offset":0,"type":"energy"},
		{"rec20":"MWH","name":"megawatt hour","symbol":"MW·h","multiplier":3.6e9,"offset":0,"type":"energy"},
		{"rec20":"KWH","name":"kilowatt hour","symbol":"kW·h","multiplier":3.6e6,"offset":0,"type":"energy"},
		{"rec20":"GWH","name":"gigawatt hour","symbol":"GW·h","multiplier":3.6e12,"offset":0,"type":"energy"},
		{"rec20":"D32","name":"terawatt hour","symbol":"TW·h","multiplier":3.6e15,"offset":0,"type":"energy"},
		{"rec20":"A53","name":"electronvolt","symbol":"eV","multiplier":1.602176487e-19,"offset":0,"type":"energy"},
		{"rec20":"B71","name":"megaelectronvolt","symbol":"MeV","multiplier":1.602176487e-13,"offset":0,"type":"energy"},
		{"rec20":"A85","name":"gigaelectronvolt","symbol":"GeV","multiplier":1.602176487e-10,"offset":0,"type":"energy"},
		{"rec20":"B29","name":"kiloelectronvolt","symbol":"keV","multiplier":1.602176487e-16,"offset":0,"type":"energy"},
		{"rec20":"A57","name":"erg","symbol":"erg","multiplier":1e-7,"offset":0,"type":"energy"},
		{"rec20":"85","name":"foot pound-force","symbol":"ft·lbf","multiplier":1.355818,"offset":0,"type":"energy"},
		{"rec20":"B38","name":"kilogram-force metre","symbol":"kgf·m","multiplier":9.80665,"offset":0,"type":"energy"},
		{"rec20":"N46","name":"foot poundal","symbol":"ft·pdl","multiplier":4.214011e-2,"offset":0,"type":"energy"},
		{"rec20":"N47","name":"inch poundal","symbol":"in·pdl","multiplier":3.511677e-3,"offset":0,"type":"energy"},
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

		{"rec20":"WTT","name":"watt","symbol":"W","multiplier":1,"offset":0,"type":"power"},
		{"rec20":"KWT","name":"kilowatt","symbol":"kW","multiplier":1e3,"offset":0,"type":"power"},
		{"rec20":"MAW","name":"megawatt","symbol":"MW","multiplier":1e6,"offset":0,"type":"power"},
		{"rec20":"A90","name":"gigawatt","symbol":"GW","multiplier":1e9,"offset":0,"type":"power"},
		{"rec20":"C31","name":"milliwatt","symbol":"mW","multiplier":1e-3,"offset":0,"type":"power"},
		{"rec20":"D80","name":"microwatt","symbol":"µW","multiplier":1e-6,"offset":0,"type":"power"},
		{"rec20":"F80","name":"water horse power","symbol":"water hp	","multiplier":7.46043e2,"offset":0,"type":"power"},
		{"rec20":"A63","name":"erg per second","symbol":"erg/s","multiplier":1e-7,"offset":0,"type":"power"},
		{"rec20":"A74","name":"foot pound-force per second","symbol":"ft·lbf/s","multiplier":1.355818,"offset":0,"type":"power"},
		{"rec20":"B39","name":"kilogram-force metre per second","symbol":"kgf·m/s","multiplier":9.80665,"offset":0,"type":"power"},
		{"rec20":"HJ","name":"metric horse power","symbol":"metric hp","multiplier":735.49875,"offset":0,"type":"power"},
		{"rec20":"A25","name":"cheval vapeur","symbol":"CV","multiplier":735.4988,"offset":0,"type":"power"},
		{"rec20":"BHP","name":"brake horse power","symbol":"BHP","multiplier":745.7,"offset":0,"type":"power"},
		{"rec20":"K15","name":"foot pound-force per hour","symbol":"ft·lbf/h","multiplier":3.766161e-4,"offset":0,"type":"power"},
		{"rec20":"K16","name":"foot pound-force per minute","symbol":"ft·lbf/min","multiplier":2.259697e-2,"offset":0,"type":"power"},
		{"rec20":"K42","name":"horsepower (boiler)","symbol":"boiler hp","multiplier":9809.50,"offset":0,"type":"power"},
		{"rec20":"N12","name":"Pferdestaerke","symbol":"PS","multiplier":735.4988,"offset":0,"type":"power"},

		{"rec20":"COU","name":"coulomb","symbol":"C","multiplier":1,"offset":0,"type":"charge"},
		{"rec20":"A8","name":"ampere second","symbol":"A·s","multiplier":1,"offset":0,"type":"charge"},
		{"rec20":"AMH","name":"ampere hour","symbol":"A·h","multiplier":3600,"offset":0,"type":"charge"},
		{"rec20":"TAH","name":"kiloampere hour (thousand ampere hour)","symbol":"kA·h","multiplier":3600000,"offset":0,"type":"charge"},
		{"rec20":"D77","name":"megacoulomb","symbol":"MC","multiplier":1e6,"offset":0,"type":"charge"},
		{"rec20":"D86","name":"millicoulomb","symbol":"mC","multiplier":1e-3,"offset":0,"type":"charge"},
		{"rec20":"B26","name":"kilocoulomb","symbol":"kC","multiplier":1e3,"offset":0,"type":"charge"},
		{"rec20":"B86","name":"microcoulomb","symbol":"µC","multiplier":1e-6,"offset":0,"type":"charge"},
		{"rec20":"C40","name":"nanocoulomb","symbol":"nC","multiplier":1e-9,"offset":0,"type":"charge"},
		{"rec20":"C71","name":"picocoulomb","symbol":"pC","multiplier":1e-12,"offset":0,"type":"charge"},
		{"rec20":"E09","name":"milliampere hour","symbol":"mA·h","multiplier":3.6,"offset":0,"type":"charge"},
		{"rec20":"N95","name":"ampere minute","symbol":"A·min","multiplier":60,"offset":0,"type":"charge"},
		{"rec20":"N94","name":"franklin","symbol":"Fr","multiplier":3.335641e-10,"offset":0,"type":"charge"},

		{"rec20":"AMP","name":"ampere","symbol":"A","multiplier":1,"offset":0,"type":"current"},
		{"rec20":"B22","name":"kiloampere","symbol":"kA","multiplier":1e3,"offset":0,"type":"current"},
		{"rec20":"H38","name":"megaampere","symbol":"MA","multiplier":1e6,"offset":0,"type":"current"},
		{"rec20":"4K","name":"milliampere","symbol":"mA","multiplier":1e-3,"offset":0,"type":"current"},
		{"rec20":"B84","name":"microampere","symbol":"µA","multiplier":1e-6,"offset":0,"type":"current"},
		{"rec20":"C39","name":"nanoampere","symbol":"nA","multiplier":1e-9,"offset":0,"type":"current"},
		{"rec20":"C70","name":"picoampere","symbol":"pA","multiplier":1e-12,"offset":0,"type":"current"},
		{"rec20":"N96","name":"biot","symbol":"Bi","multiplier":10,"offset":0,"type":"current"},
		{"rec20":"N97","name":"gilbert","symbol":"Gi","multiplier":0.7957747,"offset":0,"type":"current"},	
			
		{"rec20":"OHM","name":"ohm","symbol":"Ω","multiplier":1,"offset":0,"type":"resistance"},
		{"rec20":"A87","name":"gigaohm","symbol":"GΩ","multiplier":1e9,"offset":0,"type":"resistance"},
		{"rec20":"B75","name":"megaohm","symbol":"MΩ","multiplier":1e6,"offset":0,"type":"resistance"},
		{"rec20":"H44","name":"teraohm","symbol":"TΩ","multiplier":1e12,"offset":0,"type":"resistance"},
		{"rec20":"B49","name":"kiloohm","symbol":"kΩ","multiplier":1e3,"offset":0,"type":"resistance"},
		{"rec20":"E45","name":"milliohm","symbol":"mΩ","multiplier":1e-3,"offset":0,"type":"resistance"},
		{"rec20":"B94","name":"microohm","symbol":"µΩ","multiplier":1e-6,"offset":0,"type":"resistance"},
		{"rec20":"P22","name":"nanoohm","symbol":"nΩ","multiplier":1e-9,"offset":0,"type":"resistance"},

		{"rec20":"SIE","name":"siemens","symbol":"S","multiplier":1,"offset":0,"type":"conductance"},
		{"rec20":"B53","name":"kilosiemens","symbol":"kS","multiplier":1e3,"offset":0,"type":"conductance"},
		{"rec20":"C27","name":"millisiemens","symbol":"mS","multiplier":1e-3,"offset":0,"type":"conductance"},
		{"rec20":"B99","name":"microsiemens","symbol":"µS","multiplier":1e-6,"offset":0,"type":"conductance"},
		{"rec20":"N92","name":"picosiemens","symbol":"pS","multiplier":1e-12,"offset":0,"type":"conductance"},
		{"rec20":"NQ","name":"mho","symbol":"mho","multiplier":1,"offset":0,"type":"conductance"},
		{"rec20":"NR","name":"micromho","symbol":"µmho","multiplier":1e-6,"offset":0,"type":"conductance"},
			
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
			
		{"rec20":"MTQ","name":"cubic metre","symbol":"m³","multiplier":1,"offset":0,"type":"volume"},
		{"rec20":"MAL","name":"megalitre","symbol":"Ml","multiplier":1e3,"offset":0,"type":"volume"},
		{"rec20":"LTR","name":"litre","symbol":"l","multiplier":1e-3,"offset":0,"type":"volume"},
		{"rec20":"MMQ","name":"cubic millimetre","symbol":"mm³","multiplier":1e-9,"offset":0,"type":"volume"},
		{"rec20":"CMQ","name":"cubic centimetre","symbol":"cm³","multiplier":1e-6,"offset":0,"type":"volume"},
		{"rec20":"DMQ","name":"cubic decimetre","symbol":"dm³","multiplier":1e-3,"offset":0,"type":"volume"},
		{"rec20":"MLT","name":"millilitre","symbol":"ml","multiplier":1e-6,"offset":0,"type":"volume"},
		{"rec20":"HLT","name":"hectolitre","symbol":"hl","multiplier":1e-1,"offset":0,"type":"volume"},
		{"rec20":"CLT","name":"centilitre","symbol":"cl","multiplier":1e-5,"offset":0,"type":"volume"},
		{"rec20":"DMA","name":"cubic decametre","symbol":"dam³","multiplier":1e3,"offset":0,"type":"volume"},
		{"rec20":"H19","name":"cubic hectometre","symbol":"hm³","multiplier":1e6,"offset":0,"type":"volume"},
		{"rec20":"H20","name":"cubic kilometre","symbol":"km³","multiplier":1e9,"offset":0,"type":"volume"},
		{"rec20":"DLT","name":"decilitre","symbol":"dl","multiplier":1e-4,"offset":0,"type":"volume"},
		{"rec20":"4G","name":"microlitre","symbol":"µl","multiplier":1e-9,"offset":0,"type":"volume"},
		{"rec20":"K6","name":"kilolitre","symbol":"kl","multiplier":1,"offset":0,"type":"volume"},
		{"rec20":"A44","name":"decalitre","symbol":"dal","multiplier":1e-2,"offset":0,"type":"volume"},
		{"rec20":"INQ","name":"cubic inch","symbol":"in³","multiplier":16.387064e-6,"offset":0,"type":"volume"},
		{"rec20":"FTQ","name":"cubic foot","symbol":"ft³","multiplier":2.831685e-2,"offset":0,"type":"volume"},
		{"rec20":"YDQ","name":"cubic yard","symbol":"yd³","multiplier":0.764555,"offset":0,"type":"volume"},
		{"rec20":"GLI","name":"gallon (UK)","symbol":"gal (UK)","multiplier":4.546092e-3,"offset":0,"type":"volume"},
		{"rec20":"GLL","name":"gallon (US)","symbol":"gal (US)","multiplier":3.785412e-3,"offset":0,"type":"volume"},
		{"rec20":"PT","name":"pint (US)","symbol":"pt (US)","multiplier":4.73176e-4,"offset":0,"type":"volume"},
		{"rec20":"PTI","name":"pint (UK)","symbol":"pt (UK)","multiplier":5.68261e-4,"offset":0,"type":"volume"},
		{"rec20":"QTI","name":"quart (UK)","symbol":"qt (UK)","multiplier":1.1365225e-3,"offset":0,"type":"volume"},
		{"rec20":"PTL","name":"liquid pint (US)","symbol":"liq pt (US)","multiplier":4.731765e-4,"offset":0,"type":"volume"},
		{"rec20":"QTL","name":"liquid quart (US)","symbol":"liq qt (US)","multiplier":9.463529e-4,"offset":0,"type":"volume"},
		{"rec20":"PTD","name":"dry pint (US)","symbol":"dry pt (US)","multiplier":5.506105e-4,"offset":0,"type":"volume"},
		{"rec20":"OZI","name":"fluid ounce (UK)","symbol":"fl oz (UK)","multiplier":2.841306e-5,"offset":0,"type":"volume"},
		{"rec20":"QT","name":"quart (US)","symbol":"qt (US)","multiplier":0.9463529e-3,"offset":0,"type":"volume"},
		{"rec20":"J57","name":"barrel (UK petroleum)","symbol":"bbl (UK liq.)","multiplier":0.15911315,"offset":0,"type":"volume"},
		{"rec20":"L43","name":"peck (UK)","symbol":"pk (UK)","multiplier":9.092181e-3,"offset":0,"type":"volume"},
		{"rec20":"L61","name":"pint (US dry)","symbol":"pt (US dry)","multiplier":5.506105e-4,"offset":0,"type":"volume"},
		{"rec20":"L62","name":"quart (US dry)","symbol":"qt (US dry)","multiplier":1.101221e-3,"offset":0,"type":"volume"},
		{"rec20":"L84","name":"ton (UK shipping)","symbol":"British shipping ton","multiplier":1.1893,"offset":0,"type":"volume"},
		{"rec20":"L86","name":"ton (US shipping)","symbol":"(US) shipping ton","multiplier":1.1326,"offset":0,"type":"volume"},
		{"rec20":"OZA","name":"fluid ounce (US)","symbol":"fl oz (US)","multiplier":2.957353e-5,"offset":0,"type":"volume"},
		{"rec20":"BUI","name":"bushel (UK)","symbol":"bushel (UK)","multiplier":3.636872e-2,"offset":0,"type":"volume"},
		{"rec20":"BUA","name":"bushel (US)","symbol":"bu (US)","multiplier":3.523907e-2,"offset":0,"type":"volume"},
		{"rec20":"BLL","name":"barrel (US)","symbol":"barrel (US)","multiplier":158.9873e-3,"offset":0,"type":"volume"},
		{"rec20":"BLD","name":"dry barrel (US)","symbol":"bbl (US)","multiplier":1.15627e-1,"offset":0,"type":"volume"},
		{"rec20":"GLD","name":"dry gallon (US)","symbol":"dry gal (US)","multiplier":4.404884e-3,"offset":0,"type":"volume"},
		{"rec20":"QTD","name":"dry quart (US)","symbol":"dry qt (US)","multiplier":1.101221e-3,"offset":0,"type":"volume"},
		{"rec20":"G26","name":"stere","symbol":"st","multiplier":1,"offset":0,"type":"volume"},
		{"rec20":"G21","name":"cup [unit of volume]","symbol":"cup (US)","multiplier":2.365882e-4,"offset":0,"type":"volume"},
		{"rec20":"G24","name":"tablespoon (US)","symbol":"tablespoon (US)","multiplier":1.478676e-5,"offset":0,"type":"volume"},
		{"rec20":"G25","name":"teaspoon (US)","symbol":"teaspoon (US)","multiplier":4.928922e-6,"offset":0,"type":"volume"},
		{"rec20":"G23","name":"peck","symbol":"pk (US)","multiplier":8.809768e-3,"offset":0,"type":"volume"},
		{"rec20":"M67","name":"acre-foot (based on U.S. survey foot)","symbol":"acre-ft (US survey)","multiplier":1.233489e3,"offset":0,"type":"volume"},
		{"rec20":"M68","name":"cord (128 ft³)","symbol":"cord","multiplier":3.624556,"offset":0,"type":"volume"},
		{"rec20":"M69","name":"cubic mile (UK statute)","symbol":"mi³","multiplier":4.168182e9,"offset":0,"type":"volume"},
		{"rec20":"M70","name":"ton. register ","symbol":"RT","multiplier":2.831685,"offset":0,"type":"volume"},

			
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
			
		{"rec20":"MSK","name":"metre per second squared","symbol":"m/s²","multiplier":1,"offset":0,"type":"acceleration"},
		{"rec20":"A76","name":"gal","symbol":"Gal","multiplier":1e-2,"offset":0,"type":"acceleration"},
		{"rec20":"C11","name":"milligal","symbol":"mGal","multiplier":1e-5,"offset":0,"type":"acceleration"},
		{"rec20":"M38","name":"kilometre per second squared","symbol":"km/s²","multiplier":1e3,"offset":0,"type":"acceleration"},
		{"rec20":"M39","name":"centimetre per second squared","symbol":"cm/s²","multiplier":1e-2,"offset":0,"type":"acceleration"},
		{"rec20":"M41","name":"millimetre per second squared","symbol":"mm/s²","multiplier":1e-3,"offset":0,"type":"acceleration"},
		{"rec20":"A73","name":"foot per second squared","symbol":"ft/s²","multiplier":0.3048,"offset":0,"type":"acceleration"},
		{"rec20":"IV","name":"inch per second squared","symbol":"in/s²","multiplier":0.0254,"offset":0,"type":"acceleration"},
		{"rec20":"K40","name":"standard acceleration of free fall","symbol":"gn","multiplier":9.80665,"offset":0,"type":"acceleration"},
		{"rec20":"M40","name":"yard per second squared","symbol":"yd/s²","multiplier":0.9144,"offset":0,"type":"acceleration"},
		{"rec20":"M42","name":"mile (statute mile) per second squared","symbol":"mi/s²","multiplier":1609.344,"offset":0,"type":"acceleration"},
			
		{"rec20":"HTZ","name":"hertz","symbol":"Hz","multiplier":1,"offset":0,"type":"frequency"},
		{"rec20":"KHZ","name":"kilohertz","symbol":"kHz","multiplier":1.00E+03,"offset":0,"type":"frequency"},
		{"rec20":"MHZ","name":"megahertz","symbol":"MHz","multiplier":1.00E+06,"offset":0,"type":"frequency"},
		{"rec20":"A86","name":"gigahertz","symbol":"GHz","multiplier":1.00E+09,"offset":0,"type":"frequency"},
		{"rec20":"D29","name":"terahertz","symbol":"THz","multiplier":1.00E+12,"offset":0,"type":"frequency"},

		{"rec20":"SEC","name":"second","symbol":"s","multiplier":1,"offset":0,"type":"time"},
		{"rec20":"MIN","name":"minute","symbol":"min","multiplier":60,"offset":0,"type":"time"},
		{"rec20":"HUR","name":"hour","symbol":"h","multiplier":3600,"offset":0,"type":"time"},
		{"rec20":"DAY","name":"day","symbol":"d","multiplier":86400,"offset":0,"type":"time"},
		{"rec20":"B52","name":"kilosecond","symbol":"ks","multiplier":1e3,"offset":0,"type":"time"},
		{"rec20":"C26","name":"millisecond","symbol":"ms","multiplier":1e-3,"offset":0,"type":"time"},
		{"rec20":"H70","name":"picosecond","symbol":"ps","multiplier":1e-12,"offset":0,"type":"time"},
		{"rec20":"B98","name":"microsecond","symbol":"µs","multiplier":1e-6,"offset":0,"type":"time"},
		{"rec20":"C47","name":"nanosecond","symbol":"ns","multiplier":1e-9,"offset":0,"type":"time"},
		{"rec20":"WEE","name":"week","symbol":"wk","multiplier":6.048e5,"offset":0,"type":"time"},
		{"rec20":"MON","name":"month","symbol":"mo","multiplier":2.629800e6,"offset":0,"type":"time"},
		{"rec20":"ANN","name":"year","symbol":"y","multiplier":3.15576e7,"offset":0,"type":"time"},
		{"rec20":"D42","name":"tropical year","symbol":"y (tropical)","multiplier":3.1556925e7,"offset":0,"type":"time"},
		{"rec20":"L95","name":"common year","symbol":"y (365 days)","multiplier":3.1536e7,"offset":0,"type":"time"},
		{"rec20":"L96","name":"sidereal year","symbol":"y (sidereal)","multiplier":3.155815e7,"offset":0,"type":"time"},
		{"rec20":"M56","name":"shake","symbol":"shake","multiplier":1e-8,"offset":0,"type":"time"},			
			
		{"rec20":"VLT","name":"volt","symbol":"V","multiplier":1,"offset":0,"type":"voltage"},
		{"rec20":"N99","name":"picovolt","symbol":"pV","multiplier":1.00E-12,"offset":0,"type":"voltage"},
		{"rec20":"2Z","name":"millivolt","symbol":"mV","multiplier":1.00E-03,"offset":0,"type":"voltage"},
		{"rec20":"B78","name":"megavolt","symbol":"MV","multiplier":1.00E+06,"offset":0,"type":"voltage"},
		{"rec20":"D82","name":"microvolt","symbol":"µV","multiplier":1.00E-06,"offset":0,"type":"voltage"},
		{"rec20":"KVT","name":"kilovolt","symbol":"kV","multiplier":1000,"offset":0,"type":"voltage"},
			
		{"rec20":"FAR","name":"farad","symbol":"F","multiplier":1,"offset":0,"type":"capacitance"},
		{"rec20":"H48","name":"attofarad","symbol":"aF","multiplier":1e-18,"offset":0,"type":"capacitance"},
		{"rec20":"C10","name":"millifarad","symbol":"mF","multiplier":1e-3,"offset":0,"type":"capacitance"},
		{"rec20":"4O","name":"microfarad","symbol":"µF","multiplier":1e-6,"offset":0,"type":"capacitance"},
		{"rec20":"C41","name":"nanofarad","symbol":"nF","multiplier":1e-9,"offset":0,"type":"capacitance"},
		{"rec20":"4T","name":"picofarad","symbol":"pF","multiplier":1e-9,"offset":0,"type":"capacitance"},
		{"rec20":"N90","name":"kilofarad","symbol":"kF","multiplier":1e3,"offset":0,"type":"capacitance"},

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
