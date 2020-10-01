# KmmCalc

I got this code from https://github.com/JetBrains/kotlin-native/tree/master/samples/calculator

| Android | iOS |  
| ------------------ | --------------------------- | 
|<img src="https://raw.githubusercontent.com/Foso/KmmCalc/master/docs/android.png" height="400" alt="Screenshot"/> | <img src="https://raw.githubusercontent.com/Foso/KmmCalc/master/docs/iphone.png" height="400" alt="Screenshot"/>  | 

## Shared

Common Kotlin module contains arithmetic expressions parser.

## iOS
The iOS project compiles Kotlin module to a framework (see [iosApp](iosApp/)). The framework can be easily included in an existing iOS project (e.g. written in Swift or Objective-C)

The iOS application is written in Swift. It uses Kotlin module as a library.
Kotlin module is built into Objective-C framework by invoking Gradle
from custom "Run Script" build phase, and this framework is imported into
the Xcode project.
