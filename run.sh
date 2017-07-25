#!/bin/bash
java -XX:+UnlockCommercialFeatures -XX:+FlightRecorder -XX:StartFlightRecording=settings=profile,duration=30s,dumponexit=true,filename=tdigest-24-7-2017-attempt1.jfr -Xmx8g -Xms8g -cp .:target/TDigest-1.0-SNAPSHOT.jar:classes:target/classes:target/test-classes:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore TestTdigest
