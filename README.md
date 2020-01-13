# Performance testing variations

In this project you can find different type of solution for performance measurements.

## Tested application

There is a very simple spring based web application in the demo-webapp module. 
You can start it easily with a ./gradlew bootRun command

## TAURUS

### How to install Taurus

```brew install bzt```

### FAQ
#### How to solve console screen failure error

__Error__ Console screen failure: ord() expected string of length 1, but int found

__Option to fix 1:__
Run bzt command in your IntelliJ terminal

__Option to fix 2:__
Use the following commmand _(to open a new terminal to see the results in action)_:
```bzt -o modules.console.screen=gui ./exampleTaurusPureSimulation.yml```

### Solution 1 - Taurus executes JMeter

Taurus is a nice tool to execute your existing JMeter test cases without any JMeter knowledge or installed JMeter libary.

#### Execution
```bzt exampleTaurusJmeterSimulation.yml```

### Solution 2 - Taurus executes pure YAML

#### Execution
```bzt exampleTaurusPureSimulation.yml```

### Solution 3 - Taurus executes Gatling test

#### Execution
```bzt exampleTaurusScalaSimulation.yml```

## JMH

Allow to measure micro benchmarks on the code

See: http://openjdk.java.net/projects/code-tools/jmh/

You can find an example in  ___com.instructure.perftestpoc.jmh.LoopBechmark___ class under the jmh-solution module. (in pair with other samples)

#### Execution
Execute ```jmh``` gradle task

## JUnitPerf

Allow the junit tests to operate as performance tests and trigger the end points of the application.

See: https://github.com/authorjapps/zerocode

You can find an example in ___com.github.noconnor.junitperf.example.ExampleSuccessTests___ class under the junitPerf-solution module. (in pair with other samples)

#### Execution
Execute ```test``` gradle task of junitPer-solution module or execute the tests separately. 