# LambdA
A platform that helps small-scale MSME owners list franchises and enables users to purchase them.

## Working of Kotlin Multiplatform 
- The Kotlin compiler produces different outputs for each target platform:
    - JVM bytecode for Android and server-side applications
    - Native code for iOS and other native platforms
![image](https://github.com/user-attachments/assets/e012125b-0cf0-47ad-b516-c3b8b198f7b9)



## Project Structure of Kotlin Multiplatform 
- it consists of 3 module i.e androidApp, iosApp, shared
- Shared module is connected with androidApp using Gradle and for iosApp, the shared module is compiled into a framework using a Gradle task, which is then integrated into the Xcode project.
![image](https://github.com/user-attachments/assets/28a1afb6-be83-4ca4-bcac-44ec3536f397)


## Architecture of Kotlin Multiplatform
![image](https://github.com/user-attachments/assets/4ac920f6-8cf8-4ea3-80b6-b4127ea4182c)

This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


