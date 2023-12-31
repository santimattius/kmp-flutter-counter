# KMP Compose Skeleton using Amper
Basic Compose Multiplaform app using Flutter Counter Example.

![kmp-flutter-counter](https://github.com/santimattius/kmp-flutter-counter/assets/22333101/50adaf00-957b-41fb-8ff2-d514ef7696d5)

## Check your IDE

* Use [IntelliJ IDEA 2023.3 EAP](https://www.jetbrains.com/idea/nextversion/) version 2023.3 Beta (233.11799) or higher with Amper plugin for JVM and Android projects.
* Use [JetBrains Fleet](https://www.jetbrains.com/fleet/) version 1.26.104 or higher for JVM, Android, and Kotlin Multiplatform projects.
 
The best way to get the most recent IDE versions is by using the [Toolbox App](https://www.jetbrains.com/lp/toolbox/).

Fleet 1.26 comes with Amper plugin.

If you use IntelliJ IDEA, install the Amper plugin: ![](images/ij-plugin.png)


## Prepare the environment
- Install and configure the latest JDK 17+.
- If you have Gradle installed, make sure you use Gradle 8.1 or later.
- Install and configure the latest Android Studio for Android samples.
- Install and configure the latest Xcode for iOS samples.

Use the [KDoctor](https://github.com/Kotlin/kdoctor) tool to ensure that your development environment is configured correctly:

1. Install KDoctor with [Homebrew](https://brew.sh/):

    ```text
    brew install kdoctor
    ```

2. Run KDoctor in your terminal:

    ```text
    kdoctor
    ```

   If everything is set up correctly, you'll see valid output:

   ```text
   Environment diagnose (to see all details, use -v option):
   [✓] Operation System
   [✓] Java
   [✓] Android Studio
   [✓] Xcode
   [✓] Cocoapods
   
   Conclusion:
     ✓ Your system is ready for Kotlin Multiplatform Mobile development!
   ```

Otherwise, KDoctor will highlight which parts of your setup still need to be configured and will suggest a way to fix
them.


- Try opening [an example project](../examples/jvm-hello-world) in IntelliJ IDEA or in Fleet. 
  You should get completion in the module.yaml files:
  ![](images/amper-in-ij.png)
  ![](images/amper-in-fleet.png)

