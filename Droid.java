public class Droid {

//    The Droid.java file is empty.
//
//    Start by defining the class Droid.
//
//    Don’t forget to include a main() method! You can leave it empty for now.
//
//    We want a Droid object that has the following state:
//
//    name
//    battery level
//    and the following behavior:
//
//    performing a task
//    stating its battery level
    String name;
    int batteryLvl;

    public Droid(String droidName){
        name = droidName;
        batteryLvl = 100;
    }

    public void performTask(String task){
        System.out.println("Performing task: " + task);
        int energyUpdated;
        energyUpdated = batteryLvl - 10;
        batteryLvl = energyUpdated;
    }

    public void energyReport(){
        System.out.println("My battery level is at: " + batteryLvl + "%");
    }

    public static void main(String[] args) {
        Droid droidOne = new Droid("Codey");
        System.out.println(droidOne);
        droidOne.performTask("Play guitar");
        droidOne.energyReport();
        droidOne.performTask("Dance");
        droidOne.energyReport();
    }

    public String toString(){
        return "Hellow! My name is " + name + "! I'm your assistant, how may I help you today?";
    }
}
