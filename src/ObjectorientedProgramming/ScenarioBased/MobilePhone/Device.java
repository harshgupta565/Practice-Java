package ObjectorientedProgramming.ScenarioBased.MobilePhone;

public class Device {
    void start(){
        System.out.println("Device is starting ");
    }
    abstract class feature{
        abstract void  start();
    }

    public static void main(String[] args) {
        Device device = new Android ();
        device.start();
    }
}
