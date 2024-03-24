package lab3;
import java.util.Scanner;

public class Remote {

    private TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void changeChannelUp() {
        if (tv.isOn() && tv.getChannel() < 20) {
            tv.setChannel(tv.getChannel() + 1);
        } else {
            System.out.println("Telewizor jest wyłączony lub już jesteś na ostatnim kanale.");
        }
    }

    public void changeChannelDown() {
        if (tv.isOn() && tv.getChannel() > 1) {
            tv.setChannel(tv.getChannel() - 1);
        } else {
            System.out.println("Telewizor jest wyłączony lub już jesteś na pierwszym kanale.");
        }
    }

    public void increaseVolume() {
        if (tv.isOn() && tv.getVolume() < 10) {
            tv.setVolume(tv.getVolume() + 1);
        } else {
            System.out.println("Telewizor jest wyłączony lub osiągnięto maksymalną głośność.");
        }
    }

    public void decreaseVolume() {
        if (tv.isOn() && tv.getVolume() > 1) {
            tv.setVolume(tv.getVolume() - 1);
        } else {
            System.out.println("Telewizor jest wyłączony lub jesteś na minimalnej głośności.");
        }
    }

    public void turnOn() {
        tv.setOn(true);
        System.out.println("Telewizor został włączony.");
    }

    public void turnOff() {
        tv.setOn(false);
        System.out.println("Telewizor został wyłączony.");
    }

    public void setChannel(int channel) {
        if (tv.isOn()) {
            tv.setChannel(channel);
        } else {
            System.out.println("Włącz najpierw telewizor!");
        }
    }

    public void setVolume(int volume) {
        if (tv.isOn()) {
            tv.setVolume(volume);
        } else {
            System.out.println("Włącz najpierw telewizor!");
        }
    }

    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        System.out.println("\nHELLO TV");
        System.out.println("+ Increase Volume");
        System.out.println("- Decrease Volume");
        System.out.println("> Next Channel");
        System.out.println("< Previous Channel");
        System.out.println("S Set Channel");
        System.out.println("O Turn On");
        System.out.println("F Turn Off");

        Scanner scanner = new Scanner(System.in);
//needs a fix
        while (true) {
            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case '+':
                    remote.increaseVolume();
                    break;
                case '-':
                    remote.decreaseVolume();
                    break;
                case '>':
                    remote.changeChannelUp();
                    break;
                case '<':
                    remote.changeChannelDown();
                    break;
                case 'S':
                    System.out.print("Enter channel number: ");
                    int channel = scanner.nextInt();
                    remote.setChannel(channel);
                    break;
                case 'O':
                    remote.turnOn();
                    break;
                case 'F':
                    remote.turnOff();
                    break;
                default:
                    System.out.println("Invalid choice!");

            }
        }
    }
}

