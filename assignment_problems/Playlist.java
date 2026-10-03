import java.util.Scanner;
import java.util.Arrays;
class Playlist {
    private String[] songs;
    private int songCount;
    public Playlist(int maxSize) {
        this.songs = new String[maxSize];
        this.songCount = 0;
    }
    public void addSong(String title) {
        if (songCount < songs.length) {
            songs[songCount] = title;
            songCount++;
        } else {
            System.out.println("Playlist is full!");
        }
    }
    public String[] getSongs() {
        return Arrays.copyOf(songs, songCount);
    }
    public int getSongCount() {
        return songCount;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maximum playlist capacity: ");
        int cap = sc.nextInt();
        Playlist p = new Playlist(cap);
        System.out.print("How many songs do you want to add now? ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter song title: ");
            String title = sc.next();
            p.addSong(title);
        }
        String[] myCopy = p.getSongs();
        System.out.println("Playlist copy obtained. Total songs added: " + p.getSongCount());
        if (myCopy.length > 0) {
            myCopy[0] = "Hacked";
            System.out.println("Modified copy first element to: " + myCopy[0]);
            System.out.println("Real playlist first element remains: " + p.getSongs()[0]);
        }
        sc.close();
    }
}
