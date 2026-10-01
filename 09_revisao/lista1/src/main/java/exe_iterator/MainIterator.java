package exe_iterator;

public class MainIterator {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        while(playlist.hasNext()) {
            System.out.println(playlist.next());
        }
    }

}
