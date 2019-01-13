package albumInfoProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Album {

    private String artist;
    private String title;
    private ArrayList<Track> tracks;

    // 2 parameter constructor (String artist, String title)
    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.tracks = new ArrayList<>();
    }

    // constructor taking in imported line from album collection or playlist
    public Album(String importedLine) {
            String[] albumDetails = importedLine.split(" : ");
            this.artist = albumDetails[0];
            this.title = albumDetails[1];
            this.tracks = new ArrayList<>();
        }

    // return album artist
    public String getArtist() { // return the albumArtist
        return this.artist;
    }

    // return album title
    public String getTitle() { // return the albumTitle
        return this.title;
    }

    // return details of the album
    public String getDetails() {
        return artist + " : " + title;
    }

    // return duration of album
    public Duration getDuration() {

        Duration duration = new Duration();

        for (Track track : tracks) {
            duration.add(track.getDuration());
        }
        return duration;
    }

    // return duration of specific track within an album (parameter track name)
    public Duration getDuration(String trackName) {

        Duration duration = new Duration();

        for (Track track : tracks) {
            if (trackName.equals(track.getName())) {
                duration = track.getDuration();
            }
        }
        return duration;

    }

    // add a track to the tracks ArrayList 
    public void addTrack(Track name) {
        tracks.add(name);
    }

    // return the number of tracks in the album
    public int getNumberOfTracks() {
        return tracks.size();
    }

    // return the longest track in the album
    public Track getLongestTrack() {

        Track longestTrack = null;
        int seconds = 0;

        for (Track track : tracks) {
            if (track.toSeconds() > seconds) {
                seconds = track.toSeconds();
                longestTrack = track;
            }
        }
        return longestTrack;
    }
    
    public List<Track> getTracks(){
        return Collections.unmodifiableList(tracks);
    }
    
    // override the equals method. Compares the getDetails method of two albums
    @Override
    public boolean equals(Object other){
        if (!(other instanceof Album)) {
            return false;
        }
        Album otherAlbum = (Album) other;
        return this.getDetails().equals(otherAlbum.getDetails());
    }

    // string builder? What are the benefits? Can trim?
    // convert and return album as string
    @Override
    public String toString() {
        return artist + " : " + title;
    }
}
