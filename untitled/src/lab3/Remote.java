package lab3;
import java.util.Scanner;

public class Remote {

    private TV tv;

    public Remote(TV tv) {
        this.tv = tv;
    }

    public void changeChannelUp() {
        if (tv.isOn() && tv.getChannel() < 10) {
            tv.setChannel(tv.getChannel() + 1);
        } else {
            System.out.println("The TV is off or your are on the last channel.");
        }
    }

    public void changeChannelDown() {
        if (tv.isOn() && tv.getChannel() > 1) {
            tv.setChannel(tv.getChannel() - 1);
        } else {
            System.out.println("The TV is off or your are on the first channel.");
        }
    }

    public void increaseVolume() {
        if (tv.isOn() && tv.getVolume() < 10) {
            tv.setVolume(tv.getVolume() + 1);
        } else {
            System.out.println("The TV is off or your Volume is on MAX");
        }
    }

    public void decreaseVolume() {
        if (tv.isOn() && tv.getVolume() >= 1) {
            tv.setVolume(tv.getVolume() - 1);
        } else {
            System.out.println("The TV is off or your Volume is on MIN");
        }
    }

    public void turnOn() {
        tv.setOn(true);
        System.out.println("The TV has been turned ON");
    }

    public void turnOff() {
        tv.setOn(false);
        System.out.println("The TV has been turned OFF");
    }


    public void setVolume(int volume) {
        if (tv.isOn()) {
            tv.setVolume(volume);
        } else {
            System.out.println("Turn on the TV first");
        }
    }
    public void displayStatus() {
        if (tv.isOn()) {
            System.out.println("Current Channel: " + tv.getChannel());
            System.out.println("Current Volume: " + tv.getVolume());
        } else {
            System.out.println("Turn on the TV first");
        }
    }

    public static void main(String[] args) {
        TV tv = new TV();
        Remote remote = new Remote(tv);

        System.out.println("\n    HELLO TV");
        System.out.println("> Next Channel");
        System.out.println("< Previous Channel");
        System.out.println("+ Increase Volume");
        System.out.println("- Decrease Volume");
        System.out.println("O Turn On");
        System.out.println("F Turn Off");
        System.out.println("D Display TV Settings");

        Scanner scanner = new Scanner(System.in);

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
                case 'O':
                    remote.turnOn();
                    break;
                case 'F':
                    remote.turnOff();
                    break;
                case 'D':
                    remote.displayStatus();
            }
        }
    }
}

