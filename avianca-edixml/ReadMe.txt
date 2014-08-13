Camel Router Spring Project
===========================

To build this project use

    mvn install

To run this example either embed the jar inside Spring
or to run the route from within Maven try

    mvn camel:run

For more help see the Apache Camel documentation

    http://camel.apache.org/

    
- Deploying Smooks on OSGI (important)
	https://github.com/smooks/smooks/blob/master/smooks-all/
 
================
1. mvn install
2. copy all the dependencies listed in the file target/test-classes/features.xml to your OSGI Containers deploy directory.
3. copy target/milyn-smooks-all-<version>.jar to your OSGi containers deploy directory.

Apache Karaf/
==================================
You can install the target/test-classes/feature.xml file directly into Karaf by using:
karaf@root> features:addUrl mvn:org.milyn/milyn-smooks-all/PACKAGE-VERSION/xml/features
karaf@root> features:install smooks