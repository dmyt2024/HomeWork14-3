package app;

import app.Implement.Device;

public class MainClass {
    public static void main(String[] args) {

        Device dev = new Device();
        Device.Message mass = new Device.Message(null, null);
        dev.print(mass);

    }
}
