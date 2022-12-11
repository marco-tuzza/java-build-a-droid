/* 
This is the Droid class, which represents a simple droid that can perform tasks
and has a battery level that decreases as it performs tasks. The battery can be
recharged, and the droid will shut down when the battery is drained.
*/
class Droid {
    // The name of the droid
    String name;
    // The current battery level of the droid
    int batteryLevel;
    // Whether the droid is currently active or not
    boolean active;

    /* 
    Constructor for the Droid class
    Takes in the name of the droid as a parameter
    Initializes the name, battery level, and active status of the droid
    */
    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
        active = true;
    }

  // Returns a string representation of the droid
    public String toString() {
        // Initialize the active status of the droid as an empty string
        String activeStatus = "";
        // If the droid is active, set the active status to "active"
        if (active) {
        activeStatus = "active";
        // Otherwise, set the active status to "not active"
        } else {
        activeStatus = "not active";
        }
        // Return the string representation of the droid
        return "Hello, I'm " + name + " and I'm actually " + activeStatus;
    }

    /* 
    Performs the given task with the droid
    If the droid is active, it will perform the task and update its battery level
    If the droid is not active, it will print a message stating that it needs to be recharged
    */
    public void performTask(String task) {
        // If the droid is active
        if (active) {
        // Print a message indicating that it is performing the task
        System.out.println(name + " is performing task: " + task);
        // Decrease the battery level by 10
        batteryLevel = batteryLevel - 10;
        // Check the current energy level of the droid
        energyReport();
        // If the droid is not active
        } else {
        // Print a message stating that it needs to be recharged
        System.out.println(name + " need to be recharged");
        }
    }

    /* 
    Reports the current battery level of the droid
    If the battery level is 0 or less, it will shut down the droid
    */
    public void energyReport() {
        // Print the current battery level
        System.out.println("Battery level is: " + batteryLevel);
        // If the battery level is 0 or less
        if (batteryLevel <= 0) {
        // Shut down the droid
        shutDown();
        }
    }

    /* 
    Recharges the battery of the droid
    Sets the battery level to 100 and the active status to true
    */
    public void recharge() {
        // Print a message indicating that the droid is recharging
        System.out.println(name + " is recharging...");
        // Set the battery level to 100
        batteryLevel = 100;
        // Set the active status to true
        active = true;
        // Print a message indicating that the droid is charged
        System.out.println(name + " is charged!");
    }

    /*
    Shuts down the droid
    Sets the active status to false
    */
    public void shutDown() {
        // Print a message indicating that the droid is shutting down
        System.out.println(name + " is shutting down");
        // Set the active status to false
        active = false;
    }

    // Main method that creates a new droid and performs some tasks with it
    public static void main(String[] args) {
        // Create a new Droid instance with the name "Codey"
        Droid codey = new Droid("Codey");
        // Print the string representation of the droid
        System.out.println(codey);
        // Perform the "dancing" task 10 times
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        codey.performTask("dancing");
        // Print the string representation of the droid again
        System.out.println(codey);
        // Recharge the droid's battery
        codey.recharge();
        // Perform the "dancing" task again
        codey.performTask("dancing");
    }
}