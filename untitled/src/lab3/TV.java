package lab3;

public class TV {
    private int channel;
    private int volume;
    private boolean on;

    private boolean off;

    public TV() {
        this.channel = 1;
        this.volume = 5;
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

    public boolean isOff(){
        return off;
    }

    public void  setOff(boolean off){
        this.off = off;
    }
}
