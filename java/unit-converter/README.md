#### Overview
> A Java Implementation of UnitConverterUNECERec20 written in Javasciprt [LINK](https://github.com/mgh128/UnitConverterUNECERec20)

#### How to use
1. Create an instance of 40 Unit Classes such as Pressure, Temperature, Torque, etc. under the following package [Link](https://github.com/JaewookByun/UnitConverterUNECERec20/tree/master/java/unit-converter/src/main/java/org/oliot/unit_converter/unit)
```java
Temperature t = new Temperature(Temperature.Type.CEL, 100.0);
```
> As shown in the example above, there are many units of measure indicating same physical phenomenon.
> For example, kelvin, Fahrenheit, Celsius, etc. for a temperature value.
> You can indicate the value with an enum value of Type [Link](https://github.com/JaewookByun/UnitConverterUNECERec20/blob/master/java/unit-converter/src/main/java/org/oliot/unit_converter/unit/Temperature.java) of a Unit Classes where each one is documentized.
2. Create an instance of UnitConverter<E> where E indicates one of 40 Unit Classes such as UnitConverter<Temperature>
```java
Temperature t = new Temperature(Temperature.Type.CEL, 100.0);
UnitConverter<Temperature> c = new UnitConverter<Temperature>();
```
3.
   (a). Convert the value with the given unit and utilize it (see the Junit test code [Link](https://github.com/JaewookByun/UnitConverterUNECERec20/blob/master/java/unit-converter/src/test/java/org/oliot/unit_converter/TemperatureTest.java))
```java
Temperature t = new Temperature(Temperature.Type.CEL, 100.0);
UnitConverter<Temperature> c = new UnitConverter<Temperature>();
c.convert(t, Temperature.Type.KEL);
t.getValue(); // 373.15  
```
  (b). Return all the available representation of the given unit
```java
Temperature t = new Temperature(Temperature.Type.CEL, 100.0);
UnitConverter<Temperature> c = new UnitConverter<Temperature>();
c.convert(t);
```
```javascript
[
 {
  "symbol": "K",
  "name": "kelvin",
  "rec20": "KEL",
  "value": 373.15
 },
 {
  "symbol": "ºF",
  "name": "degrees Fahrenheit",
  "rec20": "FAH",
  "value": 211.99999999999997
 },
 {
  "symbol": "ºC",
  "name": "degrees Celsius",
  "rec20": "CEL",
  "value": 100
 },
 {
  "symbol": "ºR",
  "name": "degrees Rankine",
  "rec20": "A48",
  "value": 671.67
 }
]
```
  (c). Return all the available types of a specific unit
```java
Temperature.getRec20Types();
```
