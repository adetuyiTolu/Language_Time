# Language_Time

A library that converts Time to its equivalent local languages starting with three basic Nigeria languages(Yoruba, Hausa and Igbo) 

## Setting up

### Dependency

*  Maven
```groovy
<dependency>
  <groupId>com.crevation.NgTime</groupId>
  <artifactId>crev-NgTime</artifactId>
  <version>0.1</version>
  <type>pom</type>
</dependency>
```

*  Gradle
```groovy
compile 'com.crevation.NgTime:crev-NgTime:0.1'
```

## Usage

```java

	//instatntiate the language of your choice, Yoruba in this case
 	Time yoruba = new Yoruba();

	//you can as well use other languages available
        Time igbo = new Igbo();
        Time hausa = new Hausa();

        String yorubaTime = yoruba.getTime("4:00");
        String currentTime = yoruba.getCurrentTime();
        String calendarTime = yoruba.getTime(Calendar.getInstance());
        String dateTime = yoruba.getTime(new Date());   
```
## Test

There is a local unit test class [here](nglocaltimes/src/test/java/com/crevation/nglocaltime/LanguageUnitTest.java) in the test folder

## Contributors
* [Adetuyi Tolu Emmanuel](https://twitter.com/AdetuyiTolu) Developer
* [Idorenyin Obong](https://twitter.com/kingidee) Developer
* [Iliya Kazah Daniel](https://www.facebook.com/iliya.daniel.9843) Hausa instructor

## Contributions

	Thank you for showing interest to contribute to this project, we are looking forward to
	adding more languages, Efik is already in pipeline
All you need to do is:
* Provide translation rules for the language to be added, see [English Constants](nglocaltimes/src/main/java/com/crevation/nglocaltime/english/Constants.java) for sample.

* [Email us](mailto:tolu.adetuyi@gmail.com) for more information
	
## License

   Copyright 2017 Adetuyi Tolu Emmanuel

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at [Apache license 2.0](http://www.apache.org/licenses/LICENSE-2.0)

