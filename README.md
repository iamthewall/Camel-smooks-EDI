Camel-EDIFACT-Transformations
===========
This example that is based on a customer's proof of concept, transform EDI files to XML and CSV.

1. Both use cases are published in this repo.
2. Both use cases are supported for running in Red Hat JBoss Fuse 6.1

1. Deploying Projects in Red Hat JBoss Fuse
================
0. Download smooks-all project located at https://github.com/smooks/smooks/blob/master/smooks-all/
1. mvn install
2. copy all the dependencies listed in the file target/test-classes/features.xml to your OSGI Containers deploy directory.
3. copy target/milyn-smooks-all-<version>.jar to your OSGi containers deploy directory.
4. Build and deploy both projects and deploy then in Fuse

