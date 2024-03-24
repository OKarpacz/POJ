package lab3;

public class TV {
    private int channel;
    private int volume;
    private boolean on;

    public TV() {
        this.channel = 1;
        this.volume = 50;
        this.on = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
