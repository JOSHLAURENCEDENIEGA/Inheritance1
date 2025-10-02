// Step 1: Define the MediaPlayer interface
interface MediaPlayer {
    void playAudio();  // simulate playing audio
    void playVideo();  // simulate playing video
}

//--------------------------------------
// Step 2: Define MP3Player that implements MediaPlayer
class MP3Player implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("MP3Player playing audio.");
    }

    @Override
    public void playVideo() {
        System.out.println("MP3Player cannot play video.");
    }
}

//--------------------------------------
// Step 3: Define MP4Player that implements MediaPlayer
class MP4Player implements MediaPlayer {
    @Override
    public void playAudio() {
        System.out.println("MP4Player playing audio.");
    }

    @Override
    public void playVideo() {
        System.out.println("MP4Player playing video.");
    }
}

//--------------------------------------
// Step 4: Define Device class
class Device {
    private MediaPlayer mediaPlayer;  // private property

    // Constructor
    public Device(MediaPlayer mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
    }

    // Methods
    public void playAudio() {
        mediaPlayer.playAudio();
    }

    public void playVideo() {
        mediaPlayer.playVideo();
    }
}

//--------------------------------------
// Step 5: Main class for testing
public class Main {
    public static void main(String[] args) {
        // Sample Output 1
        System.out.println("Action: Invoking playAudio() and playVideo() methods for MP3Player created with MP3Player().");
        MediaPlayer mp3 = new MP3Player();
        mp3.playAudio();
        mp3.playVideo();

        System.out.println();

        //--------------------------------------
        // Sample Output 2
        System.out.println("Action: Invoking playAudio() and playVideo() methods for MP4Player created with MP4Player().");
        MediaPlayer mp4 = new MP4Player();
        mp4.playAudio();
        mp4.playVideo();

        System.out.println();

        //--------------------------------------
        // Sample Output 3
        System.out.println("Action: Invoking playAudio() and playVideo() methods for Device created with Device(MP3Player) and Device(MP4Player).");
        Device device1 = new Device(new MP3Player());
        device1.playAudio();
        device1.playVideo();

        Device device2 = new Device(new MP4Player());
        device2.playAudio();
        device2.playVideo();
    }
}
