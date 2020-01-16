# Roman Number Converter

Use the `convert` method of `RomanNumbersConverter` class to get the converted Roman numbers.

usage:
```java
...
RomanNumberConverter converter = new RomanNumberConverter();

int number = 5;
String romanNumber = String result = converter.convert(number);
...
```

outcome of `converter` method:
* returns the expected Roman number as `String`.
* throws a `NumberFormatException` in case of nonpositive numbers.
