# FelixArch

# Installation

FelixArch is installed by adding the following dependency to your build.gradle file:

```
dependencies {
    implementation "com.felix.arch:felix-arch:1.0.0"
}
```
if you only want the utils you can add the following dependency to your build.gradle file:

```
dependencies {
    implementation "com.felix.utils:felix-utils:1.0.0"
}
```

Snapshots of the development version are available in Sonatype's snapshots repository, you can include on your gradle project through:

```
repositories {
    maven { url 'https://dl.bintray.com/felix-maven/maven' }
}
```
