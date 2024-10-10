package lesson12.task_12_01;

public class AppMain {

    public static void main(String[] args) {
        Phone phone = new Phone();

        WiredHeadphones wiredHeadphones = new WiredHeadphones("Sony", "WH-1000XM4");
        WirelessHeadphones wirelessHeadphones = new WirelessHeadphones("Apple", "AirPods Pro");

        phone.connect(wiredHeadphones);  // Подключение проводных наушников
        phone.connect(wirelessHeadphones);  // Подключение беспроводных наушников
    }
}
