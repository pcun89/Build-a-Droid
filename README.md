# Build a Droid
 # Droid Java Class

This Java class, "Droid," models the state and behavior of robots. It includes instance fields for the droid's name and battery level, along with methods for performing tasks, stating the battery level, reporting energy levels, and transferring energy between instances.

## Getting Started

1. Clone the repository to your local machine:

    ```
    git clone https://github.com/pcun/Build-a-Droid.git
    cd DroidClass
    ```

2. Compile and run the Java program:

    ```
    javac Droid.java
    java Droid
    ```

3. Explore the interactions and behaviors of droids in the `main` method.

## Class Overview

- **Instance Fields:**
  - `batteryLevel` (integer): Stores the droid's battery level.
  - `name` (String): Stores the droid's name.

- **Constructor:**
  - `Droid(String droidName)`: Initializes a new Droid instance with the given name and a default battery level of 100.

- **Methods:**
  - `toString()`: Returns a string introducing the droid.
  - `performTask(String task)`: Simulates the droid performing a task and decreases its battery level.
  - `energyReport()`: Prints the droid's current battery level.
  - `energyTransfer(Droid otherDroid)`: Transfers energy between two droids.

## Examples

Explore the provided examples in the `main` method to understand how droids are created, perform tasks, and transfer energy.

Feel free to experiment with additional instances and methods to enhance your understanding of the Droid class.


