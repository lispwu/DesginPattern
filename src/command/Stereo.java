package command;

public class Stereo {
    public void on(){
        System.out.println("turn on the stereo");
    }
    public void off(){
        System.out.println("turn off the stereo");
    }
    public void setCd(){
        System.out.println("play CD~");
    }
    public void setDvd(){
        System.out.println("play DVD~");
    }
    public void setRadio(){
        System.out.println("play Radio~");
    }
    public void setVolume(int volume){
        System.out.println("set volume at " + volume);
    }
}
