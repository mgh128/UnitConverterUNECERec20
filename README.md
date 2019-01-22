# UnitConverterUNECERec20
Javascript library for converting quantitative values expressed using UN ECE Recommendation 20 unit codes

## Installation

Include the JavaScript file   UnitConverterUNECERec20.js   from the source folder /src

e.g.  

```html
<script src="UnitConverterUNECERec20.js">
```
  
## Basic Usage

Create a new instance of the UnitConverterUNECERec20.js class as follows:

```js
var units=new UnitConverterUNECERec20();
```

## Convert quantitative value from one unit of measure to a different specified unit

```js
var units=new UnitConverterUNECERec20();

var result=convert({"FAH",212},"CEL");

// convert 212 degrees Fahrenheit to degrees Celsius gives result=100
```

## Find related units for the same physical property

```js
var units=new UnitConverterUNECERec20();

var relatedUnits=relatedUnits("ATM");

// find related units for "ATM" (atmospheres) 
// returns other units of pressure, ["ATM","BAR","HN","J89","MBR","PAL","PS"]
```

## Convert quantitative value from one unit of measure to multiple units of the same physical property

```js
var units=new UnitConverterUNECERec20();

var result=multiconvert({"CEL",100});

// convert 100 degrees Celsius into other temperature units 
// result:  {"KEL":373.15,"FAH":211.99999999999997,"CEL":100,"A48":671.67}
```


