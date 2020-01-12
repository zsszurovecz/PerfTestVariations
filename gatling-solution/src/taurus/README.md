# Getting Started

### Preconditions

#### Install Taurus

```brew install bzt```

### Running load test with Taurus
#### Prerequisite
###### Have functional Demo application up and running
###### Needed variables added to the ___exampleTaurusScalaSimulation.yml___

#### Execution
```bzt exampleTaurusPureSimulation.yml```

___
### FAQ
#### How to solve console screen failure error

__Error__ Console screen failure: ord() expected string of length 1, but int found

__Option to fix 1:__
Run bzt command in your IntelliJ terminal

__Option to fix 2:__
Use the following commmand _(to open a new terminal to see the results in action)_:
```bzt -o modules.console.screen=gui ./exampleTaurusPureSimulation.yml```

