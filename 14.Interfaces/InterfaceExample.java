class Phone {
    public void call() {
        System.out.println("Basic Call");
    }
    public void sms() {
        System.out.println("Basic SMS");
    }
}
interface Icamera {
    void click();
    void record();
}
interface ImusicPlayer {
    void play();
    void pause();
    void stop();
}
class SmartPhone extends Phone implements Icamera,ImusicPlayer {
    public void call() {
        System.out.println("Smart Call");
    }
    public void sms() {
        System.out.println("Smart SMS");
    }
    public void videocall() {
        System.out.println("Smart-Video Call");
    }

    public void click() {
        System.out.println("Camera Click");
    }
    public void record() {
        System.out.println("Camera Record");
    }

    public void play() {
        System.out.println("Music Play");
    }
    public void pause() {
        System.out.println("Music Pause");
    }
    public void stop() {
        System.out.println("Music Stop");
    }
}
public class InterfaceExample {
    public static void main(String []args) {
        SmartPhone s = new SmartPhone();
        Phone p = s;    //Only Phone Class functionality//
        Icamera c = s;  //Only Camera Interface functionality// Like opening Camera app
        ImusicPlayer m = s; //Only Music Interface functionality// Like opening MusicPlayer app

        p.call();
        p.sms();
        s.videocall();

        c.click();
        c.record();

        m.play();
        m.pause();
        m.stop();
    }
}