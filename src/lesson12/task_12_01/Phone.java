package lesson12.task_12_01;

public class Phone {
    public void connect(WiredHeadphones wh) {
        System.out.println("Connected " + wh.getDetails() + " " + "wiredheadphone");
    }

    public void connect(WirelessHeadphones wh) {
        System.out.println("Connected " + wh.getDetails() + " " + "wirelessheadphone");
    }
}
