package lab3;

public class Remote {

        private TV tv;

        public Remote(TV tv) {
            this.tv = tv;
        }
        public void changeChannelUp() {
            if (tv.isOn() && tv.getChannel() < 20) {
                tv.setChannel(tv.getChannel() + 1);
            }
        }

        public void changeChannelDown() {
            if (tv.isOn() && tv.getChannel() > 1) {
                tv.setChannel(tv.getChannel() - 1);
            }
        }

        public void increaseVolume() {
            if (tv.isOn() && tv.getVolume() < 10) {
                tv.setVolume(tv.getVolume() + 1);
            }
        }

        public void decreaseVolume() {
            if (tv.isOn() && tv.getVolume() > 1) {
                tv.setVolume(tv.getVolume() - 1);
            }
        }

        public void turnOn() {
            tv.setOn(true);
        }

        public void turnOff() {
            tv.setOn(false);
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
        public static void main(String[] args){
            TV tv = new TV();
            lab3.Remote remote = new lab3.Remote(tv);
            //fix this ~!
            remote.turnOn();


            remote.changeChannelUp();
            remote.increaseVolume();


            remote.turnOff();

        }
    }

