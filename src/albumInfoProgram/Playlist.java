package albumInfoProgram;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.comparing;

public class Playlist {

    private AlbumCollection albumCollection;
    private ArrayList<PlaylistTrack> tracks;

    public Playlist(AlbumCollection albumCollection) {
        this.albumCollection = albumCollection;
        this.tracks = new ArrayList<>();
    }

    // constructor taking in an album collection and the playlist file name
    public void read(String fileName) {

        try {

            // import, connect and read whole file in
            // Adapted from pg 454 Sierra and Bates, 2005
            File playlist = new File(fileName);
            FileReader playlistReader = new FileReader(playlist);
            BufferedReader reader = new BufferedReader(playlistReader);

            String line;

            // while the reader can read a line in split the line and remove closing bracket
            // Use the track name and album to get track duration
            // create new PlaylistTrack and add it to ArrayList tracks
            while ((line = reader.readLine()) != null) {

                PlaylistTrack track = CreatePlaylistTrack(line);

                tracks.add(track);
            }

            reader.close();

        } catch (Exception ex) {
            System.out.println("Playlist import was unsuccessful");
        }
    }

    public PlaylistTrack CreatePlaylistTrack(String line) {
        String[] lineInfo = line.replace(")", "").split(" \\(");
        Album album = new Album(lineInfo[1]);
        String trackName = lineInfo[0];
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
    
    // add playlisttrack to playlist
    public void add(PlaylistTrack track) {
        tracks.add(track);
    }

    // remove playlisttrack from playlist (passing a playlisttrack)
    public void remove(PlaylistTrack track) {
        tracks.remove(track);
    }
    
    // remove playlisttrack from playlist (passing a string)
    public void remove(String track){
        PlaylistTrack PLTtrack = CreatePlaylistTrack(track);
        tracks.remove(PLTtrack);       
    }

    // convert and return playlist as string
    @Override
    public String toString() {
        String playlist = "";
        for (PlaylistTrack track : tracks) {
            playlist += track + "\n";
        }
        return playlist;
    }
}
