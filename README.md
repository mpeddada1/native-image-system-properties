# native-image-system-properties

Run `mvn test -P native` at the root directory:

```
com.example.SimpleTest > simpleTest FAILED


Failures (1):
  JUnit Vintage:SimpleTest:simpleTest
    MethodSource [className = 'com.example.SimpleTest', methodName = 'simpleTest', methodParameterTypes = '']
    => expected: hello
but was : null
       com.google.common.truth.FailureMetadata.fail(FailureMetadata.java:192)
       com.google.common.truth.Subject.doFail(Subject.java:1186)
       com.google.common.truth.Subject.failEqualityCheckNoComparisonFailure(Subject.java:986)
       com.google.common.truth.Subject.failEqualityCheck(Subject.java:865)
       com.google.common.truth.Subject.standardIsEqualTo(Subject.java:175)
       com.google.common.truth.Subject.isEqualTo(Subject.java:169)
       com.example.SimpleTest.simpleTest(SimpleTest.java:16)
       java.lang.reflect.Method.invoke(Method.java:566)
       [[Testing framework: 30 frames collapsed (https://goo.gl/aH3UyP)]].(:0)
       org.graalvm.junit.platform.NativeImageJUnitLauncher.execute(NativeImageJUnitLauncher.java:74)
       [...]

```
