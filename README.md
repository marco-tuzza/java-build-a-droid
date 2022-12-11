# Droid Class
The `Droid` class is a simple Java class that represents a droid, which is a type of robot. The class has several methods that allow users to perform tasks with the droid, check its battery level, recharge it, and shut it down.
## Instantiating a Droid
To create a new `Droid` instance, you can use the following code:
```java
Droid codey = new Droid("Codey");
```
This will create a new `Droid` instance with the name "Codey".
## Performing Tasks with the Droid
To perform a task with the `Droid`, you can use the `performTask` method. This method takes in the task as a string parameter and performs the task if the droid is active. For example, the following code will perform the "dancing" task with the droid:
```java
codey.performTask("dancing");
```
Every time the `performTask` method is called, the battery level of the droid will be decreased by 10. If the battery level reaches 0 or below, the droid will shut down and can no longer perform tasks.
## Checking the Battery Level of the Droid
To check the current battery level of the droid, you can use the `energyReport` method. This method will print the current battery level of the droid to the console.
```java
codey.energyReport();
```
## Recharging the Droid
To recharge the droid, you can use the `recharge` method. This method will set the battery level to 100 and the active status to true.
```java
codey.recharge();
```
## Shutting Down the Droid
To shut down the droid, you can use the `shutDown` method. This method will set the active status of the droid to false, which means it will no longer be able to perform tasks.
```java
codey.shutDown();
```
## Getting the String Representation of the Droid
To get the string representation of the droid, you can use the `toString` method. This method will return a string with the name and active status of the droid.
```java
System.out.println(codey.toString());
```
This will print a string like "Hello, I'm Codey and I'm actually active" to the console.
