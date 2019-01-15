package albumInfoProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;
import java.util.List;
import static java.util.Comparator.comparing;

public class Playlist {

    private AlbumCollection albumCollection;
    private ArrayList<PlaylistTrack> tracks;

    public Playlist(AlbumCollection albumCollection) {
        this.albumCollection = albumCollection;
        this.tracks = new ArrayList<>();
    }

    // constructor taking in an album collection and the playlist file name
    public int read(File playlist) {

        int issues = 0;
        
        try {
            // import, connect and read whole file in
            // Adapted from pg 454 Sierra and Bates, 2005
            FileReader playlistReader = new FileReader(playlist);
            BufferedReader reader = new BufferedReader(playlistReader);

            String line;

            // while the reader can read a line in split the line and remove closing bracket
            // Use the track name and album to get track duration
            // create new PlaylistTrack and add it to ArrayList tracks
            while ((line = reader.readLine()) != null) {
                PlaylistTrack track = createPlaylistTrack(line);
                if (track.getDuration() != null) {
                    tracks.add(track);
                    issues = 1;
                }
            }           
            reader.close();            
        } catch (Exception ex) {
            issues = 2;
        }
        return issues;
    }

    public PlaylistTrack createPlaylistTrack(String line) {

        String[] parts = line.split("\\)");
        Album album = null;
        String trackName = null;

        if (parts.length == 1) {
            String[] lineInfo = line.replace(")", "").split(" \\(");
            album = new Album(lineInfo[1]);
            trackName = lineInfo[0];
        } else if (parts.length > 1) {
            String albumName = parts[1].substring(2, parts[1].length());
            album = new Album(albumName);
            trackName = parts[0] + ")";
        }

        Duration trackDuration = this.albumCollection.getTrackDuration(album, trackName);
        PlaylistTrack track = new PlaylistTrack(album, trackDuration, trackName);
        return track;
    }

    // return duration of playlist
    public Duration getDuration() {

        Duration duration = new Duration();

        for (PlaylistTrack track : tracks) {
            duration.add(track.getDuration());
        }
        return duration;
    }

    // sorts playlist by track name
    public Playlist sortByTrackName() {
        Collections.sort(tracks, comparing(PlaylistTrack::getName));
        return this;
    }

    // sorts playlist by artist then by album
    public Playlist sortByArtist() {
        Collections.sort(tracks, comparing(PlaylistTrack::getAlbumDetails));
        return this;
    }

    // sorts playlist by album    
    public Playlist sortByAlbum() {
        Collections.sort(tracks, comparing(PlaylistTrack::getAlbumName));
        return this;
    }

    // sorts playlist by track duration
    public Playlist sortByTrackDuration() {
        Collections.sort(tracks, comparing(PlaylistTrack::toSeconds));
        return this;
    }

    public boolean trackExists(PlaylistTrack track) {
        return tracks.contains(track);
    }

// add playlisttrack to playlist
    public void add(PlaylistTrack track) {
        tracks.add(track);
    }

    // remove playlisttrack from playlist (passing a playlisttrack)
    public void remove(int[] trackNumbers) {
        for (int i = trackNumbers.length - 1; i >= 0; i--) {
            tracks.remove(trackNumbers[i]);
        }
    }

    public void clear() {
        tracks.clear();
    }

    // return unmodifiable list of albums
    public List<PlaylistTrack> getTracks() {
        return Collections.unmodifiableList(tracks);
    }

    // convert and return playlist as string
    @Override
    public String toString() {
        String playlist = "";
        for (PlaylistTrack track : tracks) {
            playlist += track.getName() + " (" + track.getAlbumDetails() + ")\n";
        }
        return playlist;
    }
}
